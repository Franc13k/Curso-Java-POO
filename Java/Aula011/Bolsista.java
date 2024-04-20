package Aula011;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa do aluno...");

    }

    @Override
    public void pagarMensal(){
        System.out.println(this.nome + " e bolsita! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    
}
