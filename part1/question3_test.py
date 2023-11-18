#  Solution edited by @sfrancop. Thank you!!

from question3 import make_oven, alchemy_combine

def test_alchemy_combine():

  assert alchemy_combine(
    make_oven(),
    ["lead", "mercury"],
    5000
  ) == "gold"

  assert alchemy_combine(
    make_oven(),
    ["water", "air"],
    -100
  ) == "snow"

  assert alchemy_combine(
    make_oven(),
    ["cheese", "dough", "tomato"],
    150
  ) == "pizza"
  
  assert alchemy_combine(
    make_oven(),
    ["chocolate", "cheese"],
    55
  ) == "chocolate and cheese"
