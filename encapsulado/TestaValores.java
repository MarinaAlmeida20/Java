package Java_First.Java.encapsulado;

public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(1337, 24226);

        System.out.println(conta.getAgencia());

        //Conta conta2 = new Conta(1334, 12345);
        //Conta conta3 = new Conta(4555, 12334);

        System.out.println(Conta.getTotal());

    }
}
