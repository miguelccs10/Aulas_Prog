package lista_5;

public class Exercicio6 {
    public static void main(String[] args) {
        
        String[] alfabeto = new String[26];

        for(int i = 0; i < 26; i++){
            alfabeto[i] = String.valueOf((char) ('A' + i));
        }

        int[] indices = {18,7,0,17,8,13,6,0,13};

        System.out.print("Indices: ");
        for(int i = 0; i < indices.length; i++){
            int indice = indices[i];
            if (indice >= 0 && indice < 26){
                System.out.print(alfabeto[indice] + " ");
            } else {
                System.out.print("Indice fora do alcance");
            }
        }

    }
}
