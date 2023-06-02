insert into cafe (name, city, address, phone, email, open, close)
values ('Losteria Dortmund', 'Dortmund', 'Friedensplatz 8', '+49 0231 58445524','dortmund@losteria.de','9:00','20:00'),
       ('Milano im Westend','Munster','Wilhelmstr. 26' , '+49 0251 25962555','mail@milano-westend.de','9:00','21:00'),
       ('Bella Mia','Waltrop','Dortmunderstr. 132' , '+49 0230 97820386','info@bella-mia.de','10:00','22:00');

insert into pizza (name, size, price, key_ingredients, cafe_id)
values ('Pizza Romano', 'Standard', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina',1),
       ('Quattro Formaggi', 'Large', 11.30, 'Mozzarella, gorgonzola, fontina, parmiggiano',2),
       ('Pizza Calzone', 'Standard', 7.65, 'Tomato sauce, pepperoni, ricotta',3),
       ('Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple',1),
       ('Pizza Zucchini', 'Lage', 8.30, 'Tomato sauce, zucchini, onions',2),
       ('Pizza Carbonara', 'Lage', 9.29, 'Tomato sauce, bacon, garlic, onions, mushrooms',3),
       ('Pizza Napoletana', 'XL', 8.49, 'Tomato sauce, mozzarella, basil',1);

-- insert into pizza (name, size, price, key_ingredients)
-- values ('Pizza Romano', 'Standard', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina'),
--        ('Quattro Formaggi', 'Large', 11.30, 'Mozzarella, gorgonzola, fontina, parmiggiano'),
--        ('Pizza Calzone', 'Standard', 7.65, 'Tomato sauce, pepperoni, ricotta'),
--        ('Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple'),
--        ('Pizza Zucchini', 'Lage', 8.30, 'Tomato sauce, zucchini, onions'),
--        ('Pizza Carbonara', 'Lage', 9.29, 'Tomato sauce, bacon, garlic, onions, mushrooms'),
--        ('Pizza Napoletana', 'XL', 8.49, 'Tomato sauce, mozzarella, basil');
