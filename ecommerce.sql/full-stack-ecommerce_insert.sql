
create database `full-stack-ecommerce`;
use `full-stack-ecommerce`;

delete from vacations;
delete from excursions;

insert into vacations values (
  default, 
  default, 
  "Visit the beautiful country of Italy", 
  "https://images.unsplash.com/photo-1515859005217-8a1f08870f59?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1110&q=80", 
  default, 
  1000, 
  "Italy"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful country of Greece",
  "https://images.unsplash.com/photo-1533105079780-92b9be482077?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80",
  default,
  1500,
  "Greece"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful country of France",
  "https://images.unsplash.com/photo-1502602898657-3e91760cbb34?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1473&q=80",
  default,
  1500,
  "France"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful country of Belgium",
  "https://images.unsplash.com/photo-1491557345352-5929e343eb89?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  1500,
  "Belgium"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful country of Brazil",
  "https://images.unsplash.com/photo-1483729558449-99ef09a8c325?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  1500,
  "Brazil"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful state of South Dakota",
  "https://images.unsplash.com/photo-1605801495512-f47a64d01f4f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1472&q=80",
  default,
  1500,
  "South Dakota"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful city of Nashville",
  "https://images.unsplash.com/photo-1545419913-775e3e82c7db?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1636&q=80",
  default,
  1500,
  "Nashville"
);

insert into vacations values (
  default,
  default,
  "Visit the beautiful state of Wisconsin",
  "https://images.unsplash.com/photo-1566419808810-658178380987?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1471&q=80",
  default,
  1500,
  "Wisconsin"
);

insert into excursions values (
  default,
  default,
  100,
  "Cheese Tour",
  "https://images.unsplash.com/photo-1631379578550-7038263db699?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1474&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  75,
  "Bicycle Tour",
  "https://images.unsplash.com/uploads/14122621859313b34d52b/37e28531?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1473&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  250,
  "Spa Treatment",
  "https://images.unsplash.com/photo-1620733723572-11c53f73a416?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=687&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  100,
  "Historic Tour",
  "https://images.unsplash.com/photo-1479142506502-19b3a3b7ff33?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  25,
  "Boat Ride",
  "https://images.unsplash.com/photo-1587252337395-d02401a8a814?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1026&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  500,
  "Horseback Riding Lesson",
  "https://images.unsplash.com/photo-1598810577851-34982c359155?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  120,
  "Zip Lining",
  "https://images.unsplash.com/photo-1625076307714-a5cd1b2beb4f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into excursions values (
  default,
  default,
  150,
  "Dinner and a Show",
  "https://plus.unsplash.com/premium_photo-1661774645265-ce387923cb5b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1470&q=80",
  default,
  (select vacation_id from vacations where vacation_title = "Italy")
);

insert into customers values (
  default,
  default,
  default,
  "John",
  "Doe",
  default,
  default,
  "12345",
  default
);

insert into carts values (
  default,
  default,
  default,
  default,
  default,
  0,
  (select customer_id from customers where postal_code = "12345")
);