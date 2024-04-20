package Aula014;

public class Aula014 {
    public static void main(String[] args) {
        Video v[] = new Video[3];

        v[0] = new Video("Aula 02 de OOP");
        v[1] = new Video("Aula 12 de OOP");
        v[2] = new Video("Aula 05 de OOP");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jose", 22, "M", "zezim");
        g[1] = new Gafanhoto("Tiago", 17, "M", "tiaguin");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(87.0f);
        System.out.println(vis[1].toString());

        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());


    }
}
