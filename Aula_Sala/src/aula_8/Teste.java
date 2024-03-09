package aula_8;

public class Teste {
    public static void main(String[] args) {

        Mensagem msg1 = new Mensagem(null, null, null);
        msg1.configurar();

        Mensagem msg2 = new Mensagem("2024", "Miguel", "Eai, blz ?");
        msg2.enviar();
    }
}
