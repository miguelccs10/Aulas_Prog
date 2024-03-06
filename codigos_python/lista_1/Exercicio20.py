vCusto = int(input("Valor de custo: "))
acres = int(input("percentual de acrescimo: "))

valorAcres =  (acres / 100) * vCusto
valorVenda = (vCusto + valorAcres)

print(f"""
Valor de venda: {valorVenda}

####################
Valor de custo: {vCusto}
Acrescimo: {valorAcres}
####################
""")