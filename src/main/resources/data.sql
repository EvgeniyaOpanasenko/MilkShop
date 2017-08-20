INSERT INTO goods (name, description, price_per_unit, creation_date, Unit_of_measurement, image_path)
VALUES('cheese', 'natural product', 192.5, NOW(), 'KG', '');

INSERT INTO users (address, password, approve_password, phone, role, user_name)
VALUES('kiev', '123456', '', '12345678', 'ROLE_USER','eva');

/*
INSERT INTO baskets (order_date, account_id, total);
VALUES(NOW(), , 12 );
*/

/*
INSERT INTO unit_orders (capacity, goods_id, basket_id);
VALUES(12, 1, 1);*/
