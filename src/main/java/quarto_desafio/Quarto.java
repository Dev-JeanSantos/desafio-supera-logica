package quarto_desafio;

import java.util.Scanner;

public class Quarto {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Quantidade de linhas para decifrar: ");
        int linhas = scn.nextInt();

        System.out.println("Frases para decifrar: ");
        for (int i = 0; i < linhas; i++) {

            String frase = ajustarLinha(scn);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2));

            reverterLinha(parte1);
            reverterLinha(parte2);

            imprimirLinhaFinal(parte1, parte2);

        }
    }

    public static String ajustarLinha(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty())
            line = leitor.nextLine();
        return line;
    }
    public static StringBuilder reverterLinha(StringBuilder linhas){
        return linhas.reverse();
    }

    public static void imprimirLinhaFinal(StringBuilder linha1, StringBuilder linha2){
        System.out.println(linha1.toString() + linha2.toString());
    }
}