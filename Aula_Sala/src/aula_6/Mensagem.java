package aula_6;

public class Mensagem {
    String data;
    String autor;
    String texto;
    
    public Mensagem(String data, String autor, String texto) {
        this.data = data;
        this.autor = autor;
        this.texto = texto;
    }

    public String configurar(){
        return "Configuraçao realizada !";
    }

    public String enviar(){
        return "Ola " + autor + ", sua mensagem com o texto" + texto + " foi enviada em " + data;
    }
    
}
