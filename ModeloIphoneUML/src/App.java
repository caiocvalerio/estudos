package ModeloIphoneUML.src;

import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {
        IPhone ip = new IPhone(UUID.randomUUID(), "email@mail.com", "doawkdpawo");
        
        System.out.println(ip.toString());
        ip.tocarMusica();
        ip.fazerChamada();
        ip.navegarWeb();
        ip.mudarSenha("123senha");
    }
}
