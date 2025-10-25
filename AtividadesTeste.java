import java.util.Scanner;

public class AtividadesTeste {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu e-mail: ");
        String email = entrada.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = entrada.nextLine();

        System.out.println("Login realizado com sucesso!");
        System.out.println("E-mail utilizado: " + email);
        System.out.println("Senha digitada: " + senha);

        if (email.equals(email) && senha.equals(senha)) {
            System.out.println("Login Autorizado");
        } else {
            System.out.println("Acesso Negado!");
        }

        entrada.close();
    }
    
}

class Nome{
    public static void main(String[] args) {
        double preco = 100;
        double desconto = 0.5;
        double precoFinal = preco * desconto;
        
        System.out.println(precoFinal);

        if (precoFinal >= preco){
            System.out.println("Tivemos um erro no Sistema, tente novamente mais tarde! Por favor!");
        } else {
            System.out.println("Seu produto foi descontado com sucesso! Aproveite e volte sempre!");
        }
    }
}
