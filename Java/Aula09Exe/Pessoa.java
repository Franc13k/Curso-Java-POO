package Aula09Exe;

public class Pessoa {

    //Atributos
    private String nome;
    private int idade;
    private String sexo;

    //Métodos
    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }  

    //Métodos especiais
    public Pessoa(String n, int idad, String s) {
        this.nome = n;
        this.idade = idad;
        this.sexo = s;
    }


    public String getNome(){
        return this.nome;

    }

    public void setNome(String n){
        this.nome = n;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idad){
        this.idade = idad;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String s){
        this.sexo = s;
    }
}
