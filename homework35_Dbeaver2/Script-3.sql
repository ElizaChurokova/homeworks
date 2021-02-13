--Homework 35: TASK B
create table subjects(
subject_id INTEGER primary key,
subject_name VARCHAR(50) not null
);
insert into subjects(subject_id, subject_name)
values(1, 'Econometrics'), (2, 'Management'), (3, 'Statistics'), (4, 'Financial Management'), (5, 'Economy'), (6, 'Real estate management') 

create table universities(
university_id INTEGER primary key,
university_name VARCHAR(50) not null
);
insert into universities(university_id, university_name)
values(1, 'KRSU'), (2, 'AUCA'), (3, 'MANAS'), (4, 'ATA TURK'), (5, 'ARABAEV')

create table departments(
department_id INTEGER primary key,
department_name VARCHAR(50) not null,
university_id INTEGER references universities(university_id)
);
insert into departments (department_id, department_name, university_id)
values(1, 'Management', 2), (2, 'Business Management', 1), (3, 'Economics', 3), (4, 'Finance', 5)

create table groupss(           --?? ?????? ????? ????? group ???????? ????????
group_id INTEGER primary key,
department_id INTEGER references departments(department_id), 
group_code VARCHAR(20) unique not null
);
insert into groupss(group_id, department_id, group_code)
values(1, 2, 'GROUP_1A99'), (2, 3, 'GROUP_2A99'), (3, 1, 'GROUP_1B98'), (4, 4, 'GROUP_1C97')

create table students(
student_id INTEGER primary key,
student_full_name VARCHAR(50) not null,
group_id INTEGER references groupss(group_id),
student_date_of_birth TIMESTAMP not null
);
insert into students(student_id, student_full_name, group_id, student_date_of_birth)
values(1, 'Maria Marchenko', 1, '1985-01-01'), 
(2, 'Anna Savinyh', 2, '1982-02-02'), 
(3, 'Nilufar Bahromzoda', 4, '1990-03-03'),
(4, 'Ashat Galiev', 3, '1984-04-04'),
(5, 'Roman Rustamov', 1, '1985-05-05'),
(6, 'Daniil Mirov', 3, '1992-06-06')

create table grades(
student_id INTEGER references students(student_id),
grade INTEGER,
subject_id INTEGER references subjects(subject_id)
);
insert into grades(student_id, grade, subject_id)
values(1, 4, 5), (2, 3, 6), (3, 5, 1), (4, 5, 2), (5, 4, 1), (6, null, 2)

-- ??????? ?????????????? ??????:
select Avg(Grade) from Grades  

-- ???? ?? ????????
select s.student_full_name, g.group_code, d.department_name, u.university_name
from students s
join groupss g on g.group_id = s.group_id 
join departments d on d.department_id = g.department_id 
join universities u on u.university_id = d.university_id 



-- Homework 35: TASK ?
select s.visitor_full_name, 
t.trainer_full_name, v.visit_time
from visits v
join visitors s on s.visitor_id = v.visitor_id
join trainers t on v.trainer_id = t.trainer_id
where t.sport_type_id = 4
order by v.visit_time desc 

select v.visit_id, t.trainer_full_name, st.sport_type_name 
from visits v
join trainers t on t.trainer_id = v.trainer_id
join sport_types st on st.sport_type_id = t.sport_type_id 

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

insert into visits(visit_id, visitor_id, visit_time, trainer_id)
values(5, 4, '2021-01-01 10:00:00', 6)

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

--insert into sport_types(sport_type_id, sport_type_name, salary)	!?? ?????? ?????? ???? ??? ?? ??????????, ???? ? ??????????? ? ?????????? ???????, ??? ??? ?????????? ??? ???????
--values(1, 'Football', 200) insert into sport_types(sport_type_id, sport_type_name) values(2, 'Volleyball')

insert into sport_types(sport_type_id, sport_type_name, salary)
values(1, 'Football', 200),
(2, 'Volleyball', 190),
(3, 'Basketball', 250),
(4, 'Swimming', 300)

--update sport_types set salary = 190 where sport_type_id = 2 insert into sport_types values (3, 'Basketball', 250), (4,'Swimming', 300)

alter table trainers 
alter column inn type VARCHAR(15)

insert into trainers (trainer_full_name, sport_type_id, phone_number, inn)
values ('Eliza Churokova', 3, '0551435495', '11411111111111'),
 ('Ermek Karypbekov', 3, '0551111111', '11422222222222'),
('Ermek Nakypov', 2, '0555555555', '21436587091111'),
('Chyngyaz Uson uulu', 1, '0555666666', '1234567891112'),
('Rauan Maksut', 1, '0555777777', '22222222222222'),
('Evelina An', 4, '0555888888', '33333333333333'),
('Artur Aspekov', 4, '0555999999', '44444444444444')


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