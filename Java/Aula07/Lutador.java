package Aula07;

public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private String categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura;
    private float peso;
    
    //Método Construtor

    public Lutador(String n, String nacio, int idad, int emp, int vit, int derro, float alt, float p){
        this.nome = n;
        this.nacionalidade = nacio;
        this.idade = idad;
        this.empates = emp;
        this.vitorias = vit;
        this.derrotas = derro;
        this.altura = alt;
        this.setPeso(p);

    }

    //Métodos especiais

    private String getNome() {
        return this.nome;
    }

    private void setNome(String n){
        this.nome = n;
    }

    private String getNacionalidade() {
        return this.nacionalidade;
    }

    private void setNacionalidade(String nacio){
        this.nacionalidade = nacio;
    }

    private String getCategoria() {
        return this.categoria;
    }

    private void setCategoria(){
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalido";

        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";

        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Medio";

        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso pesado";

        }else {
            this.categoria = "Invalido";
        }
    }

    private int getIdade() {
        return this.idade;
    }

    private void setIdade(int idad){
        this.idade = idad;

    }
    
    private int getEmpates() {
        return this.empates;
    }

    private void setEmpates(int emp){
        this.empates = emp;
    }

    private int getVitorias() {
        return this.vitorias;
    }

    private void setVitorias(int vit){
        this.vitorias = vit;
    }

    private int getDerrotas() {
        return this.derrotas;
    }

    private void setDerrotas(int derro){
        this.derrotas = derro;
    }

    private float getAltura() {
        return this.altura;
    }

    private void setAltura(float alt){
        this.altura = alt;
    }

    private float getPeso() {
        return this.peso;
    }

    private void setPeso(float p){
        this.peso = p;
        this.setCategoria();
    }

    //Métodos
    
    public void apresentar() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.println("Altura: " + this.getAltura() + " metros");
        System.out.println("Peso: " + this.getPeso() + " Kg");
        System.out.println("Vitorias: " + this.getVitorias() + " vitorias");
        System.out.println("Derrotas: " + this.getDerrotas() + " derrotas");
        System.out.println("Empates: " + this.getEmpates() + " empates");
    }

    public void status(){
        System.out.println(this.getNome());
        System.out.println("e um peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitorias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
    
}
