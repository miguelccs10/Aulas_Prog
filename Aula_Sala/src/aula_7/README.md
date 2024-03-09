istema de Controle de Estoque
Descrição:

Crie uma classe Produto com os seguintes atributos:

nome (tipo String)
codigo (tipo int)
preco (tipo double)
quantidadeEmEstoque (tipo int)
Adicione os seguintes métodos:

adicionarEstoque(int quantidade) (sem retorno)
removerEstoque(int quantidade) (sem retorno)
calcularValorTotalEmEstoque() (retorna double)
A classe Produto deve ter um método adicional qualCategoria (retorno tipo String) e static, que recebe um parâmetro código (do tipo int). Esse método deve pegar esse parâmetro e retornar o valor da seguinte forma:

Se for menor que 100: retorna "Perecível"
Se maior ou igual a 100: retorna "Não perecível"
Crie uma classe Teste que:

Crie instâncias de Produto.
Adicione e remova quantidades de estoque para cada produto.
Calcule o valor total em estoque para cada produto.
Exiba as informações de cada produto, incluindo o valor total em estoque.
Exiba informação da categoria do produto via seu código.
Exemplo de saída:

Produto: Arroz (Não Perecível)
Código: 123
Preço: 5.0
Quantidade em Estoque: 10
Valor Total em Estoque: 50.0

Produto: Leite (Perecível)
Código: 456
Preço: 4.0
Quantidade em Estoque: 5
Data de Validade: 2024-03-01
Valor Total em Estoque: 20.0