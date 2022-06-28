DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS cart;

CREATE TABLE `customer` (
  `customer_id` int AUTO_INCREMENT  PRIMARY KEY,
  `name` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `create_dt` date DEFAULT NULL
);

CREATE TABLE `cart` (
  `customer_id` int NOT NULL,
  `cart_id` int AUTO_INCREMENT  PRIMARY KEY,
  `product_id` varchar(200) NOT NULL,
  `product_price` varchar(200) NOT NULL
);

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
 VALUES ('Suresh','java@suresh.com','9620511579',CURDATE());
 
INSERT INTO `cart` (`customer_id`, `cart_id`, `product_id`, `product_price`)
 VALUES (1, 123, 'e3456', '4500');
 
 INSERT INTO `cart` (`customer_id`, `cart_id`, `product_id`, `product_price`)
 VALUES (1, 456, 'f567', '14500');