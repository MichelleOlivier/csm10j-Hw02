package InterfaceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class House implements Asset, Debt
{
    double _value;
    double _loan;
    String _name;
    
     @Override
     public String toString()
     {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("Address: %1s, House, Value: $%2s, Debt: $%3s", _name, df.format(_value), df.format(_loan));
     }
     
    public House(String name, double value, double loan)
    {
        _value = value;
        _loan = loan;
        _name = name;
    }
    
    public Double getDebtAmount()
    {
        return _loan;
    }
    
    public Double getAssetValue()
    {
        return _value - _loan;
    }
}
