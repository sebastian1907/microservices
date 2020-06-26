INSERT INTO categories (id, name) VALUES (1, 'shoes');
INSERT INTO categories (id, name) VALUES (2, 'books');
INSERT INTO categories (id, name) VALUES (3, 'electronics');



INSERT INTO products (id, name, description, stock, price, status, create_at, category_id)
VALUES (1, 'adidas Cloud', 'Walk in the air with this shoes', 10, 200, 'CREATED', '2020-06-06', 1);

INSERT INTO products (id, name, description, stock, price, status, create_at, category_id)
VALUES (2, 'The little Prince', 'El prinicipito pito', 20, 200, 'CREATED', '2020-06-06', 1);

INSERT INTO products (id, name, description, stock, price, status, create_at, category_id)
VALUES (3, 'Microondas', 'calienta tu pop corn', 15, 200, 'CREATED', '2020-06-06', 2);