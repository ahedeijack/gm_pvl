drop schema storage_pvl;
create database storage_pvl;

use storage_pvl;
 
CREATE TABLE producto (
    id_prod BigInt NOT NULL AUTO_INCREMENT,
    nombre_prod VARCHAR(255) NOT NULL,
    fk_marca BigInt NOT NULL,
    fk_categoria BigInt NOT NULL,
    existencias_prod INT NOT NULL,
    codigo_prod VARCHAR(18),
    precio_prod FLOAT NOT NULL,
    PRIMARY KEY (id_prod)
);

create table cliente(
id_cte BigInt NOT NULL AUTO_INCREMENT,
nombre_cte varchar(255) not null,
app_cte varchar(255),
apm_cte varchar(255),
compras_cte int not null,
correo_cte varchar(255),
primary key(id_cte)
);

CREATE TABLE empleado (
    id_emp BigInt NOT NULL AUTO_INCREMENT,
    nom_emp VARCHAR(18) NOT NULL,
    app_emp VARCHAR(18),
    apm_emp VARCHAR(18),
    correo_emp VARCHAR(40) NOT NULL,
    contrasena_emp VARCHAR(40) NOT NULL,
    tel_emp VARCHAR(15),
    PRIMARY KEY (id_emp)
);


CREATE TABLE marca (
    id_marca BigInt NOT NULL AUTO_INCREMENT,
    nombre_marca VARCHAR(18) NOT NULL,
    fk_prov BigInt NOT NULL,
    PRIMARY KEY (id_marca)
);

CREATE TABLE proveedor (
    id_prov BigInt NOT NULL AUTO_INCREMENT,
    nombre_prov VARCHAR(80) NOT NULL,
    direccion_prov VARCHAR(255),
    PRIMARY KEY (id_prov)
);

