-- created by Roman Kraskovskiy

drop table authorities;
drop table cart_products;
drop table products;
drop table category;
drop table product_attribute_value;
drop table attribute;
drop table cart;
drop table shop_users;

-- creating tables
create table shop_users (login varchar2(20) primary key,password varchar2(20),phone varchar2(9),e_mail varchar2(50));
create table authorities (user_role varchar2(10) primary key,login varchar2(20),authority varchar2(15));
create table cart(cart_id number primary key,login varchar2(20));
create table cart_products(cart_products_id number primary key,cart_id number,product_id number,quanitity number);
create table products(product_id number primary key,category_id number,name varchar2(50),author varchar2(50),parent_id number, price number,quanitity number,year_date date);
create table category (category_id number primary key,category_name varchar2(20),parent_category_id number);
create table product_attribute_value(product_attribute_value_id number primary key,product_id number,attribute_id number,this_value varchar2(10));
create table attribute(attribute_id number primary key,attribute_name varchar2(20));

-- adding references(foreign keys)
alter table authorities add  foreign key (login) references shop_users (login);
alter table cart add  foreign key (login) references shop_users (login);
alter table cart_products add  foreign key (cart_id) references cart (cart_id);
alter table cart_products add  foreign key (product_id) references products (product_id);
alter table products add  foreign key (category_id) references category (category_id);
alter table product_attribute_value add  foreign key (product_id) references products (product_id);
alter table product_attribute_value add  foreign key (attribute_id) references attribute (attribute_id);
alter table category add UNIQUE (category_id,parent_category_id);