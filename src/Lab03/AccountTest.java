package Lab03;


public class AccountTest {

public static void main(String[] args){

    Account conta1 = new Account();
    Account conta2 = new Account();
    Account conta3 = new Account();

    conta1.setName("Paulo");
    conta1.setBalance(355.78);
    conta1.setLimit(10000);
    conta1.setNum(01);
    conta1.imprime();

    conta2.setName("Marlene");
    conta2.setBalance(333.33);
    conta2.setLimit(8000);
    conta2.setNum(02);
    conta2.imprime();

    conta3.setName("Jeremias");
    conta3.setBalance(233.19);
    conta3.setLimit(1000);
    conta3.setNum(03);
    conta3.imprime();






    }
}
