//cab fare system
import java.util.Scanner;
class Cab{
    int fare;
    void showFare()
    {
        System.out.print("Fare amount: "+fare);
    }
}
public class RideCab{
    public static void main(String args[])
    {
        Cab id=new Cab();//whenever you book a ride new id is created
        Scanner sc=new Scanner(System.in);
        int d;
        System.out.print("enter the travel distance(in km): ");
        d=sc.nextInt();
        id.fare=12*d;//for each km fare is rs 12
        id.showFare();
    }
}