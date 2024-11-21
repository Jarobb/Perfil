import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double nota = 0;
        double avaliacaoMedia = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação do filme ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1){
                avaliacaoMedia += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + avaliacaoMedia / totalDeNotas);

    }
}