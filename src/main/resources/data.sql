insert into pizza (id, name, size, price, key_ingredients)
values (1, 'Pizza Romano', 'Standart', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina'),
       (2, 'Quattro Formaggi', 'Large', 11.30, 'Tomato sauce, mozzarella, gorgonzola, fontina, parmiggiano'),
       (3, 'Pizza Calzone', 'Standart', 7.65, 'Tomato sauce, pepperoni, ricotta'),
       (4, 'Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple'),
       (5, 'Pizza Carbonara', 'Lage', 9.29, 'Tomato sauce, bacon, garlic, onions, mushrooms'),
       (6, 'Pizza Napoletana', 'XL', 8.49, 'Tomato sauce, mozzarella, basil');

insert into cafe (id, name, city, address, phone, email)
values (1, 'Losteria Dortmund', 'Dortmund', 'Friedensplatz 8', '+49 0231 58445524','dortmund@losteria.de'),
       (2, 'Milano im Westend','Munster','Wilhelmstr. 26' , '+49 0251 25962','mail@milano-westend.de'),
       (3, 'Bella Mia','Waltrop','Dortmunderstr. 132' , '+49 2309 7820386','info@bella-mia.de');

-- create table pizza
-- (
--     id              LONG not null,
--     name            VARCHAR not null,
--     size            VARCHAR not null,
--     price           DOUBLE not null,
--     key_ingredients VARCHAR not null
-- );
-- create table cafe
-- (
--     id      LONG not null,
--     name    VARCHAR not null,
--     city    VARCHAR not null,
--     address VARCHAR not null,
--     phone   VARCHAR not null,
--     email   VARCHAR not null
-- );
