package Aula07;

public class Aula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] =  new Lutador("Pretty Boy", "Franca", 31, 2, 11, 1, 1.75f, 68.9f);   
            
        l[1] =  new Lutador("Putscript", "Brasil", 29, 2, 14, 3, 1.68f, 57.8f);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 2, 12, 1, 1.65f, 80.9f);

        l[3] = new Lutador("Dead Code", "Australia", 28, 0, 13, 2, 1.93f, 81.6f);

        l[4] = new Lutador("UFOCobol", "Brasil", 37, 4, 5, 3, 1.70f, 119.3f);

        l[5] = new Lutador("Nerdaart", "EUA", 30, 2, 12, 4, 1.81f, 105.7f);

        //l[2].apresentar()
        //l[2].status()

        for (Lutador lutador: l) {
            lutador.apresentar();
            lutador.status();
        }


    }
}