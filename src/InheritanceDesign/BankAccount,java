package InheritanceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class BankAccount extends Asset
{

    String _name;
    double _balance;
        
    public BankAccount(String name, double balance)
    {
        _name = name;
        _balance = balance;
    }
    
    public Double getAssetValue()
    {
        return _balance;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%1s, Bank Account, Balance: $%2s", _name, df.format(_balance));
    }
}
