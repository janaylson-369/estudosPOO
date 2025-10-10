public class Programa {
    public static void main(String[] args) {
        // Criar três objetos da classe Conta
        Conta c1 = new Conta(1001, "Ana Silva");
        Conta c2 = new Conta(1002, "Bruno Souza");
        Conta c3 = new Conta(1003, "Carla Pereira");

        // Exibir o estado das contas
        System.out.println("Estado inicial das contas:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
        System.out.println("--------------");

        // Realizar um depósito em cada conta
        c1.depositar(1000.00);   // depositar 1000.00 na conta 1
        c2.depositar(2000.50);   // depositar 2000.50 na conta 2
        c3.depositar(500.00);    // depositar 500.00 na conta 3

        System.out.println("Após depósitos:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
        System.out.println("--------------");

        // Alterar o nome do cliente em cada conta
        c1.setNomeCliente("Ana Maria Silva");
        c2.setNomeCliente("Bruno A. Souza");
        c3.setNomeCliente("Carla M. Pereira");

        System.out.println("Após alteração de nomes:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
        System.out.println("--------------");

        // Realizar um saque em cada conta
        c1.sacar(200.00);        // saque 200.00 da conta 1
        c2.sacar(1500.50);       // saque 1500.50 da conta 2
        c3.sacar(300.00);        // saque 300.00 da conta 3

        System.out.println("Após saques:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
        System.out.println("--------------");

        // Desative duas contas
        c1.desativar();
        c3.desativar();

        System.out.println("Após desativar duas contas:");
        c1.exibir();
        c2.exibir();
        c3.exibir();
        System.out.println("--------------");
    }
}