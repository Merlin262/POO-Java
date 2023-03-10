import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static ArrayList<Integer> criarLista(int tamanho){

        Random gerador = new Random();

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < tamanho; i++) {
            numeros.add(gerador.nextInt(101));
        }
        System.out.println(numeros);
        return numeros;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista: ");
        int tamanho = scanner.nextInt();

        ArrayList<Integer> numeros = criarLista(tamanho);

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero + " é par");
            } else if (numero % 3 == 0) {
                System.out.println(numero + " é múltiplo de 3");
            } else {
                System.out.println(numero + " é ímpar e não é múltiplo de 3");
            }
        }
    }
}
