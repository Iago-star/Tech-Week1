  import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua pergunta ou problema para a IA: ");
        String pergunta = scanner.nextLine();

        String respostaIA = "A IA analisou os dados e gerou esta resposta.";
        System.out.println("\n[MÁQUINA] Resposta gerada pela IA: " + respostaIA);

        System.out.print("\n[HUMANO] Você valida esta resposta com base no seu raciocínio crítico? (sim/nao): ");
        String concorda = scanner.nextLine();

        if (concorda.equalsIgnoreCase("sim")) {
            System.out.println("\nResultado: Resposta aprovada e pronta para ser utilizada.");
        } else {
            System.out.println("\nResultado: Resposta rejeitada. Cabe ao humano reavaliar e corrigir a solução.");
        }

        scanner.close();





















    }
}
