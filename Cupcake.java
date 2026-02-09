public class Cupcake extends Bakery{
    private int piece;

    public Cupcake(int piece, String flavor, double uniPrice){
        super(flavor, uniPrice);
        this.piece = piece;

    }
    public boolean isPackingBox(){
        return this.piece >= 6;

    }
    public int getBoxNumber(){
        if (isPackingBox()) {
            return this.piece / 6;
        }
        return 0;
    }
    public int getBagNUmber(){
        return this.piece % 6;
    }
    @Override
    public int getPackingCost(){
        if(isPackingBox())
            return getBoxNumber() * super.getPackingCost();
        return 0;
    }
    @Override
    public double calculateTotalPrice(){
        return (getUnitPrice() * this.piece + getPackingCost() + (getBagNUmber() * 0.5));
    }

    public String toString(){
        return super.toString() + "\n" + "Cupcake (" + getFlavor() + ") with " + (isPackingBox() ? getBoxNumber() + " Box " : "") + getBagNUmber() +" Bag " +
                "\nTotal price of Cup Cake = " + getUnitPrice() * this.piece;
    }

}
