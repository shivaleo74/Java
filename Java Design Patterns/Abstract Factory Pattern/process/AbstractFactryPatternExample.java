package process;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractFactryPatternExample 
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the name of Bank from where you want to take loan amount");
        String bankName = br.readLine();

        System.out.println("\n");
        System.out.println("Enter the type of loan Ex: HomeLaon or Business Laon or Education Loan");
        String loanName = br.readLine();

        AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
        Bank b = bankFactory.getBank(bankName);

        System.out.println("\n");
        System.out.println("Enter the interest rate for :" + b.getBankName() + ": ");
        double rate = Double.parseDouble(br.readLine());

        System.out.println("\n");
        System.out.println("Enter the loan amount you want to take:");
        double loanAmount = Double.parseDouble(br.readLine());

        System.out.println("\n");
        System.out.println("Enter the number of years to pay your entire loan amount");
        int years = Integer.parseInt(br.readLine());

        System.out.println("\n");
        System.out.println("You are taking the loan from " + b.getBankName());

        AbstractFactory loanFactory = FactoryCreator.getFactory("loan");
        Loan l = loanFactory.getLoan(loanName);
        l.getInterestRate(rate);
        l.calculateLoanPayment(loanAmount, years);
    }
}
