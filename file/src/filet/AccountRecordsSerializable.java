package filet;

import java.io.Serializable;

/**
 * Created by suffee on 2017/2/17.
 */
public class AccountRecordsSerializable implements Serializable {

    private int account_Number;
    private String name;
    private double money;

    public AccountRecordsSerializable(){

        this.setName("N/A");
        this.setMoney(0.0);
        this.setAccount_Number(0);

    }
    public AccountRecordsSerializable(int account_Number,String name,double money){

        this.setName(name);
        this.setMoney(money);
        this.setAccount_Number(account_Number);

    }

    public void setAccount_Number(int account_Number) {

        this.account_Number = account_Number;
    }

    public void setMoney(double money) {

        this.money = money;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getMoney() {

        return money;
    }

    public String getName() {

        return name;
    }

    public int getAccount_Number() {

        return account_Number;
    }
    public String toString(){

        return  this.getName()+this.getAccount_Number()+this.getMoney();
    }

}
