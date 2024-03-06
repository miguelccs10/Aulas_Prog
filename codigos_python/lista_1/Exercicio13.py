ht = int(input("Digite as horas trabalhadas no mes: "))
vh = int(input("Valor da hora: "))
pd = int(input("Percentual de desconto: "))

sb: int = ht * vh
td: int = (pd/100)*sb
sl: int = sb - td

print(f"""
#############################
    Horas trabalhadas: {ht}
    Salario Bruto: {sb}
    Desconto: {td}
    Salario Liquido: {sl}
#############################
""")