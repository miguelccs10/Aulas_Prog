pequeno: int = 10
medio: int = 12
grande: int = 15

clientp = int(input("Digite a quantidade de camisetas pequenas: "))
clientm = int(input("Digite a quantidade de camisetas medias: "))
clientg = int(input("Digite a quantidade de camisetas grandes: "))

valorTotal: int = (pequeno*clientp) + (medio*clientm) + (grande*clientg)

if valorTotal > 150:
    valorDesconto = (valorTotal-(valorTotal*0.1))
    print(f"Valor Total com desconto: {valorDesconto}")
else:
    print(f"Valor sem desconto: {valorTotal}")