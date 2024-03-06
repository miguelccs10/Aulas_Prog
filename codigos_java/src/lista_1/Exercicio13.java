package lista_1;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas trabalhadas: ");
        int ht = sc.nextInt();

        System.out.print("Valor da Hora: ");
        double vh = sc.nextDouble();

        System.out.print("Percentual de Desconto: ");
        double pd = sc.nextDouble();

        double sb = ht*vh;
        double td =(pd/100)*sb;
        double sl = sb-td;

        sc.close();

        System.out.println(ht + "horas de trabalho");
        System.out.println("--------------------------");
        System.out.println(sb + "salario bruto");
        System.out.println("--------------------------");
        System.out.println(pd + "desconto");
        System.out.println("--------------------------");
        System.out.println(sl + "salario liquido");
        System.out.println("--------------------------");
    }
}
