numA = int(input("Digite o valor de A: "))
numB = int(input("Digite o valor de B: "))

if numA % numB == 0:
    print(f"A é divisivel por B ! (Resultado: {numA / numB})")
else: print(f"A não é divisivel por B ! (Resta: {numA % numB})")