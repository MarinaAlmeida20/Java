package Java_First.Java.composto;

public class TestaSacaNegativo {
    
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));
    

        conta.saca(101);
        System.out.println(conta.getSaldo());

        // proibido:
        //conta.saldo = conta.saldo - 101;
        //System.out.println(conta.saldo);
    }
}
