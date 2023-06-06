insert into cafe (name, city, address, phone, email, open, close)
values ('Losteria Dortmund', 'Dortmund', 'Friedensplatz 8', '+49 0231 58445524','dortmund@losteria.de','9:00','20:00'),
       ('Milano im Westend','Munster','Wilhelmstr. 26' , '+49 0251 25962555','mail@milano-westend.de','9:00','21:00'),
       ('Bella Mia','Waltrop','Dortmunderstr. 132' , '+49 0230 97820386','info@bella-mia.de','10:00','22:00');

insert into pizza (name, size, price, key_ingredients, cafe_id, image)
values ('Pizza Romano', 'Standard', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina',1, '/img/marherita.jpeg'),
       ('Quattro Formaggi', 'Large', 11.30, 'Mozzarella, gorgonzola, fontina, parmiggiano',2, '/img/quattro_formagi.jpeg'),
       ('Pizza Peperoni', 'Standard', 7.65, 'Tomato sauce, pepperoni, ricotta',3, '/img/peperoni.jpeg'),
       ('Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple',1,'/img/hawaii.jpeg'),
       ('Pizza Di Mare', 'Lage', 8.30, 'Tomato sauce, mussels, mozzarella, onions',2,'/img/dimare.jpeg'),
       ('Pizza Blanka Meat', 'Lage', 9.29, 'Tomato sauce, veal, ham, onions, mushrooms',3,'/img/biankameat.jpeg'),
       ('Pizza Tsezar', 'XL', 8.80, 'Tomato sauce, Eggs, mozzarella, salat',1,'/img/tsezar.jpeg'),
       ('Pizza Siciliano', 'XL', 7.20, 'Tomato sauce, Tomato, mozzarella, onions, basil',2,'/img/siciliano.jpeg'),
       ('Pizza Meat Confugi', 'Family', 14.00, 'Tomato sauce, veal, ham, onions, mushrooms',3,'/img/meatconfugi.jpeg');

-- insert into pizza (name, size, price, key_ingredients, cafe_id)
-- values ('Pizza Romano', 'Standard', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina',1),
--        ('Quattro Formaggi', 'Large', 11.30, 'Mozzarella, gorgonzola, fontina, parmiggiano',2),
--        ('Pizza Calzone', 'Standard', 7.65, 'Tomato sauce, pepperoni, ricotta',3),
--        ('Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple',1),
--        ('Pizza Zucchini', 'Lage', 8.30, 'Tomato sauce, zucchini, onions',2),
--        ('Pizza Carbonara', 'Lage', 9.29, 'Tomato sauce, bacon, garlic, onions, mushrooms',3),
--        ('Pizza Napoletana', 'XL', 8.49, 'Tomato sauce, mozzarella, basil',1);
