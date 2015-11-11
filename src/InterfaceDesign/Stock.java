package InterfaceDesign;

import java.text.DecimalFormat;

/**
 *
 * @author Michelle
 */
public class Stock implements Asset
{
    String _name;
    int _quantity;
    double _price;
        
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("%1s, Stock, Shares Owned: %2s, Price: $%3s, Value: $%4s", _name, _quantity, df.format(_price), df.format(getAssetValue()));
    }
    
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
}
 
