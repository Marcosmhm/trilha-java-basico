public class Iphone implements Navegador, Reprodutor, Telefone {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        iphone.atender();
        iphone.ligar(null);
    }
}
