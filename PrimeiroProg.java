public class PrimeiroProg {
    public static void main(String[] args){
        String nome = "Felipi";
        int idade = 17;
        double altura = 1.78;
        boolean cristao = true;

        System.out.println("Meu nome é " + nome);
        System.out.println("Tenho " + idade + " anos.");
        System.out.println("Minha altura é " + altura);

        if (cristao) {
            System.out.println("Sou cristão e sigo a Cristo!");
        } else {
            System.out.println("Ainda não conheço a Cristo.");
        }
    }
}