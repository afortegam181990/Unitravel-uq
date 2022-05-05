insert into usuario values ("9223","laura@gmail.com","Laura","1111");
insert into usuario values ("1223","pepe@gmail.com","pepito","3434");
insert into usuario values ("5453","pepito@gmail.com","pepito","45545");
insert into usuario values ("5656","luis@gmail.com","luis","sdsd");
insert into usuario values ("6767","juana@gmail.com","juana","sdh728");

inser into usuario_telefono values ("9223", "727272");
inser into usuario_telefono values ("5656", "727272");
inser into usuario_telefono values ("6767", "345353");
inser into usuario_telefono values ("5453", "454546");

insert into administrador_hotel values ("5454","admin1@gmail.com","Admi 1","sdh728");
insert into administrador_hotel values ("6654","admin2@gmail.com","Admi 2","fg45dd");

insert into ciudad values (1,"Armenia");
insert into ciudad values (2,"Pereira");
insert into ciudad values (3,"Bogota");

insert into hotel values (1,"calle 123", "Hotel 5H",5,"87387378","5454",1);
insert into hotel values (2,"calle 5 # 12-19", "Hotel econo",3,"43434","6654",2);
insert into hotel values (3,"carrera 1 # 12-11", "Ultralujo",5,"6363","6654",3);
insert into hotel values (4,"calle 124", "Hotel 4H",4,"3434","5454",1);

insert into habitacion values (1, 3, 101, 350000, 1);
insert into habitacion values (2, 2, 201, 750000, 1);
insert into habitacion values (3, 4, 101, 950000, 2);

insert into habitacion_camas values (1,"SENCILLA");
insert into habitacion_Camas values (1, "DOBLE");
insert into habitacion_Camas values (2, "DOBLE");
insert into habitacion_Camas values (3, "DOBLE");
insert into habitacion_Camas values (3, "DOBLE");

insert into caracteristica values (1, "Piscina", "HO");
insert into caracteristica values (2, "Buffet", "HO");
insert into caracteristica values (3, "Aire acondicionado", "HA");
insert into caracteristica values (4, "DirecTV", "HA");

insert into habitacion_caracteristicas values (1, 1);
insert into habitacion_caracteristicas values (2, 3);
insert into habitacion_caracteristicas values (3, 3);

insert into hotel_caracteristicas values (1, 1);
insert into hotel_caracteristicas values (1, 2);
insert into hotel_caracteristicas values (2, 1);

insert into reserva values (1,2, "2022-04-27", "2022-04-22","2022-03-24","1223");
insert into reserva values (1,2, "2022-05-10", "2022-04-29","2022-03-22","5656");
insert into reserva values (3,2, "2022-05-27", "2022-05-22","2022-03-24","1223");

insert into reserva_habitacion values (1,750000, 2, 1);
insert into reserva_habitacion values (2,350000, 1, 2);

insert into vuelo values ("AJ6B","Avianca","Programado", 1, 3);
insert into vuelo values ("P9BV","Viva air","Programado", 3, 2);

inser into silla values (1, "Ventana", 95000);
inser into silla values (2, "Centro", 93000);
inser into silla values (3, "Pasillo", 91000);

insert into vuelo_sillas values ("AJ6B", 1);
insert into vuelo_sillas values ("AJ6B", 2);
insert into vuelo_sillas values ("AJ6B", 3);
insert into vuelo_sillas values ("P9BV", 2);

insert into comentario values (1, 4, "2022-04-27" , "Este hotel es muy bueno" , 1,"1223");
insert into comentario values (2, 3, "2022-03-10" , "No habia agua caliente y me da rinitis" , 3, "5656");
insert into comentario values (3, 3, "2022-03-10" , "No habia agua caliente y me da rinitis" , 2, "5656");

