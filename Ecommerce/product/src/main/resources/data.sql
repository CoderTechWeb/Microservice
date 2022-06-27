DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS product;

CREATE TABLE `customer` (
  `customer_id` int PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255),
  `email` varchar(255),
  `mobile_number` varchar(20),
  `create_dt` date
);

CREATE TABLE `product` (
  `customer_id` int,
  `product_id` int PRIMARY KEY AUTO_INCREMENT,
  `product_name` varchar(255),
  `product_price` varchar(255)
);


INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
 VALUES ('Suresh','java@suresh.com','9620511579',CURDATE());
 
INSERT INTO `product` (`customer_id`, `product_id`, `product_name`, `product_price`)
 VALUES (1, 123, 'Portable Hard Disk', '4000');
 
 INSERT INTO `product` (`customer_id`, `product_id`, `product_name`, `product_price`)
 VALUES (1, 456, 'Watch', '13000');