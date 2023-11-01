def get_city_temperature(city):
    if city == "Quito":
        return 22
    if city == "Sao Paulo":
        return 17
    if city == "San Francisco":
        return 16

def get_city_weather(city):
    sky_condition = None

    if city == "Sao Paulo":
        sky_condition = "cloudy"
    elif city == "New York":
        sky_condition = "rainy"

    temperature = get_city_temperature(city)

    if sky_condition is not None:
        return str(temperature) + " degrees and " + sky_condition
    else:
        return str(temperature) + " degrees and sunny"

