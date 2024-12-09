package TestExams_6_7_April2019;

import java.util.Scanner;

public class P04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherAmount = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int ticketCount = 0;
        int purchasesCount = 0;

        while (!"End".equals(command)){
            String liyubosChoice = command;

            int length = liyubosChoice.length();
            if (length > 8){
                voucherAmount = voucherAmount - (liyubosChoice.charAt(0)) - (liyubosChoice.charAt(1));
                if (voucherAmount <= 0){
                    break;
                }
                ticketCount++;
            }else {
                voucherAmount = voucherAmount - liyubosChoice.charAt(0);
                if (0 >= voucherAmount){
                    break;
                }
                purchasesCount++;
            }

            command = scanner.nextLine();
        }

        System.out.printf("%d%n%d",ticketCount,purchasesCount);


    }
}
