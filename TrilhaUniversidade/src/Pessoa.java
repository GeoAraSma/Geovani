public class Pessoa {
    String nome;
    Universidade universidade;

    public Pessoa(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public String getNome() {
        return nome;
    }
}
