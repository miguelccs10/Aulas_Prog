def encontrar_maior(a,b,c,d):
    maior = a
    
    if b > maior:
        maior = b
    
    if c > maior:
        maior = c

    if d > maior:
        maior = d
    
    return maior

A = int(input("Digite o valor de A: "))
B = int(input("Digite o valor de B: "))
C = int(input("Digite o valor de C: "))
D = int(input("Digite o valor de D: "))

maior_valor = encontrar_maior(A, B, C, D)

print("O maior valor é: ", maior_valor)