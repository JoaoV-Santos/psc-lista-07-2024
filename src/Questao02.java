import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList <Character> interrogatorio = new ArrayList<>();

        System.out.println("INTERROGATÓRIO (RESPONDA 'S' PARA SIM E 'N' PARA NÃO:\n");

        System.out.println("Telefonou para a vítima?");
        interrogatorio.add(in.nextLine().charAt(0));
        System.out.println("Esteve no local do crime?");
        interrogatorio.add(in.nextLine().charAt(0));
        System.out.println("Mora perto da vítima?");
        interrogatorio.add(in.nextLine().charAt(0));
        System.out.println("Devia para a vítima?");
        interrogatorio.add(in.nextLine().charAt(0));
        System.out.println("Já trabalhou com a vítima?");
        interrogatorio.add(in.nextLine().charAt(0));

        int contador = 0;

        for (char resposta : interrogatorio) {
            if (resposta == 'S' || resposta == 's') {
                contador++;
            }
        }
        if (contador == 2)
            System.out.println("Suspeito");
        else if (contador >= 3 && contador <= 4) {
            System.out.println("Cúmplice");
        }
        else if (contador == 5) {
            System.out.println("Assassino");
        }
        else
            System.out.println("Inocente");

        in.close();
    }
}
