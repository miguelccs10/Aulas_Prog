codigo = input("Digite um codigo numerico de cinco algarismos: ")

if len(codigo) != 5:
    print("Por favor, digite um codigo de 5 algarismos !!")
else:
    numeros = [int(algarismos) for algarismos in codigo]

s = 6*numeros[0] + 5*numeros[1] + 4*numeros[2] + 3*numeros[3] + 2*numeros[4]

digito_verificador = s % 7

print(f"Digito Verificador = {digito_verificador}")