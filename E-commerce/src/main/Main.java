package main;
import java.util.Scanner;
import itemProduto.ItemProduto;

public class Main {
    public static void main(String[] args) {
        ItemProduto IP1 = new ItemProduto("paco", 3, 3.5F);
        IP1.ExibirInformacao();
        IP1.NovaQuantidade(4);
        IP1.AtualizarPreco(5.5F);
        IP1.ExibirInformacao();



    }
}
