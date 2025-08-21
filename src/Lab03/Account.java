package Lab03;

public class Account {

    private String name;
    private double balance;
    private int num;
    private double limit;




    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void imprime() {
    System.out.printf("----------------------------------------\n Nome do usuario:%s%n Numero da conta:%d%n Saldo disponivel:%.2f%n Limite disponivel:%.2f%n ",getName(),getNum(),getBalance(),getLimit());

    }
}

