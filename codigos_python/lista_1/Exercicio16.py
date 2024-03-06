sb = int(input("Digite o valor do salario bruto: "))

previdencia = sb - (sb*0.1)
imposto = previdencia - (previdencia*0.05)
sl = imposto

print(f"""
    Salario Bruto: {sb}
    Salario Liquido: {sl}
""")