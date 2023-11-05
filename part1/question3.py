class Oven:
    def __init__(self):
        self.ingredients = []
        self.temperature = 0

    def add(self, ingredient):
        self.ingredients.append(ingredient)

    def freeze(self):
        self.temperature = -100

    def boil(self):
        self.temperature = 100

    def wait(self):
        pass

    def get_output(self):
       if "lead" in self.ingredients and "mercury" in self.ingredients and self.temperature >= 5000:
            return "gold"
        if "water" in self.ingredients and "air" in self.ingredients and self.temperature <= 50:
            return "snow"
        if "cheese" in self.ingredients and "dough" in self.ingredients and "tomato" in self.ingredients and self.temperature >= 150:
            return "pizza"
      return "unknown"

def make_oven():
    return Oven()

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

# Ejecuta la prueba
test_alchemy_combine()
