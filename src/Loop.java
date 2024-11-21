import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double avaliacaoMedia = 0;

        for (int i = 0; i < 3 ; i++) {
            System.out.println("Diga sua avaliação do filme ");
            nota = leitura.nextDouble();
            avaliacaoMedia += nota;
        }

        System.out.println("Média de avaliações: " + avaliacaoMedia/3);

    }
}
