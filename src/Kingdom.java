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
        this.nameofkingdom = nameofkingdom;
    }
    public String getNameofKingdom() {return NameofKingdom;}
    
    public void setNameOfKing(String NameOfKing) {
        this.nameofking = nameofking;
    }
    public String getNameofKing() {return NameofKing;}

    public void setNameOfQueen(String NameOfQueen) {
        this.nameofqueen =nameofqueen;
    }
    public String getNameofQueen() {return NameofQueen;}
 
    public void setTheQuantityOfAdviser(int TheQuantityOfAdviser) {
        this.thequantityofadviser = thequantityofadviser;
    }
    public String getTheQuantityOfAdviser() {return TheQuantityOfAdviser;}
    
    public void setTheQuantityOfMaid(int TheQuantityOfMaid) {
        this.thequantityofmaid = thequantityofmaid;
    }
    public String getTheQuantityOfMaid() {return TheTheQuantityOfMaid;}
    
    public void setAddress(String Address) {
        this.address = Address;
    }

    public String getAddress() {return Address;}
    public String read() {
        String result = "About kingdom \nName: " + this.Name + "\nNameOfKing: " + this.NameOfKing + "\nNameOfQueen: " + this.NameOfQueen + "\nTheQuantityOfAdviser: " + this.TheQuantityOfAdviser + "\nTheQuantityOfMaid: " + this.TheQuantityOfMaid+ "\nAddress: " + this.Address;
        return result;
    }

}
