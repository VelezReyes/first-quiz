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

class Oven:

  def __init__(self):
    self.ingredients=[]

  def add(self,item):
    self.ingredients.append(item)
    self.freezed=False
    self.boiled=False
    self.waited=False
  
  def freeze(self):
    self.freezed=True

  def boil(self):
    self.boiled=True
  
  def wait(self):
    self.waited=True

  def get_output(self):
    if self.boiled == True and "cheese" in self.ingredients and "tomato" in self.ingredients and "dough" in self.ingredients:
      
      self.cleaning_oven()
      return "pizza"
    
    elif self.boiled == True and "lead" in self.ingredients and "mercury" in self.ingredients:
      
      self.cleaning_oven()
      return "gold"

    elif self.waited == True:
      
      self.cleaning_oven()
      return "nothing"
    
    elif self.freezed==True and "water" in self.ingredients and "air" in self.ingredients:
      
      self.cleaning_oven()
      return "snow"
    
  
  def cleaning_oven(self):
    self.freezed=False
    self.boiled=False
    self.waited=False

# This function should return an oven instance!
def make_oven():
  return Oven()

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