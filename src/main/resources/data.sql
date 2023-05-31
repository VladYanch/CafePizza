insert into cafe (id, name, city, address, phone, email)
values (1, 'Losteria Dortmund', 'Dortmund', 'Friedensplatz 8', '+49 0231 58445524','dortmund@losteria.de'),
       (2, 'Milano im Westend','Munster','Wilhelmstr. 26' , '+49 0251 25962','mail@milano-westend.de'),
       (3, 'Bella Mia','Waltrop','Dortmunderstr. 132' , '+49 2309 7820386','info@bella-mia.de');

insert into pizza (id, name, size, price, key_ingredients, cafe_id)
values (1, 'Pizza Romano', 'Standart', 6.70, 'Tomato sauce, mozzarella, rosemary, semolina',1),
       (2, 'Quattro Formaggi', 'Large', 11.30, 'Tomato sauce, mozzarella, gorgonzola, fontina, parmiggiano',2),
       (3, 'Pizza Calzone', 'Standart', 7.65, 'Tomato sauce, pepperoni, ricotta',1),
       (4, 'Pizza Hawaii', 'Family', 13.80, 'Tomato sauce, bacon, mozzarella, pineapple',2),
       (5, 'Pizza Carbonara', 'Lage', 9.29, 'Tomato sauce, bacon, garlic, onions, mushrooms',2),
       (6, 'Pizza Napoletana', 'XL', 8.49, 'Tomato sauce, mozzarella, basil',3);


