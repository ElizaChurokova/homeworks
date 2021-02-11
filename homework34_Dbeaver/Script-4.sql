-- Homework 34
create table visitors(
visitor_id INTEGER primary key,
visitor_full_name VARCHAR(100) not null,
visitor_date_of_birth VARCHAR(50) not null,
visitor_gender VARCHAR(10) not null
);

insert into visitors(visitor_id, visitor_full_name, visitor_date_of_birth, visitor_gender)
values(1, 'Sergey Sergeev', '01.01.1981', 'M'),
(2, 'Ivan Ivanov', '02.02.1982', 'M'),
(3, 'Anna Ahmatova', '03.03.1983', 'F'),
(4, 'Maria Menshova', '04.04.1984', 'F'),
(5, 'Vera Brejneva', '05.05,1985', 'F')

create table visits(
visit_id INTEGER primary key,
visitor_id INTEGER not null references visitors(visitor_id),
visit_time TIMESTAMP not null,
trainer_id INTEGER not null references trainers(trainer_id)
);

insert into visits(visit_id, visitor_id, visit_time, trainer_id)
values(1, 3, '2021-01-01 10:00:00', 1),
(2, 2, '2021-01-01 10:30:00', 2),
(3, 1, '2021-01-02 8:00:00', 3),
(4, 2, '2021-01-02 10:00:00', 4)


--Lesson
create table sport_types(
sport_type_id INTEGER primary key,
sport_type_name VARCHAR(50) unique not null,
salary INTEGER
)

create table trainers(
trainer_id SERIAL primary key, -- serial eto avtomaticheskaya inkrementatsia
trainer_full_name VARCHAR(100) not null,
sport_type_id INTEGER references sport_types(sport_type_id),
phone_number VARCHAR(10), 
inn INTEGER unique not null
)

insert into sport_types(sport_type_id, sport_type_name, salary)
values(1, 'Football', 200)
insert into sport_types(sport_type_id, sport_type_name)
values(2, 'Volleyball')

update sport_types set salary = 190 where sport_type_id = 2

insert into sport_types
values (3, 'Basketball', 250),
(4,'Swimming', 300)

alter table trainers 
alter column inn type VARCHAR(15)

insert into trainers (trainer_full_name, sport_type_id, phone_number, inn)
values ('Eliza Churokova', 3, '0551435495', '11411111111111')
insert into trainers (trainer_full_name, sport_type_id, phone_number, inn)
values ('Ermek Karypbekov', 3, '0551111111', '11422222222222'),
('Ermek Nakypov', 2, '0555555555', '21436587091111'),
('Chyngyaz Uson uulu', 1, '0555666666', '1234567891112'),
('Rauan Maksut', 1, '0555777777', '22222222222222'),
('Evelina An', 4, '0555888888', '33333333333333'),
('Artur Aspekov', 4, '0555999999', '44444444444444')
insert into trainers (trainer_full_name, sport_type_id, phone_number, inn)
values ('Ivan Ivanov', 1, '0551511111', '11622278222222')

select trainer_id, trainer_full_name from trainers
where trainer_id < 5
and trainer_full_name like '%ova'

select * from trainers t
join sport_types s on s.sport_type_id = t.sport_type_id
where s.salary >= 250

update sport_types 
set salary = salary *2

delete from trainers 
where trainer_id = 9

delete from trainers
where trainer_id = 10