CREATE TABLE categoria (
    id_categoria BigInt NOT NULL AUTO_INCREMENT,
    nombre_categoria VARCHAR(18) NOT NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE ticket (
    id_ticket BigInt NOT NULL AUTO_INCREMENT,
    fk_trans BigInt NOT NULL,
    PRIMARY KEY (id_ticket)
);

CREATE TABLE transaccion (
    id_trans BigInt NOT NULL PRIMARY KEY,
    total_trans FLOAT NOT NULL,
    fk_cte BigInt NOT NULL,
    fk_emp BigInt NOT NULL
);

/* tabla destino -> tabla origen  */
alter table producto add foreign key(fk_marca) references marca(id_marca) on update cascade on delete cascade;
alter table producto add foreign key(fk_categoria) references categoria(id_categoria) on update cascade on delete cascade; 

alter table marca add foreign key (fk_prov) references proveedor(id_prov) on update cascade on delete cascade;

alter table ticket add foreign key (fk_trans)references transaccion(id_trans) on update cascade on delete cascade; 

alter table transaccion add foreign key (fk_cte) references cliente(id_cte) on update cascade on delete cascade;
alter table transaccion add foreign key (fk_emp) references empleado(id_emp) on update cascade on delete cascade; 
-- alter table transaccion add foreign	key (fk_ticket) references ticket(id_ticket) on update cascade on delete cascade; --

select * from categoria;
insert into categoria (nombre_categoria) values ('Bebidas');
insert into categoria (nombre_categoria) values ('Frutas y verduras');
insert into categoria (nombre_categoria) values ('Pasteleria');
insert into categoria (nombre_categoria) values ('Carnes y pescados');
insert into categoria (nombre_categoria) values ('Lacteos y huevos');
insert into categoria (nombre_categoria) values ('Licores');
insert into categoria (nombre_categoria) values ('Cuidado personal');
insert into categoria (nombre_categoria) values ('Despensa');

select * from proveedor;
insert into proveedor (nombre_prov, direccion_prov) values ('Otro','Sin direccion');
insert into proveedor (nombre_prov, direccion_prov) values ('Quimilag(Químicos de la Laguna)','Av
Prolongación Francisco I. Madero #3073
Abraham Rosales
35019 Gómez Palacio, Dgo.
México');
insert into proveedor (nombre_prov, direccion_prov) values ('Comercial Sierra Madre S.A. de C.V.','MERCADO DE ABASTOS,
 BODEGA/10 Y 11, EL REFUGIO, DURANGO, DGO, C.P. 34170');
 insert into proveedor (nombre_prov, direccion_prov) values ('Modelorama',' BLVD LAGUNA SUR ZARAGOZA SUR, 27280 Torreón, Coah');
insert into proveedor (nombre_prov, direccion_prov) values ('Pasteleria Lety S.A.',' BLVD. MIGUEL ALEMAN PTE. CAMPESTRE, Gomez Palacio, Dgo.');
insert into proveedor (nombre_prov, direccion_prov) values ('Carnes y Visceras de Res',' Poniente Bodega 56, Fraccionamiento del Valle, 35078 Gómez Palacio, Dgo.');
insert into proveedor (nombre_prov, direccion_prov) values ('Impulsora Sahuayo',' Paseo de los Tamarindos No.90, Bosques de las Lomas, Torre 1, piso 9, C.P. 05120, Cuajimalpa, Ciudad de México.');
 insert into proveedor (nombre_prov, direccion_prov) values ('Sociedad cooperativa Trabajadores de Pascual SCL','Blvrd de la Juventud 433,
 Col del Maestro, 34240 Durango, Dgo.');


select * from marca;
insert into marca (nombre_marca, fk_prov) values('Otra', 1);
insert into marca (nombre_marca, fk_prov) values('Nestle', 2);
insert into marca (nombre_marca, fk_prov) values('Cocacola', 2);
insert into marca (nombre_marca, fk_prov) values('Mur', 5);
insert into marca (nombre_marca, fk_prov) values('Pepsico', 2);
insert into marca (nombre_marca, fk_prov) values('Quaker', 2);
insert into marca (nombre_marca, fk_prov) values('Corona', 3);
insert into marca (nombre_marca, fk_prov) values('Aurrera', 2);
insert into marca (nombre_marca, fk_prov) values('Santa Clara', 6);
insert into marca (nombre_marca, fk_prov) values('Ace', 1);
insert into marca (nombre_marca, fk_prov) values('Pinol', 1);
insert into marca (nombre_marca, fk_prov) values('Lety', 4);
insert into marca (nombre_marca, fk_prov) values('Santa Clara', 6);

select * from producto;
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Guayaba',1,1,500,'5234566789101112',1.9);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Tostadas',1,1,20,'5234566789101113',26.0);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Huevo San Juan Cartera',13,6,10,'5234566789101114',77);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Huevo San Juan KG',13,6,11,'5234566789101115',46);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Agua Ciel 1Lt',2,3,54,'5234566789101116',11);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('CocaCola 600ml',3,1,80,'5234566789101117',10);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('CocaCola 1Lt',3,1,100,'5234566789101118',18);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Buchanas Gde',3,2,10,'5234566789101119',220);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Desodorante',5,1,10,'5234566789101121',26);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Arroz',3,6,40,'5234566789101122',19);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('NesCafe Original',1,1,20,'5234566789101123',29);
insert into producto (nombre_prod, fk_marca, fk_categoria, existencias_prod, codigo_prod, precio_prod)
values ('Prueba nuls',1,1,20,'',29);

select * from cliente;
insert into cliente (nombre_cte, app_cte, apm_cte, compras_cte, correo_cte) values ('Publico','General','',1,'miEmpresa@outlook.com');
insert into cliente (nombre_cte, app_cte, apm_cte, compras_cte, correo_cte) values ('Juan','Garcia','Limones',4,'');
insert into cliente (nombre_cte, app_cte, apm_cte, compras_cte, correo_cte) values ('Carlos','Vazquez','Aguirre',8,'');
insert into cliente (nombre_cte, app_cte, apm_cte, compras_cte, correo_cte) values ('Ivan','Gonzalez','Ruiz',122,'');
insert into cliente (nombre_cte, app_cte, apm_cte, compras_cte, correo_cte) values ('Raul','Quintana','Roo',2,'');

select * from empleado;
insert into empleado (nom_emp, app_emp, apm_emp, correo_emp, contrasena_emp, tel_emp) values ('Mayelea Ester',
'De Santiago','Barragan','mayela@outlook.com', '12345678', '8712395965');
insert into empleado (nom_emp, app_emp, apm_emp, correo_emp, contrasena_emp, tel_emp) values ('Juan','Yañez',''
,'yanez@outlook.com', '12345678', '8712395966');
insert into empleado (nom_emp, app_emp, apm_emp, correo_emp, contrasena_emp, tel_emp) values ('Jose Misael','Adame','Sandoval'
,'elmejorsoy10@outlook.com', '12345678', '8712395967');
insert into empleado (nom_emp, app_emp, apm_emp, correo_emp, contrasena_emp, tel_emp) values ('Mar','Alaniz',''
,'marcito@outlook.com', '12345678', '8712395968');

