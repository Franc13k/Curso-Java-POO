package Aula010;

public class Aluno extends Pessoa {
    //Atributos
    private int matr;
    private String curso;

    //Métodos
    public void cancelarMatr() {
        System.out.println("Matricula sera cancelada");
    }

    //Métodos Especiais
    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
}
