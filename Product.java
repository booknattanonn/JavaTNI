public class Product {
    public String name ;
    public double price = 0;
    public int quantity = 0;

    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " items yo stock ");
        }
    }

    public void changePrice(double newPrice){
        if (newPrice > 0) {
            price = newPrice;
            System.out.println("Change price to " + newPrice + "baht" );
        }
    }

    public double stockValue() {
        return price * quantity;
    }
    public void showInfo() {
        System.out.println("Name : " + name);
        System.out.println("Price : " + price + "Bath/Item");
        System.out.println("Stock : " + quantity + "Items");
        System.out.println("Stock Value: " + stockValue()+ "Bath");
    }
    void sell(int amount){
        quantity -= amount;
        if (amount <= 0 ) ;
    }
    public void showProduct(){

    }
}
