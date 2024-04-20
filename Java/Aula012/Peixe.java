package Aula012;

public class Peixe extends Animal { 
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltou uma bolha...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substancias...");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz somo bobo");
        
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
        
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
