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

def test_wait():
    oven = make_oven()
    oven.add("cheese")
    oven.add("dough")
    oven.add("tomato")
    oven.wait()
    assert oven.get_output() == "pizza"
