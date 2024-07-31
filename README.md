# Prueba Tecnica Codigos EAN Mercadona

* Realizada entre los dias 29/07/2024 y 31/07/2024

### Swagger de Codigos EAN Api

* [URL de Api rates en OpenApi](http://localhost:8081/swagger-ui/swagger-ui/index.html)

### Informacion sobre el proyecto

* Version de Java utilizada: 17
* Tener disponible el puerto 8081
* Maven

### Datos de conexion a BD Postgresql en el application.properties
* spring.datasource.url=jdbc:postgresql://localhost:5432/mercadona
* spring.datasource.username=postgres
* spring.datasource.password=admin

### Inserts a la BD para completar las tablas Provider, Product y Destination

INSERT INTO Provider (CODIGO_PROVEEDOR,NOMBRE_PROVEEDOR,FECHA_CREACION) VALUES (8437008,'Hacendado','2024-07-29');
INSERT INTO Provider (CODIGO_PROVEEDOR,NOMBRE_PROVEEDOR,FECHA_CREACION) VALUES (8480013,'Proveedor Externo','2024-07-29');

INSERT INTO Product (CODIGO_PRODUCTO,NOMBRE_PRODUCTO,FECHA_CREACION) VALUES (15398,'Pizza 4 Quesos','2024-07-29');
INSERT INTO Product (CODIGO_PRODUCTO,NOMBRE_PRODUCTO,FECHA_CREACION) VALUES (22678,'Agua Mineral','2024-07-29');
INSERT INTO Product (CODIGO_PRODUCTO,NOMBRE_PRODUCTO,FECHA_CREACION) VALUES (79361,'Chocolate Negro','2024-07-29');

INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (1,'Mercadona España','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (2,'Mercadona España','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (3,'Mercadona España','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (4,'Mercadona España','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (5,'Mercadona España','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (6,'Mercadona Portugal','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (8,'Almacenes','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (9,'Oficina Mercadona','2024-07-30');
INSERT INTO Destination (CODIGO_DESTINO,NOMBRE_DESTINO,FECHA_CREACION) VALUES (0,'Colmenas','2024-07-30');