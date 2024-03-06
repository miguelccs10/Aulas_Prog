anos = int(input("Digite sua idade em anos: "))
meses = int(input("Digite quantos meses: "))
dias = int(input("Digite quantos dias: "))

idadeFinal = (anos*365) + (meses*30) + dias

print(f"Sua idade em dias é: {idadeFinal}")