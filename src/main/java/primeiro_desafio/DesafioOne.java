package primeiro_desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DesafioOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();
        int totalLinhas;

        do {
            System.out.println("Digite a quantidade de linhas de entrada (Regra: O número deve ser inteiro e positivo): ");
            totalLinhas = scan.nextInt();

        } while (totalLinhas <= 0);

        for (int i = 0; i < totalLinhas; i++) {

            int numero;
            do {
                System.out.println("Digite o valor de entrada para cada linha (Regra: O número deve ser inteiro e positivo): ");
                System.out.print((i + 1) + "ª. número: ");
                numero = scan.nextInt();
            } while (numero <= 0);
            numeros.add(numero);

            if (numeros.get(i) % 2 == 0) {
                numerosPares.add(numero);
                Collections.sort(numerosPares);
            } else {
                numerosImpares.add(numero);
                Collections.sort(numerosImpares, Collections.reverseOrder());
            }
        }

        System.out.println("Numeros Digitados: " + numeros.toString());
        System.out.println("Números pares: " + numerosPares.toString());
        System.out.println("Números Impares: " + numerosImpares.toString());
    }
}
