package Aula013;

public class Aula013 {
    public static void main(String[] args) {
        
        Cachorro c = new Cachorro();

        c.reagir("Ola");
        c.reagir("Vai apanhar");
        System.out.println("=======================");
        System.out.println(" ");

        c.reagir(11, 45);
        c.reagir(21, 00);
        System.out.println("=======================");
        System.out.println(" ");

        c.reagir(true);
        c.reagir(false);
        System.out.println("=======================");
        System.out.println(" ");

        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
        System.out.println("=======================");
        System.out.println(" ");
    }
}
