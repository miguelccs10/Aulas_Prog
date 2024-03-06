numero = int(input("Digite um número: "))

if numero == 5:
    print("O número é igual a 5.")
elif numero == 200:
    print("O número é igual a 200.")
elif numero == 400:
    print("O número é igual a 400.")
elif 500 <= numero <= 1000:
    print("O número está no intervalo entre 500 e 1000, inclusive.")
else:
    print("O número está fora dos escopos mencionados.")
