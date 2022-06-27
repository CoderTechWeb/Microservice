DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS customer_order;

CREATE TABLE `customer` (
  `customer_id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `email` varchar(255),
  `mobile_number` varchar(20),
  `create_dt` date
);

CREATE TABLE `customer_order` (
  `order_id` int PRIMARY KEY AUTO_INCREMENT,
  `customer_id` int,
  `order_date` date,
  `product_id` int, 
  `product_price` varchar(255)
);


INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
 VALUES ('Suresh','java@suresh.com','9620511579',CURDATE());
 
INSERT INTO `customer_order` (`order_id`, `customer_id`, `order_date`, `product_id`, `product_price`)
 VALUES (1, 1,CURDATE(), 123, '4000');
 
INSERT INTO `customer_order` (`order_id`, `customer_id`,`order_date`, `product_id`, `product_price`)
 VALUES (2, 1, CURDATE(), 456, '13000');