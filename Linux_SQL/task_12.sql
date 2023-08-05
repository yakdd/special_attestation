use HumanFriendsDB;

# Объединить все таблицы в одну, при этом сохраняя поля, указывающие на
# прошлую принадлежность к старым таблицам.
DROP VIEW IF EXISTS filter3;
CREATE VIEW filter3 AS
  SELECT *, 'cat' AS oldTable FROM cat UNION
  SELECT *, 'dog' AS oldTable FROM dog UNION
  SELECT *, 'hamster' AS oldTable FROM hamster UNION
  SELECT *, 'horse' AS oldTable FROM horse UNION
  SELECT *, 'packanimal' AS oldTable FROM packanimal;

DROP TABLE IF EXISTS allAnimals;
CREATE TABLE allAnimals
  SELECT * FROM filter3;

SELECT * FROM allAnimals;