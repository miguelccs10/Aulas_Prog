valorA = int(input("Digite o valor de A: "))
valorB = int(input("Digite o valor de B: "))

print("Valores antes da troca: ")
print(f"A: {valorA}", f"B: {valorB}")

temp: int = valorA
valorA = valorB
valorB = temp

print("Valores trocados: ")
print(f"A: {valorA}", f"B: {valorB}")