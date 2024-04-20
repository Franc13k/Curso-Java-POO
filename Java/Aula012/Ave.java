package Aula012;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Construindo um ninho...");

    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas...");
        
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave...");
        
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    
}