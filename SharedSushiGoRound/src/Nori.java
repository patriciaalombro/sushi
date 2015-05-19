public class Nori implements Ingredients
{
    private int amount;
    
    public void increment()
    {
        amount += 10;
    }
    
    public void decrement()
    {
        amount--;
    }
    
    public int getAmount()
    {
        return amount;
    }
}