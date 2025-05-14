package Sequencia;

public class SequenciaNum {
    private int primeiroN;
    private int ultimoN;
    private int p = 1;


    public SequenciaNum(int primeiroN, int ultimoN) {
        this.primeiroN = primeiroN;
        this.ultimoN = ultimoN;
    }

    public void imprimirSequencia() {
        for (int i = primeiroN; i <= ultimoN; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


    public void imprimirSequencia(int p) {
        for (int i = primeiroN; i <= ultimoN; i += p) {
            System.out.println(i);
        }
    }


}
