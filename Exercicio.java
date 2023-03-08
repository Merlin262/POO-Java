import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercicio {

    public static ArrayList criarLista(int tamanho){

        Random gerador = new Random();

        ArrayList lista = new ArrayList();
        for (int i = 0; i < tamanho; i++) {
            lista.add(gerador.nextInt(101));
        }
        System.out.println(lista);
        return lista;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho da lista: ");
        int tamanho = scanner.nextInt();

        criarLista(tamanho);

        for(i=0; i==tamanho; i++){
            if (lista[i]%2==0){
                
            }
        }
    }
}
