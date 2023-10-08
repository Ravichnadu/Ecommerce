drop schema if exists product_ms;
create schema product_ms;

use product_ms;

create table product(

  product_id int primary key,
  
  product_name varchar(50),
  
  product_brand varchar(50),
  
  product_price decimal(10,2),
  
  product_discount decimal(5,2),
  
  product_review varchar(200)
);