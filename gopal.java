raw_weight_g = input()
price_per_kg_str = input()

print(type(raw_weight_g))

weight_g = int(raw_weight_g)
print(type(weight_g))

weight_kg = weight_g / 1000
print(type(weight_kg))

price_per_kg = float(price_per_kg_str)

bill = weight_kg * price_per_kg
print(f"{bill:.2f}")