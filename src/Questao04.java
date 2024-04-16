import java.util.ArrayList;
import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Double> vendas = new ArrayList<Double>();
        double comissao = 0;
        int num = 0;

        do {
            num++;
            System.out.println("Informe a quantidade que o o vendedor " + num + " vendeu:");
            comissao = in.nextDouble();
            if (comissao != -1)
                vendas.add(200 + (comissao * 0.09));
        } while (comissao != -1);

        System.out.println(vendas);
        int v1 = 0, v2 = 0, v3 = 0, v4 = 0, v5 = 0, v6 = 0, v7 = 0, v8 = 0, v9 = 0;
        for (double salario : vendas) {
            if (salario >= 200 && salario <=299)
                v1++;
            else if (salario >= 300 && salario <=399)
                v2++;
            else if (salario >= 400 && salario <=499)
                v3++;
            else if (salario >= 500 && salario <=599)
                v4++;
            else if (salario >= 600 && salario <=699)
                v5++;
            else if (salario >= 700 && salario <=799)
                v6++;
            else if (salario >= 800 && salario <=899)
                v7++;
            else if (salario >= 900 && salario <=999)
                v8++;
            else if (salario >= 1000)
                v9++;
        }
        System.out.println("Quantidade de vendedores que receberam entre $200 e $299: " + v1);
        System.out.println("Quantidade de vendedores que receberam entre $300 e $399: " + v2);
        System.out.println("Quantidade de vendedores que receberam entre $400 e $499: " + v3);
        System.out.println("Quantidade de vendedores que receberam entre $500 e $599: " + v4);
        System.out.println("Quantidade de vendedores que receberam entre $600 e $699: " + v5);
        System.out.println("Quantidade de vendedores que receberam entre $700 e $799: " + v6);
        System.out.println("Quantidade de vendedores que receberam entre $800 e $899: " + v7);
        System.out.println("Quantidade de vendedores que receberam entre $900 e $999: " + v8);
        System.out.println("Quantidade de vendedores que receberam mais de $1000: " + v9);

        in.close();
    }
}
