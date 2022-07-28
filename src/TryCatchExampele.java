import java.util.Scanner;

public class TryCatchExampele {
    ///


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        try {
            System.out.println(number/(number-10));

        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("На ноль делить нельзя");
        }
        finally {
            System.out.println(number+1);
        }


    }
}
