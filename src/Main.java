import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Soz daxil edin");
        Scanner scanner = new Scanner(System.in);
        String soz  = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = soz.length()-1;i>=0;i--){
            stringBuilder.append(soz.charAt(i));

        }
        System.out.println(stringBuilder);


    }
}
