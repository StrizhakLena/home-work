/**
 * Created by Strizhak on 23.03.2016.
 */
public class Main {
    public static void main(String[] args) {


        Kingdom kingdom = new Kingdom ();

        kingdom.setNameofKingdom("Magical");
        kingdom.setNameOfKing("Rudolf");
        kingdom.setNameOfQueen("Sara");
        kingdom.setTheQuantityOfAdviser(10);
        kingdom.setTheQuantityOfMaid(20);
        kingdom.setAddress("England");


        System.out.println(kingdom.read());
    }
}
