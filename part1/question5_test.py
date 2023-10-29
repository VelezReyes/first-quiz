import pets_db as pets_db
from question5 import sql_create_favorite_foods, sql_alter_tables_with_favorite_food, sql_select_all_vegetarian_pets

FOODS = [
  (1, "spinach", 1),
  (2, "termites", 0),
  (3, "turnips", 1),
  (4, "cough drops", 1),
  (5, "shrimp", 0),
]

PEOPLE_FOOD = [
  (4, "scott"), # cough drops
  (5, "bessie"), # shrimp
  (3, "karen"), # turnips
]

ANIMALS_FOOD = [
  (5, "petey"), # shrimp
  (1, "leyla"), # spinach
  (2, "thommy"), # termites
  (4, "ricky"), # cough drops
  (1, "martin"), # spinach
  (3, "shannon"), # turnips
  (2, "randolph"), # termites
]

def insert_foods(con):
  con.executemany("INSERT INTO favorite_foods VALUES(?, ?, ?)", FOODS)

def create_favorite_foods(con):
  con.execute(sql_create_favorite_foods)

def alter_people_animals_food(con):
  con.executescript(sql_alter_tables_with_favorite_food);

def update_people_animals_food(con):
  con.executemany("UPDATE people SET favorite_food_id = ? WHERE name = ?", PEOPLE_FOOD)
  con.executemany("UPDATE animals SET favorite_food_id = ? WHERE name = ?", ANIMALS_FOOD)

def test_create_favorite_foods():
  pets_db.create_db()

  with pets_db.get_connection() as con:
    create_favorite_foods(con)
    insert_foods(con)
    
def test_alter_tables_with_favorite_food():
  pets_db.create_db()

  with pets_db.get_connection() as con:
    create_favorite_foods(con)
    insert_foods(con)
    alter_people_animals_food(con)
    update_people_animals_food(con)

def test_select_all_vegetarian_pets():
  pets_db.create_db()

  with pets_db.get_connection() as con:
    create_favorite_foods(con)
    insert_foods(con)
    alter_people_animals_food(con)
    update_people_animals_food(con)

    res = con.execute(sql_select_all_vegetarian_pets)
    rows = res.fetchall()

  rows.sort()

  assert rows[0] == ('leyla', 'spinach')
  assert rows[1] == ('martin', 'spinach')
  assert rows[2] == ('ricky', 'cough drops')
  assert rows[3] == ('shannon', 'turnips')
