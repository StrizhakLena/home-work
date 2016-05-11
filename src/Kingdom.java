/**
 * Created by Strizhak on 29.02.2016.
 */
public class Kingdom {
    protected String NameofKingdom;
    protected String NameOfKing;
    protected String NameOfQueen;
    protected int TheQuantityOfAdviser;
    protected int TheQuantityOfMaid;
    protected String Address;

    public void setNameofKingdom(String nameofkingdom) {
        this.NameofKingdom = nameofkingdom;
    }
    public String getNameofKingdom() {return NameofKingdom;}

    public void setNameOfKing(String nameofking) {
        this.NameOfKing = nameofking;
    }
    public String getNameofKing() {return NameOfKing;}

    public void setNameOfQueen(String nameofqueen) {
        this. NameOfQueen =nameofqueen;
    }
    public String getNameofQueen() {return NameOfQueen;}

    public void setTheQuantityOfAdviser(int thequantityofadviser) {
        this.TheQuantityOfAdviser = thequantityofadviser;
    }
    public int getTheQuantityOfAdviser() {return TheQuantityOfAdviser;}

    public void setTheQuantityOfMaid(int thequantityofmaid) {
        this.TheQuantityOfMaid = thequantityofmaid;
    }
    public int getTheQuantityOfMaid() {return TheQuantityOfMaid;}

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getAddress() {return Address;}
    public String read() {
        String result = "About kingdom \nNameofKingdom: " + this.NameofKingdom + "\nNameOfKing: " + this.NameOfKing + "\nNameOfQueen: " + this.NameOfQueen + "\nTheQuantityOfAdviser: " + this.TheQuantityOfAdviser + "\nTheQuantityOfMaid: " + this.TheQuantityOfMaid+ "\nAddress: " + this.Address;
        return result;
    }

}
