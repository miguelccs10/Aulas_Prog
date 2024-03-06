import math

num = int(input("Digite um numero: "))

if num >= 0:
    raizq = math.sqrt(num)
    print(f"Raiz quadrada: {raizq}")
else: 
    quadrado = num ** 2
    print(f"Quadrado: {quadrado}")