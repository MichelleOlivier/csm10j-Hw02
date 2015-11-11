package InterfaceDesign;
import java.text.DecimalFormat;
import java.util.ArrayList;
/**
 *
 * @author Michelle
 */
public class Wealth 
{
     ArrayList _debt = new ArrayList();
     ArrayList _asset = new ArrayList();
     
      public void addDebt(Debt debt)
      {
            _debt.add(debt);
      }
      
      public void addAsset(Asset asset)
      {
          if (asset instanceof Debt)
          {
              addDebt((Debt)asset);
          }
          else _asset.add(asset);
      }
      
      public Double getNetWorth()
      {
          return getTotalAssets() - getTotalDebts();
      }
      
      public Double getTotalAssets()
      {
        Double _totalAsset = 0.00;
        
        for (Object asset : _asset)
        {
            _totalAsset += ((Asset)asset).getAssetValue();
        }
        for (Object debt : _debt)
        {
            _totalAsset += ((Asset)debt).getAssetValue();
        }
        return _totalAsset;
      }
      
      public Double getTotalDebts()
      {
        Double _totalDebt = 0.00;
        
        for (Object debt : _debt)
        {
            _totalDebt += ((Debt)debt).getDebtAmount();
        }
        return _totalDebt;
      }
      
      public String getAssetSummary()
      {
        String _summary = "";
        for (Object asset : _asset)
        {
            _summary = _summary + asset.toString() + "\n";
        }
        for (Object debt : _debt)
        {
            _summary = _summary + debt.toString() + "\n";
        }
        return _summary;
      }
      
       @Override
    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#.00");
        return String.format("Total Net Worth: $%1s; Assets: $%2s; Debts: $%3s", 
                df.format(getNetWorth()), df.format(getTotalAssets()), df.format(getTotalDebts()));
    }
}
