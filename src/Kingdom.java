/**
 * Created by Strizhak on 29.02.2016.
 */
    public class Kingdom {
    protected String Name;
    protected String King ;
    protected String Queen;
    protected int Quantity_adviser;
    protected int Quantity_maid;

    public void setName(String Name) {
        this.name = name;
    }

    public void setKing(String King) {
        this.king = king;
    }

    public void setQueen(String Queen) {
        this.queen =queen;
    }

    public void setQuantity_adviser(int Quantity_adviser) {
        this.Quantity_adviser = Quantity_adviser;
    }

    public void setQuantity_maid(int Quantity_maid) {
        this.Quantity_maid = Quantity_maid;
    }
    public String read() {
        String result = "About kingdom \nName: " + this.Name + "\nKing: " + this.King + "\nQueen: " + this.Queen + "\nQuantity_adviser: " + this.Quantity_adviser + "\nQuantity_maid: " + this.Quantity_maid;
        return result;
    }

}
