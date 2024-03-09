[ ] Crie uma classe Aluno com os atributos: nome, genero e idade
[ ] Crie uma classe de testes, contendo o método main, crie dois objetos da classe Aluno e exiba no console o nome de cada um deles
[ ] Crie um método estático que gere a idade do aluno de forma aleatória, no intervalo de 20 a 60 anos
[ ] Crie um método estático que formate o nome do aluno, colocando o nome em letras maiúsculas
Dica: para gerar um número aleatório dentro de um intervalo (min, max), use:

Random rand = new Random();

// Gera um número aleatório entre min (inclusive) e max (exclusive)
int randomNumber = rand.nextInt(max - min) + min;
Para colocar uma string em letras maiúsculas, use:

String str = "Olá, Mundo!";
String strMaiuscula = str.toUpperCase();