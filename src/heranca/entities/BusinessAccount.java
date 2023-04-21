package heranca.entities;

/**@return
 * com o extends eu digo que a classe Bussines
 * ela vai ter todos os dados e comportamento da classe Account
 */

public class BusinessAccount extends Account{

    private  Double loanLimit;

    public  BusinessAccount(){

    }

    public BusinessAccount(String holder, Integer number, Double balance) {
        super(holder, number, balance);
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public  void loan(double amount){
        if(amount <= loanLimit)
          balance += amount - 10.0;

    }
}
