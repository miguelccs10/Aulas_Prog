real = int(input("Digite o valor em R$: "))

dolar = real*3.81
euro = real*4.17

print(f"""
    R$: {real}
    US$: {dolar}
    €: {euro}
""")