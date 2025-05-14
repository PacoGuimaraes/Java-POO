package itemProduto;

public class ItemProduto {
    private String nomeProduto;
    private int quantidadeComprada;
    private float precoUnitario;
    private float subTotal;

    public ItemProduto(String nomeProduto, int quantidadeComprada, float precoUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
        calculaSubtotal();
    }
    private void calculaSubtotal(){
        this.subTotal = this.precoUnitario * this.quantidadeComprada;
    }

    public void NovaQuantidade(int x){
        if (x < 1){
            System.out.println("Seu valor não pode ser menor que 1");
        }
        else {
            this.quantidadeComprada = x;
            calculaSubtotal();
        }

    }
    public void AtualizarPreco(float x){
        if (x <= 0){
            System.out.println("Seu valor é 0 ou negativo");
        }
        else {
            this.precoUnitario = x;
            calculaSubtotal();
        }
    }
    public void ExibirInformacao(){
        System.out.println("Nome do produto é:" + nomeProduto);
        System.out.println("Quantidade do carrinho é:" + quantidadeComprada);
        System.out.println("Preco unitario é de:" + precoUnitario);
        System.out.println("O subtotal é de:" + subTotal);
    }

}
