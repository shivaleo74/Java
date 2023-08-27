package process;

public class BankFactory extends AbstractFactory
{
    public Bank getBank(String bank)
    {
        if(bank==null)
        {
            return null;
        }

        if(bank.equalsIgnoreCase("HDFC"))
        {
            return new HDFC();
        }
        if(bank.equalsIgnoreCase("ICICI"))
        {
            return new ICICI();
        }
        if(bank.equalsIgnoreCase("SBI"))
        {
            return new SBI();
        }
        return null;
    }

    public Loan getLoan(String loan)
    {
        return null;
    }
}
