package ModeloIphoneUML.src;

import ModeloIphoneUML.util.IPod;
import ModeloIphoneUML.util.Internet;
import ModeloIphoneUML.util.Telefone;
import java.util.UUID;

public class IPhone implements IPod, Telefone, Internet {
    private UUID codigoSerie;
    private String email;
    private String senha;
    
    public IPhone(UUID codigoSerie, String email, String senha) {
        this.codigoSerie = codigoSerie;
        this.email = email;
        this.senha = senha;
    }
    
    public IPhone(UUID codigoSerie) {
        this.codigoSerie = codigoSerie;
    }


    public UUID getCodigoSerie() {
        return codigoSerie;
    }

    public void setCodigoSerie(UUID codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada");
    }

    @Override
    public void receberChamada() {
        System.out.println("Recebendo chamada");
    }
    
    @Override
    public void navegarWeb() {
        System.out.println("Navegando na web");
    }
    
    @Override
    public void enviarEmail() {
        System.out.println("Enviando e-mail");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pararMusica() {
        System.out.println("Parou de tocar msucia");
    }

    public void mudarSenha(String senha) {
        this.senha = senha;
        System.out.println("Senha alterada com sucesso");
    }

    @Override
    public String toString() {
        return "IPhone possui o código " + codigoSerie + " e está associado ao e-mail " + email;
    }

    
}
