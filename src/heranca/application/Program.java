package heranca.application;

import heranca.entities.Account;
import heranca.entities.BusinessAccount;
import heranca.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
    Account acc = new Account("Walmir",1001, 0.0);
      BusinessAccount bacc = new BusinessAccount("Maria",1002, 0.0 ,500.0);

        //UPCASting
        //podemos fazer um upcasting ja que aprendemos na aula de herança
        //que ela e uma relação de "e 1" ou seja uma BussineAccount e tambem uma
        //conta então como ela e uma conta eu  posso muito bem atribui um objeto do
        //tipo empresarial para um objeto do tipo conta
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount("bob",1003, 0.0, 200.0);




        //DOWNCASTING
        /**
         * Por não saber se oque esta variavel acc2 e do tipo Bussines
         * Account nesse caso a conversão não e natural logo vou ter de
         * fazer um casting manual
         * note que na variavel acc2 não e possivel fazer o uso da
         * operação loan  acc2.loan.
         * Então caso eu queira realizar um emprestimos de uma variavel que e originalmente Account , tenho de fazer
         * o casting no caso o Downcasting dela assim como no exemplo abaixo
         */
        BusinessAccount acc4  = (BusinessAccount) acc2;
        acc4.loan(100.0);

        /**
         * A variavel acc3 foi instanciada como SavingsAccount logo
         * não  e possivel realizar essa atribuição pois a ordem a herança
         * que estabelecemos foi que ,SavingsAccount ' e 1 'Account e não
         * um BussinesAccount. Mas como o compilador não sabe que o acc3 e um
         * SavingsAccount, so vai dar erro quando executar a aplicação
         */
        Account acc3 = new SavingsAccount("Ana", 1004, 0.0 , 0.01);
        BusinessAccount acc5 = (BusinessAccount) acc3;



    }
}
