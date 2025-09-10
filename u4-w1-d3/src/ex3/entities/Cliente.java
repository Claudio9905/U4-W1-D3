package ex3.entities;

public class Cliente {

    // Attributi
    private String codCliente;
    private String nome;
    private String cognome;
    private String email;
    private String dataIscrizione;

    // Costruttori
    public Cliente(String codCliente, String nome, String cognome, String email, String dataIscrizione){
        this.codCliente = codCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    //Metodi

    @Override
    public String toString() {
        return "Cliente{" +
                "codCliente='" + codCliente + '\'' +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataIscrizione='" + dataIscrizione + '\'' +
                '}' + "\n";
    }
}
