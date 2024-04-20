package Aula09Exe;

public class Livro implements Publicacao{

    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos

    public Livro(String tt, String at, int tp, Pessoa lt) {
        this.titulo = tt;
        this.autor = at;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = lt;
    }
    
    public String detalhes() {
        return "==================================" + 
        "  \nLivro: " + titulo + "\n Autor: " + autor + "\n Total de Paginas: " + totPaginas + 
        "\n Pagina Atual: " + pagAtual + "\n Esta aberto? " + aberto + "\n Nome do leitor: " + leitor.getNome() + 
        "\n Idade do leito: " + leitor.getIdade() + "\n Sexo do leitor: " + leitor.getSexo()
        + "\n =====================================";
    }

    @Override
    public void abrir() {
        this.aberto = true;
        
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
        
    }



    @Override
    public void fechar() {
        this.aberto = false;
        
    }



    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
        
        }else{
            this.pagAtual = p;
        
        }
        
    }



    @Override
    public void voltarPag() {
        this.pagAtual--;
        
    }



    //Métodos especiais


    public String getTitulo(){
        return this.titulo;

    }

    public void setTitulo(String tt){
        this.titulo = tt;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String at) {
        this.autor = at;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int tp) {
        this.totPaginas = tp;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pa) {
        this.pagAtual = pa;
    }

    public boolean isAberto() {
        return this.aberto;
    }

    public void setAberto(boolean ab) {
        this.aberto = ab;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa lt) {
        this.leitor = lt;
    }

    
    
}
