
DROP table IF EXISTS departamentos;
DROP table IF EXISTS empleados;

create table departamentos(
	codigo_departamento int auto_increment primary key,
	nombre varchar(100),
	presupuesto int
);

create table empleados(
	dni varchar(8) primary key,
	nombre varchar(100),
	apellidos varchar(255),
	codigo_departamento int,
	foreign key (codigo_departamento) references departamentos(codigo_departamento) on delete cascade on update cascade
);

insert into departamentos (nombre, presupuesto) values ('Departamento 1', 10000);
insert into departamentos (nombre, presupuesto) values ('Departamento 2', 20000);
insert into departamentos (nombre, presupuesto) values ('Departamento 3', 30000);
insert into departamentos (nombre, presupuesto) values ('Departamento 4', 40000);
insert into departamentos (nombre, presupuesto) values ('Departamento 5', 50000);

insert into empleados (dni, nombre, apellidos, codigo_departamento) values ('11111111', 'Nombre 1', 'Apellidos 1', 1);
insert into empleados (dni, nombre, apellidos, codigo_departamento) values ('22222222', 'Nombre 2', 'Apellidos 2', 2);
insert into empleados (dni, nombre, apellidos, codigo_departamento) values ('33333333', 'Nombre 3', 'Apellidos 3', 3);
insert into empleados (dni, nombre, apellidos, codigo_departamento) values ('44444444', 'Nombre 4', 'Apellidos 4', 4);
insert into empleados (dni, nombre, apellidos, codigo_departamento) values ('55555555', 'Nombre 5', 'Apellidos 5', 5);
