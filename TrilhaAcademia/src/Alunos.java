

public class Alunos {
    String nome;
    int dataNascimento;
    Imc imc;

    public Alunos(String nome, int dataNascimento, int peso, float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.imc = new Imc(peso,altura);
    }



    public void informacoes(){
        System.out.println("----------------------------------------------");

        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+(2024-dataNascimento)+((2024-dataNascimento) < 18 ? " (Menor de idade)" : " (Maior de idade)"));
        System.out.println("Peso: "+imc.peso);
        System.out.println("Altura: "+imc.altura);
        System.out.println("Imc: "+imc.calculoImc());

        System.out.println("----------------------------------------------");
    }



}
