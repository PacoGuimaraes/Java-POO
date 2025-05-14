package VagaEstacionamento;

public class VagaEstacionamento {
    private String indentificador;
    private String tipoVaga;
    private boolean status;
    private float valorHora;

    public VagaEstacionamento(String indentificador, String tipoVaga, boolean status, float valorHora) {
        this.indentificador = indentificador;
        this.tipoVaga = tipoVaga;
        this.status = status;
        this.valorHora = valorHora;
    }
    public void ocuparVaga(){
        if (status){
            this.status = false;
        }
        else System.out.println("Sua vaga está ocupada!");
    }
    public float liberarVaga(float x){
        this.status = true;
        return x * valorHora;
    }
    public void exibirInformacoes(){
        System.out.println("A identificação da sua vaga é de:" + indentificador);
        System.out.println("O tipo da sua vaga é:" + tipoVaga);
        System.out.println("O status atual da sua vaga é de:" + status);
        System.out.println("O valor por hora é de: " + valorHora);
    }
}
