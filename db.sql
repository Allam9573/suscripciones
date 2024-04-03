create database suscripciones;
use suscripciones;
create table direccionfacturacion(
	iddireccion int primary key auto_increment,
    pais varchar(20),
    estado varchar(20),
    ciudad varchar(20)
);
create table usuarios(
	codigousuario int primary key auto_increment,
    nombre varchar(20),
    apellido varchar(20),
    correo varchar(20),
    telefono varchar(20),
    iddireccion int,
    foreign key(iddireccion) references direccionfacturacion(iddireccion)
);

create table tipostreaming(
	idstreaming int primary key auto_increment,
	descripcion varchar(50)
);

create table planes(
	idplan int primary key auto_increment,
    descripcion varchar(100),
    precio decimal(10,2),
    idstreaming int,
    foreign key(idstreaming) references tipostreaming(idstreaming)
);

select * from usuarios;
select * from suscripciones.tipostreaming;
select * from suscripciones.planes;
select * from suscripciones.direccionfacturacion;