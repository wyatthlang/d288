
drop database `full-stack-ecommerce`;
create database `full-stack-ecommerce`;
use `full-stack-ecommerce`;

source ".\full-stack-ecommerce_vacations.sql";
source ".\full-stack-ecommerce_countries.sql";
source ".\full-stack-ecommerce_divisions.sql";
source ".\full-stack-ecommerce_carts.sql";
source ".\full-stack-ecommerce_customers.sql";
source ".\full-stack-ecommerce_excursions.sql";
source ".\full-stack-ecommerce_cart_items.sql";
source ".\full-stack-ecommerce_excursion_cartitem.sql";

source ".\full-stack-ecommerce_insert.sql";
