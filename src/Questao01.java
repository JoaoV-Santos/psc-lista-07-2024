import java.util.ArrayList;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> temperaturas = new ArrayList<>();
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o valor do temperatura de " + meses[i] + ":");
            temperaturas.add(in.nextDouble());
        }
        double media = 0;
        for (int i = 0; i < temperaturas.size(); i++) {
            media += temperaturas.get(i);
        }
        media = media / temperaturas.size();

        System.out.println("\nMédia da temperatura anual: " +  media + "Cº");
        System.out.println("Meses com temperatura acima da média anual:\n");

        for (int i = 0; i < temperaturas .size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println(meses[i] + " - " + temperaturas.get(i) + "Cº");
            }
        }

        in.close();
    }
}
