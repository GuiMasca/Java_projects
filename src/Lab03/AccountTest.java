package Lab03;


public class AccountTest {

public static void main(String[] args){

    Account conta1 = new Account();
    Account conta2 = new Account();
    Account conta3 = new Account();

    conta1.setName("Paulo");
    conta1.setLimit(10000);
    conta1.setNum(01);
    conta1.imprime();
    conta1.deposit(500);
    conta1.withdraw(252);
    conta1.MudarSenha("0000","6969");


    conta2.setName("Marlene");
    conta2.setLimit(8000);
    conta2.setNum(02);
    conta2.imprime();
    conta2.deposit(777);
    conta2.withdraw(111);
    conta2.MudarSenha("0001","7654");


    conta3.setName("Jeremias");
    conta3.setLimit(1000);
    conta3.setNum(03);
    conta3.imprime();
    conta3.deposit(111.99);
    conta3.withdraw(2000);
    conta3.MudarSenha("0000","1222");








    }
}
