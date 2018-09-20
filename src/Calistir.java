
import java.util.Scanner;

public class Calistir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("kilonuzu giriniz : ");
        int kilo = input.nextInt();
        System.out.println("boyunuzu giriniz : ");
        double boy = input.nextDouble();
        boy = boy / 100;

        double vke = (double) kilo / (boy * boy);
        System.out.println("vücut kitle endeksiniz : " + vke);

    }

}
