salario = int(input("Digite o salario bruto: "))
prestacao = int(input("Digite o valor da prestaçao: "))
vMax = salario * (30/100)

if prestacao > vMax:
    print("Valor da prestação maior que 30%")
else: print("Parabén! Emprestimo aprovado")