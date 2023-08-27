package process;

// Create concrete classes that extend the Loan abstract class..

public class BusinessLoan extends Loan
{
    public void getInterestRate(double r)
    {
        rate = r;
    }
}
