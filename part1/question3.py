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

class Magic_Oven:

  def __init__(self):
    self.temperature = 150
    self.output = None
    self.list_ingredents = []
  def add(self, item):
    self.list_ingredents.append(item)
  def freeze(self):
    if "water" in self.list_ingredents and "air" in self.list_ingredents:
        self.temperature = -100
        self.output = "snow"
  def boil(self):
    if "lead" in self.list_ingredents and "mercury" in self.list_ingredents:
      self.temperature = 5000
      self.output = "gold"
  def wait(self):
    if "cheese" in self.list_ingredents and "dough" in self.list_ingredents and "tomato" in self.list_ingredents:
      self.output = "pizza"
  def get_output(self):
    return self.output

def make_oven():
  return Magic_Oven()

def alchemy_combine(oven, ingredients, temperature):
  
  for item in ingredients:
    oven.add(item)

  if temperature < 0:
    oven.freeze()
  elif temperature >= 151:
    oven.boil()
  else:
    oven.wait()

  return oven.get_output()