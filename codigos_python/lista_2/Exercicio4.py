num1 = int(input("Digite o primeiro numero: "))
num2 = int(input("Digite o segundo numero: "))

soma = num1 + num2

if soma > 20:
    print(f"{soma + 8} soma maior que 20 (x + 8)")
else: print(f"{soma - 5} soma <= 20 (x - 5)")