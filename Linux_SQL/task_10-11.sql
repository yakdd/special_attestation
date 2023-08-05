use HumanFriendsDB;

# удалить верблюдов:
DELETE FROM camel;

# объединить лошадей и ослов в одну таблицу:
CREATE TABLE packanimal (id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT)
  SELECT func, commands, name, birthday, typeanimal FROM horse
  UNION
  SELECT func, commands, name, birthday, typeanimal FROM donkey;

# создать новую таблицу "молодые животные":
DROP VIEW IF EXISTS filter1;
CREATE VIEW filter1 AS
  SELECT * FROM cat UNION
  SELECT * FROM dog UNION
  SELECT * FROM hamster UNION
  SELECT * FROM horse UNION
  SELECT * FROM packanimal;


DROP VIEW IF EXISTS filter2;
CREATE VIEW filter2 AS
  SELECT * FROM filter1
    WHERE TIMESTAMPDIFF(MONTH, birthday, current_date()) < 36
      AND TIMESTAMPDIFF(MONTH, birthday, current_date()) >= 12;


DROP TABLE IF EXISTS youngGrowth;
CREATE TABLE youngGrowth
  SELECT
    typeanimal,
    name,
    birthday,
    CONCAT(
      TIMESTAMPDIFF(MONTH, birthday, current_date()) DIV 12, ' г. ', 
      TIMESTAMPDIFF(MONTH, birthday, current_date()) % 12, ' мес.') AS age
  FROM filter2;
  