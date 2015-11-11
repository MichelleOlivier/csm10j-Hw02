package InheritanceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class Bond extends Security
{
    String _name;
    double _pricePerBond;
    int _quantity;
        
    public Bond(String name, double pricePerBond, int quantity)
    {
        _name = name;
        _quantity = quantity;
        _pricePerBond = pricePerBond;
    }
        
    public Double getAssetValue()
    {
        return _quantity * _pricePerBond;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%1s, Bond, Shares Owned: %2s, Price: $%3s, Value: $%4s", _name, _quantity, df.format(_pricePerBond), df.format(getAssetValue()));
    }
}
