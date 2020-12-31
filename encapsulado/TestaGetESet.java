package Java_First.Java.encapsulado;

public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(2224, 14252);
        //conta.numero = 1337; [Nao funciona com o privado]
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo = new Cliente();
        //conta.titular = paulo;
        paulo.setNome("Paulo Silveira");

        conta.setTitular(paulo);

        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());

        // agora em duas linhas
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
        System.out.println(conta.getTitular().getProfissao());


    }
    
}
