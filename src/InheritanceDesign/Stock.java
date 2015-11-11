package InheritanceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class Stock extends Security
{
        String _name;
        int _quantity;
        double _price;
        
    public Stock(String name, int quantity, double price)
    {
        _name = name;
        _quantity = quantity;
        _price = price;
        
    }
    
    public Double getAssetValue()
    {
        return _quantity * _price;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%1s, Stock, Shares Owned: %2s, Price: $%3s, Value: $%4s",_name, _quantity, df.format(_price), df.format(getAssetValue()));
    }
}
