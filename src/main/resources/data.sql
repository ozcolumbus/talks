
--Insert of reserves.dict_talk_types
INSERT INTO reserves.dict_talk_types(id_talk_type,talk_type_name) VALUES (1,'доклад');
INSERT INTO reserves.dict_talk_types(id_talk_type,talk_type_name) VALUES (2,'мастер-класс');
INSERT INTO reserves.dict_talk_types(id_talk_type,talk_type_name) VALUES (3,'воркшоп');

--Insert reserves.conferences
INSERT INTO reserves.conferences(id_conf, name, topic, room_number, participants_num, conf_date) VALUES (1, 'Из жизни Java кодера', 'Из жизни Java кодера','5A', 140, '2018-01-01');
INSERT INTO reserves.conferences(id_conf, name, topic, room_number, participants_num, conf_date) VALUES (2, 'Datastage IBM ETL scenario', 'Datastage IBM ETL scenario','7A', 110, '2019-01-01');
INSERT INTO reserves.conferences(id_conf, name, topic, room_number, participants_num, conf_date) VALUES (3, 'WSO2 API Management 2.0', 'WSO2 API Management 2.0','13A', 170, '2020-09-01');
INSERT INTO reserves.conferences(id_conf, name, topic, room_number, participants_num, conf_date) VALUES (4, 'Life of PI', 'Life after microservice transformation','13A', 130, '2020-09-01');
INSERT INTO reserves.conferences(id_conf, name, topic, room_number, participants_num, conf_date) VALUES (5, 'Spring boot ', 'Spring boot application development','13A', 110, '2020-09-01');

--Insert the table of TALKS
INSERT INTO reserves.talks(id_talk, name, description, presenter_name, id_talk_type) VALUES (1, 'Java as it is', 'Java languge overview', 'Mike Jovanovich', 2);
INSERT INTO reserves.talks(id_talk, name, description, presenter_name, id_talk_type) VALUES (2, 'О том как я на рыбалку ходил', 'Рыбалка как она есть', 'Joban Jobovkyi', 1);
INSERT INTO reserves.talks(id_talk, name, description, presenter_name, id_talk_type) VALUES (3, 'Implementing microservices', 'Implementing microservices', 'Joe Black', 1);
INSERT INTO reserves.talks(id_talk, name, description, presenter_name, id_talk_type) VALUES (4, 'Как я провел карантин', 'Implementing microservices', 'Аристарх Короноштейн', 2);
INSERT INTO reserves.talks(id_talk, name, description, presenter_name, id_talk_type) VALUES (5, 'Spring boot application', 'Spring boot application', 'Арнольд Шварц', 3);

--Insert the table of CONFERENCES_TALKS
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (1, 1, 1);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (2, 1, 2);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (3, 1, 2);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (4, 1, 3);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (5, 1, 5);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (6, 2, 5);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (7, 2, 3);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (8, 2, 4);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (9, 2, 4);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (10, 4, 2);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (11, 5, 3);
INSERT INTO reserves.conferences_talks(id_conf_talks, id_conf, id_talk) VALUES (12, 5, 2);
