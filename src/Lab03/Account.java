package Lab03;

public class Account {

    private String name;
    private double balance;
    private int num;
    private double limit;
    private String senha;


    public Account(){
        this.name = "";
        this.num = 0;
        this.limit = 0.0;
        this.balance = 0.0;
        this.senha = "0000";
    }

    public Account(String name, int num, double limit){
        this.name = name;
        this.num = num;
        this.limit = limit;
        this.balance = 0.0;
        this.senha = "0000";
    }

    public void deposit(double value){
        if(value > 0)
        {
            this.balance += value;
            System.out.println("Depósito realizado:" + balance);
        }
        else{
            System.out.println("Não houve depósito");
        }
    }

    public void withdraw(double value){
        if(value<=0)
        {
            System.out.println("Valor invalido");
            return;
        }

        if(balance > 0 && value <= limit)
        {
            balance -= value;
            System.out.println("Saque realizado com sucesso: " + balance);
        }
        else{
            System.out.println("Ausência de saldo ou estouro de limite");
        }

    }

    public void MudarSenha(String senhaAnt, String senhaNova)
    {
        if(this.senha.equals(senhaAnt))
        {
            this.senha = senhaNova;
            System.out.println("Senha alterada!");
        }
        else
        {
            System.out.println("Impossivel alterar a senha, senha incorreta!");
        }
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

