package Main;
import Sequencia.SequenciaNum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int p = teclado.nextInt();
    SequenciaNum s1 = new SequenciaNum(x, y);

    s1.imprimirSequencia(p);

        }
    }
