package main;
import VagaEstacionamento.VagaEstacionamento;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       VagaEstacionamento V1 = new VagaEstacionamento("A10","moto",true,10);
       V1.exibirInformacoes();
       V1.ocuparVaga();
       V1.exibirInformacoes();
       V1.liberarVaga(10);
       V1.exibirInformacoes();
    }
}
