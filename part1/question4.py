################################################################################
#     ____                          __     _                          __ __
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          / // /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \        / // /_
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /       /__  __/
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/          /_/   
#                                                                          
#  Question 4
#
#  Solution submitted by @daniruiz301. Thank you!!
################################################################################
#
# Instructions:
# Question 4 and Question 5 are about writing SQL. THey use the database that is 
# created in the file `pets_db.py`. 
# These questions use a database called SQLite. You do not need to install anything.
# In the file `pets_db.py` three tables are created. Data is then added to each 
# of the tables. The questions below are about how the data in each of the tables
# is related.

# Part 4.A:
# Write SQL to select the pets that are owned by nobody.
# The output should be a list of tuples in the format: (<pet name>, <species>, <age>)

import pets_db


sql_pets_owned_by_nobody = """
                         SELECT
                         name, species, age
                         FROM animals
                         LEFT OUTER JOIN people_animals
                         ON animals.animal_id = people_animals.pet_id
                         WHERE people_animals.owner_id IS Null
                         """


# Part 4.B:
# Write SQL to select how the number of pets are older than their owners. 
# The output should be an integer.

sql_pets_older_than_owner = """
                         SELECT count(*)
                         FROM animals
                         JOIN people_animals
                         ON animals.animal_id = people_animals.pet_id
                         join people
                         ON people.person_id = people_animals.owner_id
                         WHERE people.age < animals.age
                         """

# Part 4.C: BONUS CHALLENGE! 
# Write SQL to select the pets that are owned by Bessie and nobody else.
# The output should be a list of tuples in the format: (<person name>, <pet name>, <species>)
sql_only_owned_by_bessie = """

SELECT people.name, animals.name, animals.species from animals JOIN (
        SELECT people_animals.pet_id, people_animals.owner_id
        FROM people_animals
        GROUP BY people_animals.pet_id
        HAVING COUNT(pet_id) = 1) AS pet
        ON animals.animal_id = pet.pet_id
        JOIN people
        ON people.person_id = pet.owner_id
        WHERE people.name = "bessie"
"""
