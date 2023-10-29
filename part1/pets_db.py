import sqlite3

TABLE_SCHEMA = """
    CREATE TABLE animals (
      animal_id integer,
      name text not null,
      species text not null,
      age integer not null
    );
    CREATE TABLE people ( 
      person_id integer,
      name text not null,
      age integer not null,
      favorite_color text not null
    );
    CREATE TABLE people_animals (
      owner_id integer not null,
      pet_id integer not null
    );
"""

ANIMALS = [
  (1, "petey", "gray whale", 38),
  (2, "leyla", "gray whale", 43),
  (3, "thommy", "giant parrot", 21),
  (4, "ricky", "lobster", 5),
  (5, "martin", "cow", 12),
  (6, "shannon", "cow", 14),
  (7, "randolph", "lemur", 67),
]

PEOPLE = [
  (1, "scott", 23, "green"),
  (2, "bessie", 22, "pink"),
  (3, "karen", 27, "orange"),
]

PEOPLE_ANIMALS = [
  (1, 4), # scott, ricky
  (2, 4),  # bessie, ricky
  (2, 2), # bessie, leyla
  (2, 7), # bessie, randolph
  (3, 3),  # karen, thommy
  (3, 5),  # karen, martin
]

###
# Utility functions for interacting with the database.
# No need to look any further!
###

DB_NAME = "quiz_pets"

def get_connection():
  return sqlite3.connect(DB_NAME)

def drop_db():
  with get_connection() as con:
    for table in ["animals", "people", "people_animals", "favorite_foods"]:
      con.execute(f"drop table if exists {table}")

def create_db():
  drop_db()

  with get_connection() as con:
    con.executescript(TABLE_SCHEMA)
    con.executemany("INSERT INTO animals VALUES(?, ?, ?, ?)", ANIMALS)
    con.executemany("INSERT INTO people VALUES(?, ?, ?, ?)", PEOPLE)
    con.executemany("INSERT INTO people_animals VALUES(?, ?)", PEOPLE_ANIMALS)