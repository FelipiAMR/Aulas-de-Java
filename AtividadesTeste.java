import java.util.Scanner;

public class AtividadesTeste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "! Seja bem-vindo ao Java!");
        entrada.close();
    }
    
}
