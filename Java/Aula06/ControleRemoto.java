package Aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //Método Construtor

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos especiais

    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean l){
        this.ligado = l;
    }

    private boolean getTocando(){
        return this.tocando;
    }

    private void setTocando(boolean t){
        this.tocando = t;
    }

    //Métodos

    public void ligar(){
        this.setLigado(true);
    }

    public void desligar(){
        this.setLigado(false);
    }

    public void abrirMenu(){
       System.out.println(this.getLigado());
       System.out.println(this.getTocando());
       System.out.println(this.getVolume());

       for (int i = 0; i <= this.getVolume(); i += 10){
            System.out.println("[]");
       }
    }

    public void fecharMenu(){
        System.out.println("Fechando menu...");
    }

    public void maisVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 1);
        }
    }

    public void menosVolume(){
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }

    }

    public void ligarMudo(){
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    public void desligarMudo(){
        if (this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    public void play(){
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
            System.out.println("PLAY...");
        }
    }

    public void pause(){
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
            System.out.println("PAUSE...");
        }
    }
}
