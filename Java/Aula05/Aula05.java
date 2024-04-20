package Aula05;

public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1234);
        p1.setDono("Joao");
        p1.abrirConta("CC");
        

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(1334);
        p2.setDono("Carlos");
        p2.abrirConta("CP");

        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(350);
        p1.fecharConta();

        p1.estadoAtual();
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        p2.estadoAtual();
    }
}
