nome = (input("Digite o nome do vendedor: "))
salario = int(input(f"Valor do salario fixo de {nome}: "))
vendas = int(input(f"Quantas vendas {nome} fez no mes: "))

comissao: int = (vendas*0.15)
salarioTotal: int = salario + comissao

print(f"""
{nome} recebeu R${salarioTotal} de salario, sendo R${comissao} de comissao.
""")