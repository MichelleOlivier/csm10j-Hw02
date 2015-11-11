package InheritanceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class House extends Property
{
        double _value;
        double _loan; 
        
    public House(String _name, double value, double loan)
    {
        _value = value;
        _loan = loan;
        name = _name;

    }
    public Double getAssetValue()
    {
        return _value - _loan;
    }
    
    public Double getDebtAmount()
    {
        return _loan;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("Address: %1s, House, Value: $%2s, Debt: $%3s", name, df.format(_value), df.format(_loan));
    }
}
