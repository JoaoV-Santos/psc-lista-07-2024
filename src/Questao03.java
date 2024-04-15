import java.util.Scanner;
import java.util.ArrayList;

public class Questao03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();
        double nota = 0;

        do {
            System.out.println("Informe uma nota:");
            nota = in.nextDouble();
            if (nota != -1)
                notas.add(nota);
        } while (nota != -1);

        System.out.println("Quantidade de notas que foram lidas: " + notas.size());
        System.out.println("Valores que foram informados: " + notas);
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }
        double soma = 0;
        for (double n : notas)
            soma += n;

        System.out.println("Soma das notas informadas: " + soma);
        System.out.printf("Média das notas informadas: %.2f%n" , (soma / notas.size()));
        int acimaDaMedia = 0;

        for (double n : notas) {
            if (n > (soma / notas.size()))
                acimaDaMedia++;
        }
        System.out.println("Quantidade de notas acima da média: " + acimaDaMedia);

        int abaixoDeSete = 0;
        for (double n : notas) {
            if (n < 7)
                abaixoDeSete++;
        }
        System.out.println("Quantidade de notas abaixo de sete: " + abaixoDeSete);
        System.out.println("Fim do Programa!");



        in.close();
    }
}
