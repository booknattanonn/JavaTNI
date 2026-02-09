public class Cheesepie extends Bakery {
    private int piece;
    private int addtofree;
    public Cheesepie(int piece, String flavor, double uniPrice){
        super(flavor, uniPrice);
        this.piece = piece;
    }
    public boolean isPackingBox() {
        return this.piece >= 6;
    }
    public int getBoxNumber() {
        if (isPackingBox()) {
            return this.piece / 6;
        }
        return 0;
    }
    public int getAddtofree(){
        if(this.piece >= 6)
            return (this.piece/6);
        return 0;
    }

    @Override
    public int getPackingCost(){
        if (isPackingBox())
            return 3;
        return super.getPackingCost();
    }
    public double calculatePrice(){
        if (isPackingBox())
            return (getUnitPrice()*this.piece) + getPackingCost();
        return  0;
    }
    public String toString() {
        return super.toString() + "\n" + "Cheesepie (" + getFlavor() + ") with " + (isPackingBox() ? getBoxNumber() + " Box " : "") +
                "\nTotal price of Cheessepie = " + getUnitPrice() * this.piece;
    }
}
