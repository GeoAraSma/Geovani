public class Main {
    public static void main(String[] args) {

        Universidade princeton = new Universidade("Princeton");
        Universidade cambridge = new Universidade("Cambridge");

        Pessoa einstein = new Pessoa("Albert Einstein",princeton);
        Pessoa newton = new Pessoa("Isaac Newton",cambridge);

        System.out.println(einstein.getNome()+" trabalhou em "+einstein.getUniversidade());
        System.out.println(newton.getNome()+" trabalho em "+newton.getUniversidade());

    }
}
