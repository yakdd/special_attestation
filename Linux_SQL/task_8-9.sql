CREATE DATABASE HumanFriendsDB;
USE HumanFriendsDB;

CREATE TABLE cat (
  id INT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
  func VARCHAR(25),
  commands VARCHAR(100),
  name VARCHAR(45),
  birthday DATE
);

CREATE TABLE dog LIKE cat;
CREATE TABLE hamster LIKE cat;
CREATE TABLE horse LIKE cat;
CREATE TABLE donkey LIKE cat;
CREATE TABLE camel LIKE cat;

ALTER TABLE cat ADD COLUMN typeanimal VARCHAR(25);
ALTER TABLE dog ADD COLUMN typeanimal VARCHAR(25);
ALTER TABLE hamster ADD COLUMN typeanimal VARCHAR(25);
ALTER TABLE donkey ADD COLUMN typeanimal VARCHAR(25);
ALTER TABLE horse ADD COLUMN typeanimal VARCHAR(25);
ALTER TABLE camel ADD COLUMN typeanimal VARCHAR(25);

INSERT INTO cat (func, commands, name, birthday, typeanimal) VALUES
  ('домашнее', 'мяукнуть, дать себя погладить', 'Тигра', '2007-11-07', 'кошка'),
  ('домашнее', 'мяукнуть, дать себя погладить', 'Рика', '2010-01-24', 'кошка'),
  ('домашнее', 'мяукнуть, дать себя погладить', 'Чунча', '2021-05-01', 'кошка'),
  ('домашнее', 'мяукнуть, дать себя погладить', 'Мерсик', '2020-02-12', 'кошка');

INSERT INTO dog (func, commands, name, birthday, typeanimal) VALUES
  ('домашнее', 'сидеть, лежать, рядом, голос, лапу, фу, фас', 'Одри', '2017-10-17', 'собака'),
  ('домашнее', 'сидеть, лежать, рядом, голос, лапу, фу, фас', 'Рэкс', '2010-02-20', 'собака'),
  ('домашнее', 'сидеть, лежать, рядом, голос, лапу, фу, фас', 'Мухтар', '2023-03-01', 'собака'),
  ('домашнее', 'сидеть, лежать, рядом, голос, лапу, фу, фас', 'Бим', '2009-07-12', 'собака');

INSERT INTO hamster (func, commands, name, birthday, typeanimal) VALUES
  ('домашнее', '', 'Трамп', '2016-10-07', 'хомяк'),
  ('домашнее', '', 'Байден', '2020-11-04', 'хомяк');
  
INSERT INTO horse (func, commands, name, birthday, typeanimal) VALUES
  ('вьючное', 'но, тпру', 'Водопад', '2011-10-07', 'лошадь'),
  ('вьючное', 'но, тпру', 'Делта', '2012-08-11', 'лошадь'),
  ('вьючное', 'но, тпру', 'Дракон', '2020-11-04', 'лошадь'),
  ('вьючное', 'но, тпру', 'Хулиган', '2020-11-05', 'лошадь');
  
INSERT INTO donkey (func, commands, name, birthday, typeanimal) VALUES
  ('вьючное', 'нести, стоять, бросить', 'Ниф-ниф', '2011-10-07', 'осел'),
  ('вьючное', 'нести, стоять, бросить', 'Наф-наф', '2012-08-11', 'осел'),
  ('вьючное', 'нести, стоять, бросить', 'Нуф-нуф', '2020-11-05', 'осел');

INSERT INTO camel (func, commands, name, birthday, typeanimal) VALUES
  ('вьючное', 'нести, стоять, бросить', 'Бивис', '2006-01-01', 'верблюд'),
  ('вьючное', 'нести, стоять, бросить', 'Батхед', '2005-12-31', 'верблюд');
