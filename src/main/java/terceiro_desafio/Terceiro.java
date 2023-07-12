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

        int pos = 0;
        int count = 0;

        for (int x: numeros ) {
            if(numeros.get(pos) - numeros.get(pos + 1) == valorAlvo){
                count++;
                System.out.println("count: "+count);
            }
        }
        System.out.println("Array: "+ numeros);
    }
}
