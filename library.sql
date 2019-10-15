create table genre(
id int primary key auto_increment not null,
genre varchar(30)
);
insert into genre (id, genre)
values
(1,'FANTASY'),
(2,'CLASSIC'),
(3,'DRAMA'),
(4, 'SCIENCE');


create table library.Author
(
    id int primary key auto_increment not null,
    Name VARCHAR(60) ,
    birstDate date ,
    book_id int
);

insert into Author (id, name, birstDate)
values
(1, 'Herbert Schildt', '2051-12-28'),
(2, 'Блинов Игорь Николаевич', '1976-04-03'),
(3,'Толстой Лев Николаевич', '1927-04-17'),
(4, 'Война и мир' , '1828-08-28'),
(5,'Joanne Rowling', '1965-07-31');





create table book
(
id int primary key  auto_increment not null,
bookName varchar(100) ,
author_id int,
genre_ID int ,
ISBN varchar(15),
printDate DATE,
foreign key (author_id)
references author(id)
on delete cascade
on update cascade,
foreign key (genre_id)
references genre(id)
on delete set null
on update cascade
);
insert into book (bookName, author_id, genre_id, ISBN, printDate)
values('Java 8. Полное руководство.' , 1, 4, 13025, '2014-01-01'),
	  ('Java.Методы программирования.' , 2, 4, 13026, '2013-01-01'),
      ('Сто лет одиночества.', 3, 3, 13027, '1967-01-01'),
      ('Война и мир' , 4, 2, 13028, '1869-01-01'),
      ('Гарри Поттер и философский камень', 5, 1, 13029, '2000-01-01'),
      ('Гарри Поттер и узник Азкобана' , 5, 1, 13030,'2003-01-01');create table genre(
id int primary key auto_increment not null,
genre varchar(30)
);
insert into genre (id, genre)
values
(1,'FANTASY'),
(2,'CLASSIC'),
(3,'DRAMA'),
(4, 'SCIENCE');


create table library.Author
(
    id int primary key auto_increment not null,
    Name VARCHAR(60) ,
    birstDate date ,
    book_id int
);

insert into Author (id, name, birstDate)
values
(1, 'Herbert Schildt', '2051-12-28'),
(2, 'Блинов Игорь Николаевич', '1976-04-03'),
(3,'Толстой Лев Николаевич', '1927-04-17'),
(4, 'Война и мир' , '1828-08-28'),
(5,'Joanne Rowling', '1965-07-31');





create table book
(
id int primary key  auto_increment not null,
bookName varchar(100) ,
author_id int,
genre_ID int ,
ISBN varchar(15),
printDate DATE,
foreign key (author_id)
references author(id)
on delete cascade
on update cascade,
foreign key (genre_id)
references genre(id)
on delete set null
on update cascade
);
insert into book (bookName, author_id, genre_id, ISBN, printDate)
values('Java 8. Полное руководство.' , 1, 4, 13025, '2014-01-01'),
	  ('Java.Методы программирования.' , 2, 4, 13026, '2013-01-01'),
      ('Сто лет одиночества.', 3, 3, 13027, '1967-01-01'),
      ('Война и мир' , 4, 2, 13028, '1869-01-01'),
      ('Гарри Поттер и философский камень', 5, 1, 13029, '2000-01-01'),
      ('Гарри Поттер и узник Азкобана' , 5, 1, 13030,'2003-01-01');