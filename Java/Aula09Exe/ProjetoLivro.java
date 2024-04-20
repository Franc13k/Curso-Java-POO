package Aula09Exe;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, " M");
        p[1] = new Pessoa("Joao", 25, "M");
        
        l[0] = new Livro("Biblia Sagrada", null, 950, p[0]);
        l[1] = new Livro("Aprendendo Java", "Jose da Silva", 300, p[1]);
        l[2] = new Livro("100% Presente", "Joel Jota", 158, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());

    }    
}

