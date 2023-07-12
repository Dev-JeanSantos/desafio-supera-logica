package terceiro_desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        System.out.println("Entre com o tamanho do seu array: ");
        int tamanhoArray = scan.nextInt();

        System.out.println("Entre com o valor alvo: ");
        int valorAlvo = scan.nextInt();

        System.out.println("Entre com os valores para popular o array: ");
        int numero;

        for (int i = 0; i < tamanhoArray; i++) {
            numero = scan.nextInt();
            numeros.add(numero);
        }

        Collections.sort(numeros, Collections.reverseOrder());

        int contador = compararResultado(numeros, valorAlvo);

        System.out.println("Array: " + numeros);
        System.out.println("Quantidade de valores : " + contador);
    }

    private static int compararResultado(ArrayList<Integer> array, int alvo ){
        int count = 0;
        for (int x : array) {
            int resultadoSubtracao = x - alvo;
            if (array.contains(resultadoSubtracao)) {
                count++;
            }
        }
        return count;
    }
}
