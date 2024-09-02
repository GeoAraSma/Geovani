import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Alunos aluno1 = new Alunos("Geovani", 2006, 67, 1.67f);

        Imc imc = new Imc();

        System.out.print("Digite o nome: ");
        String nome = sc.next();

        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        System.out.print("Digite o peso: ");
        int peso = sc.nextInt();

        System.out.print("Digite a altura: ");
        float altura = sc.nextFloat();

        Alunos aluno2 = new Alunos(nome, ano, peso, altura);

        imc.calculoImc();
        aluno2.informacoes();

    }
}
