package csm10jhw02;
//import InheritanceDesign.*;
import InterfaceDesign.*;
/**
 *
 * @author Michelle
 */
public class Program 
{

    public static void main(String[] args) 
    {
        Wealth _wealth = new Wealth();
        Stock _stock = new Stock("Michelle Stock ", 10, 10.00);
        _wealth.addAsset(_stock);
        
        Bond _bond = new Bond("Bond Name", 10.00, 10);
        _wealth.addAsset(_bond);
        
        BankAccount _bankaccount = new BankAccount("Account: 83748934928347", 100.00);
        _wealth.addAsset(_bankaccount);
        
        House _house = new House("100 Program Lane, Codenia 10101 CA ", 100.00, 10.00);
        _wealth.addAsset(_house);
        
        Car _car = new Car("Ford Escort ", 100.00, 10.00);
        _wealth.addAsset(_car);
        
        System.out.println(_wealth);
        System.out.println(_wealth.getAssetSummary());
        System.out.println(_bankaccount);
        System.out.println(_stock);
        System.out.println(_bond);
        System.out.println(_house);
        System.out.println(_car);
    }
    
}
