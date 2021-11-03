create schema DB_Gestion_Educativa;
use DB_Gestion_Educativa;

#TABLAS
create table carrera (
	id int primary key auto_increment not null,
    nombre nvarchar(50) not null,
    estado bit not null
);

create table materia (
	id int primary key auto_increment not null,
    nombre nvarchar(50) not null,
    estado bit not null,
    id_carrera int not null,
    foreign key (id_carrera) references carrera(id)
);

create table tipo_usuario(
	id int primary key auto_increment not null,
    nombre_tipo nvarchar(10)
);

create table usuario (
	id int primary key auto_increment not null,
    user_name nvarchar(50) not null,
    pass nvarchar(50) not null,
    tipo int not null,
    token varchar(10),
    estado bit not null,
    foreign key (tipo) references tipo_usuario(id)
);

create table docente (
	id int primary key auto_increment not null,
    legajo nvarchar(10) not null unique,
    dni nvarchar(10) not null unique,
    nombre nvarchar(15) not null,
    apellido nvarchar(15) not null,
    fecha_nac date not null,
    adress nvarchar(20) not null,
    provincia nvarchar(20) not null,
    localidad nvarchar(20) not null,
    pais nvarchar(20) not null,
    email nvarchar(50) not null,
    tel nvarchar(20) not null,
    estado bit not null
);

create table alumno (
	id int primary key auto_increment not null,
    legajo nvarchar(10) not null unique,
    dni nvarchar(10) not null unique,
    nombre nvarchar(15) not null,
    apellido nvarchar(15) not null,
    fecha_nac date not null,
    adress nvarchar(20) not null,
    provincia nvarchar(20) not null,
    localidad nvarchar(20) not null,
    pais nvarchar(20) not null,
    email nvarchar(50) not null,
    tel nvarchar(20) not null,
    estado bit not null
);

create table curso (
	id int primary key auto_increment not null,
    nombre nvarchar(15) not null,
    semestre nvarchar(20) not null,
    anio nvarchar(4) not null,
    id_docente int not null,
    id_materia int not null,
    foreign key (id_docente) references docente(id),
    foreign key (id_materia) references materia(id),
    estado bit not null
);

create table alumnos_x_curso(
	id_alumno int not null, 
    id_curso int not null,
	foreign key (id_alumno) references alumno(id),
    foreign key (id_curso) references curso(id),
    primary key(id_alumno, id_curso)
);

create table pais(
	id int primary key auto_increment not null,
    nombre nvarchar(50) not null
);

create table provincia(
	id int primary key auto_increment not null,
	nombre nvarchar(50) not null,
    id_pais int not null,
    foreign key (id_pais) references pais(id)
);

create table localidad(
	id int primary key auto_increment not null,
	nombre nvarchar(50) not null,
    id_provincia int not null,
    foreign key (id_provincia) references provincia(id)
);

create table calificacion_x_alumno(
	id int primary key auto_increment not null,
    id_alumno int not null,
    id_curso int not null,
    parcial_1 smallint,
    parcial_2 smallint,
    recuperatorio_1 smallint,
    recuperatorio_2 smallint,
    estado_academico bit not null,
    foreign key (id_alumno) references alumno(id),
    foreign key (id_curso) references curso(id)
);

#INSERTS



