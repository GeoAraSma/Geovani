import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta(500.00);
        Scanner sc = new Scanner(System.in);
        int[] cmdsVlds = {1,2,3,4};
        int rspt;
        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Qual operação deseja realizar?");
            System.out.println(" * 1 - Depósito");
            System.out.println(" * 2 - Sacar");
            System.out.println(" * 3 - Consultar Saldo");
            System.out.println(" * 4 - Terminar Operação");
            boolean validacao = false;
            do {
                System.out.print("- ");
                rspt = sc.nextInt();
                for (int i = 0; i < cmdsVlds.length; i++) {
                    if (rspt==cmdsVlds[i]) {
                        validacao = true;
                        break;
                    }
                }
                if (!validacao) {
                    System.out.println("Operação inválida, tente de novo.");
                }
            } while (!validacao);

            if (rspt==cmdsVlds[0]) {
                System.out.println("Qual quantia pretende depositar?");
                int depos = sc.nextInt();
                conta1.depositar(depos);
            }else if(rspt==cmdsVlds[1]){
                System.out.println("Qual quantia pretende sacar?");
                int saque = sc.nextInt();
                conta1.sacar(saque);
            } else if (rspt==cmdsVlds[2]) {
                conta1.getSaldo();
            }
        }while (rspt!=cmdsVlds[3]);
        System.out.println("Operação finalizada.");
    }
}
