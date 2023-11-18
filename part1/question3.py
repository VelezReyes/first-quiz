################################################################################
#     ____                          __     _                          _____
#    / __ \  __  __  ___    _____  / /_   (_)  ____    ____          |__  /
#   / / / / / / / / / _ \  / ___/ / __/  / /  / __ \  / __ \          /_ < 
#  / /_/ / / /_/ / /  __/ (__  ) / /_   / /  / /_/ / / / / /        ___/ / 
#  \___\_\ \__,_/  \___/ /____/  \__/  /_/   \____/ /_/ /_/        /____/  
#                                                                          
#  Question 3
#
#  Solution submitted by @sfrancop (with one minor modification). Thank you!!
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
  
  def add(self, item):
    self.items.append(item)

  def freeze(self):
    if self.items == ["water", "air"]:
      self.result = "snow"
    else:
      self.result = " and ".join(self.items) + " freezed"
  
  def boil(self):
    if self.items == ["lead", "mercury"]:
      self.result = "gold"
    elif self.items == ["cheese", "dough", "tomato"]:
      self.result = "pizza"
    else:
      self.result = " and ".join(self.items) + " boiled"
  
  def wait(self):
    self.result = " and ".join(self.items)
  
  def get_output(self):
    return self.result
  
  def __init__(self):
    self.items = []
    self.result = None
    

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
