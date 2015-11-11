package InheritanceDesign;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author Michelle
 */
public class Wealth 
{
    ArrayList<Asset> _assets = new ArrayList<Asset>();
   
    public void addAsset(Asset asset)
    {
        _assets.add(asset);
        
    }
    public Double getNetWorth()
    {
        return getTotalAssets() - getTotalDebts();
    }
    
    public Double getTotalAssets()
    {
        Double _totalAsset = 0.00;
        for (Asset asset : _assets)
        {
            _totalAsset += asset.getAssetValue();
        }
        return _totalAsset;
    }
    
    public String getAssetSummary()
    {
        String _summary = "";
        for (Asset asset : _assets)
        {
            _summary = _summary + asset.toString() + "\n";
        }
        return _summary;
    }
    
    public Double getTotalDebts()
    {
        Double _totalDebt = 0.00;
        for (Asset asset : _assets)
        {
            if (asset instanceof Property)
            {
                _totalDebt += ((Property)asset).getDebtAmount();
            }
        }
        return _totalDebt;
    }
    
    @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("Total Net Worth: $%1s; Assets: $%2s; Debts: $%3s", 
                df.format(getNetWorth()), df.format(getTotalAssets()), df.format(getTotalDebts()));
    }
    

}

