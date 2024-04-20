package Aula05;

/**
 * ContaBanco
 */
public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos especiais
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nc){
        this.numConta = nc;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }

    public void setStatus(boolean st){
        this.status = st;
    }


    //Métodos
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());

    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t == "CC") {
            this.setSaldo(50f);
            System.out.println("Conta aberta com sucesso!!");
        }else if (t == "CP"){
            this.setSaldo(150f);
            System.out.println("Conta aberta com sucesso!!");
        }
        
    }

    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Conta com dinheiro!!");

        } else if (this.getSaldo() < 0){
            System.out.println("Conta em debito!!");

        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar!!");

        }

    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        }else{
            System.out.println("Impossivel sacar!!");
        }

    }
    
    public void pagarMensal(){
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }

        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensailidade paga com sucesso por " + this.getDono());
        }else {
            System.out.println("Impossivel pagar!");
        }
    }
}





