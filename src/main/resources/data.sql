
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
INSERT INTO faculry (name) VALUES ('����������');
INSERT INTO faculry (name) VALUES ('����������');
INSERT INTO faculry (name) VALUES ('��������������');
INSERT INTO faculry (name) VALUES ('�������������');

INSERT INTO full_name (data_bof_id, courses_id,faculry_id,gender_id,school_id,full_name) VALUES
    (1,1,1,2,5,'������ ����� ��������'),
    (2,2,2,1,1,'������� ���� ������������'),
    (3,2,1,2,2,'��������� ����� �������'),
    (4,1,4,2,1,'�������� ����� ��������'),
    (5,1,2,1,3,'�������� ������ ��������'),
    (6,2,1,1,4,'������� ���� ���������'),
    (7,1,3,2,5,'�������� ������� ����������'),
    (8,2,4,1,1,'�������� ������ ����������'),
    (9,1,2,1,3,'������� ���� ��������'),
    (10,2,3,2,1,'������� �������� ��������'),
    (11,1,2,2,2,'��������� ���� ����������'),
    (12,1,3,1,3,'������ ����� ���������'),
    (13,2,4,1,5,'������ ����� ��������'),
    (14,1,3,1,1,'�������� ����� ���������');



