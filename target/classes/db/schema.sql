create database centroComercial;
use centroComercial;

create table Productos(
id_productos int(10) primary key auto_increment,
nombre_producto varchar(255))engine=innodb;

create table clientes(
id_clientes int(10) primary key auto_increment,
nombre_clientes varchar(255))engine=innodb;

create table Pedidos(
id_pedidos int(10) primary key auto_increment,
fecha_pedido varchar(255),
nota varchar(255),
foreign key(id_productos)references Productos(id_productos),
foreign key(id_clientes)references Clientes(id_clientes))engine=innodb;
