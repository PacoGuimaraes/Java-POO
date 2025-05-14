package ContaCorrente;

public class ContaCorrente {
    private float saldo;

public float getsaldo(){
    return saldo;
    }
public void deposito(float dep) {
    if (dep > 0) {
        this.saldo += dep;
        System.out.println("Seu deposito foi feito!");
    }
}
public void Sacar(float saq){
    if (saq >= 0 && (saq + 1.5) <= saldo){
        this.saldo = saldo - (saq + 1.5f);
        System.out.println("Seu saque foi feito!");
    }
    else {
        System.out.println("Você não tem saldo suficiente");
    }
}
public void ValorInicial(float inicio){
    this.saldo = inicio;
    System.out.println("Esse é seu saldo inicial:"+  this.saldo);
}

public void setsaldo(float x){
    this.saldo = x;
}
}

