import java.util.Scanner;

public class contador{
        public static void main(String[] args) throws Exception {
        int primeiroValor, segundoValor;
        Scanner inputDataTerminal = new Scanner (System.in);
        System.out.println("Insira o primeiro valor:");
        primeiroValor = inputDataTerminal.nextInt();
        System.out.println("Insira o segundo valor:");
        segundoValor = inputDataTerminal.nextInt();

        try {
            if (primeiroValor < segundoValor) {
               throw new RuntimeException ("O valores inseridos no pelo usuário foram "+primeiroValor+ " e "+segundoValor+ " Respectivamente"); 
            }
        } catch (RuntimeException contador) {
           System.out.println(contador.getMessage());
        }
}
}

