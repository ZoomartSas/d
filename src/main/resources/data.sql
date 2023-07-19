
INSERT INTO courses (yon) VALUES (true);
INSERT INTO courses (yon) VALUES (false);

INSERT INTO gender (gender) VALUES ('man');
INSERT INTO gender (gender) VALUES ('woman');

INSERT INTO school (name)  VALUES ('44');
INSERT INTO school (name) VALUES ('2');
INSERT INTO school (name) VALUES ('6');
INSERT INTO school (name) VALUES ('9');
INSERT INTO school (name) VALUES ('11');

INSERT INTO data_bof (date) values ('1981-09-11'),
                                   ('1982-05-14'),
                                   ('1981-03-12'),
                                   ('1981-06-12'),
                                   ('1982-09-13'),
                                   ('1981-06-14'),
                                   ('1982-05-12'),
                                   ('1981-10-25'),
                                   ('1981-05-14'),
                                   ('1982-04-26'),
                                   ('1981-02-22'),
                                   ('1982-05-24'),
                                   ('1981-12-23'),
                                   ('1982-06-21');
INSERT INTO faculry (name) VALUES ('Физический');
INSERT INTO faculry (name) VALUES ('Химический');
INSERT INTO faculry (name) VALUES ('Математический');
INSERT INTO faculry (name) VALUES ('Биологический');

INSERT INTO full_name (courses_id,faculry_id,gender_id,school_id,full_name) VALUES
    (1,1,1,2,5,'Лыкова Ольгп Петровна'),
    (2,2,2,1,1,'Семкнов Олег Еннвкендивич'),
    (2,3,1,2,2,'Гордилова Елена Юрьевна'),
    (1,4,4,2,1,'Захарова Иртна Петровна'),
    (1,5,2,1,3,'Родченко Андрей Иванович'),
    (2,6,1,1,4,'Горохов Олег Макарович'),
    (1,7,3,2,5,'Семенова Татьяна Евгеньевна'),
    (2,8,4,1,1,'Григорив Сергей Викторович'),
    (1,9,2,1,3,'Морозов Иван Иванович'),
    (2,10,3,2,1,'Шумлова Антонина Михалова'),
    (1,11,2,2,2,'Михайлова Анна Сергейевна'),
    (1,12,3,1,3,'Бобров Игорь Андреевич'),
    (2,13,4,1,5,'Рыбков Роман Петрович'),
    (1,14,3,1,1,'Горбунов Кирил Андреевич');



