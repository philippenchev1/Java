import java.util.Scanner;

public class PP01PoolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double water = p1*hours + p2*hours;

        if (water<=v){
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
                    (water/v*100),
                    (p1*hours/water*100),
                    (p2*hours/water*100));
        }else{
            System.out.printf("For %f hours the pool overflows with %f liters.", hours, water - v);
        }
    }
}
