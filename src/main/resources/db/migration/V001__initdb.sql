create table bike (id bigint not null auto_increment, brand varchar(255), type varchar(255), primary key (id)) 
engine=InnoDB;

create table part (bike_id bigint not null, id bigint not null auto_increment, brand varchar(255) not null, 
part varchar(255) not null, part_description varchar(255) not null, primary key (id)) 
engine=InnoDB;

alter table part add constraint FKsdvoqwi2ij47lu68apw3iixdd foreign key (bike_id) references bike (id);
