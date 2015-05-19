public class FishEgg implements Ingredients
{
    private int amount;
    
    public void increment()
    {
        amount += 5;
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