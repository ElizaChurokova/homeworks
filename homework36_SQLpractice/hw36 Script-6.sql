--HW36
--
select * from customer
where country in ('Spain', 'Italy', 'France', 'Germany')
order by country asc 
--
select * from customer
where first_name like 'Jo%'

-- mistake ne mogu ponyat pochemu ne vyhodyat? mojete obyasnit vo vremya consultatsii?
select * from customer
where substring(first_name, -1) = 'a' and length(first_name) = 4

--
select count(id) as "Count customer by country", country 
from customer 
group by country
--
select count(id) as "Count customer by country", country 
from customer
group by country 
order by "Count customer by country" desc
--
select count (total_amount) as "Order quantity", sum(total_amount) as "Orders sum", customer_id  
from orders
group by customer_id
order by "Orders sum" desc

--mistake. ne mogu ponyat pochemu ne vyhodit
select count(total_amount) as "Order quantity", sum(total_amount) as "Orders sum", customer_id 
from orders
  --where "Order quantity" > 20
group by customer_id
having orders.total_amount > 20 
--where customer_id > 20;

--
select count(city), country
from customer
group by country

--
select o.id order_id, c.first_name, c.last_name, c.city, p.product_name, p.unit_price, s.company_name
from orders o
join customer c on c.id= o.customer_id 
join order_item oi on oi.order_id = o.id
join product p on p.id = oi.product_id
join supplier s on s.id = p.supplier_id 



--ne znayu pravilno li zdelala,pochemu to  nichego ne vyhodit
select company_name
from product p
join supplier s on (s.id = p.supplier_id)
where supplier_id is null

--
select product_id  as "ordered product id", product.product_name
from order_item oi 
join product on (product.id=oi.product_id) 

--
select product_id is null as "not ordered", product.product_name
from order_item oi 
join product on (product.id=oi.product_id)


--Lesson
select max(total_amount) as "Maximum price"
from orders

--
select sum(total_amount) as "Sum"
from orders

--
select sum(total_amount) as "Sum of orders for 2014"
from orders
where extract(year from order_date) = 2014

--
select round (avg(total_amount), 2) as "Average price of arders"
from orders

--shagi
select o.customer_id, c.first_name, c.last_name, avg(o.total_amount) as "Average price" 		--5
from orders o								--1
join customer c on c.id = o.customer_id		--2
where c.first_name = 'Paul' --3
group by o.customer_id, c.first_name, c.last_name	4
having avg(o.total_amount) < 1000	--6
order by c.first_name				--7

--
select *
from customer c 
--where country ='Spain'or country = 'Brazil' 
where country in('Brazil', 'Spain')

--
select *
from orders 
where extract(year from order_date) between 2013 and 2014
and total_amount < 100

--
select distinct c.country
from customer c
join supplier s on s.country = c.country 

--





/*==============================================================*/
/* table: customer                                              */
/*==============================================================*/
create table customer (
   id                   int                  primary key,
   first_name           varchar(100)         not null,
   last_name            varchar(100)         not null,
   city                 varchar(100)         null,
   country              varchar(100)         null,
   phone                varchar(100)         null

);

/*==============================================================*/
/* table: supplier                                              */
/*==============================================================*/
create table supplier (
   id                    int                  primary key,
   company_name          varchar(100)         not null,
   contact_name          varchar(100)         null,
   contact_title         varchar(100)         null,
   city                  varchar(100)         null,
   country               varchar(100)         null,
   phone                 varchar(100)         null,
   fax                   varchar(100)         null
);

/*==============================================================*/
/* table: product                                               */
/*==============================================================*/
create table product (
   id                    int                  primary key,
   product_name          varchar(100)         not null,
   unit_price            decimal(12,2)        null default 0,
   package               varchar(100)         null,
   is_discontinued       boolean              not null default false,
   supplier_id           int                  references supplier(id) not null
);


/*==============================================================*/
/* table: orders                                               */
/*==============================================================*/
create table orders (
   id                    int                  primary key,
   order_date            timestamp            not null default now(),
   order_number          varchar(100)         null,
   total_amount          decimal(12,2)        null default 0,
   customer_id           int                  references customer(id) not null
);

/*==============================================================*/
/* table: orderitem                                             */
/*==============================================================*/
create table order_item (
   id                    int                  primary key,
   unit_price            decimal(12,2)        not null default 0,
   quantity              int                  not null default 1,
   order_id              int                  references orders(id) not null,
   product_id            int                  references product(id) not null
);

select * from supplier;
select * from product;
select * from orders;
select * from customer;




drop table order_item;
drop table orders;
drop table orders;
drop table product;
drop table supplier;
drop table customer;