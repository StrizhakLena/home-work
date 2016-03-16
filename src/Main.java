/**
 * Created by Strizhak on 29.02.2016.
 */
public class Kingdom {
   protected String name;
    protected String king ;
    protected String queen;
    protected int adviser;
    protected int maid;

    public void setName(String name) {
        this.name = name;
    }

    public void setking(String king) {
        this.king = king;
    }

    public void setqueen(String queen) {
        this.queen =queen;
    }

    public void setadviser(int adviser) {
        this.adviser = adviser;
    }

    public void setmaid(int maid) {
        this.maid = maid;
    }
    public String read() {
        String result = "About kingdom \nName: " + this.name + "\nking: " + this.king + "\nqueen: " + this.queen + "\nadviser: " + this.adviser + "\nmaid: " + this.maid;
        return result;
    }

}
