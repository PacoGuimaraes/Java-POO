package Main;
import ContaCorrente.ContaCorrente;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        System.out.print("Digite o valor da sua conta:");
        float saldo = teclado.nextFloat();
        System.out.print("Digite o valor que quer depositar:");
        float deposito = teclado.nextFloat();
        System.out.print("Digite o valor que quer sacar:");
        float sacar = teclado.nextFloat();

        c1.ValorInicial(saldo);
        c1.deposito(deposito);
        System.out.println(c1.getsaldo());
        c1.Sacar(sacar);
        System.out.println(c1.getsaldo());
        c1.setsaldo(10);
        System.out.println(c1.getsaldo());
    }
}