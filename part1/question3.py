################################################################################
#     ____                          __     _                          _____
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          |__  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \          /_ < 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        ___/ / 
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /____/  
#                                                                          
#  Question 3
################################################################################
#
# Instructions:
# Make a Python class for a magical oven that can combine ingredients at 
# different temperatures to craft special materials.
# 
# The oven class should have the methods:
# - add(item) to add an oven to be combined
# - freeze() to freeze the ingredients
# - boil() to boil the ingredients
# - wait() to combine the ingredients with no change in temperature
# - get_output() to get the result 
#
# You will need to change the `make_oven()` function to return a new instance
# of your oven.
#
# The `alchemy_combine()` function will use your oven. You can see the expected 
# formulas and their outputs in the test file, `question3_test.py`.

# This function should return an oven instance!
class Oven:
    def __init__(self):
        self.output = []

    def add(self, ingredient):
        self.output.append(ingredient)

    def freeze(self):
        # Realiza alguna acción cuando la temperatura es menor a 0
        pass

    def boil(self):
        # Realiza alguna acción cuando la temperatura es mayor o igual a 100
        pass

    def wait(self):
        # Realiza alguna acción cuando la temperatura está entre 0 y 100
        pass

    def get_output(self):
        return self.output

def make_oven():
    oven = Oven()  # Creamos una instancia de la clase Oven
    return oven

  def alchemy_combine(oven, ingredients, temperature):
    for item in ingredients:
        oven.add(item)

        if temperature < 0:
            oven.freeze()
        elif temperature >= 100:
            oven.boil()
        else:
            oven.wait()

    return oven.get_output()

# Definimos algunas variables
oven = make_oven()  # Creamos un horno
ingredients = ["ingredient1", "ingredient2", "ingredient3"]  # Lista de ingredientes
temperature = 75  # Temperatura


  return oven.get_output()
