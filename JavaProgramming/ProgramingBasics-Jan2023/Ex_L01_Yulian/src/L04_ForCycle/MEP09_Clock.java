package L04_ForCycle;

public class MEP09_Clock {
    public static void main(String[] args) {
        for (int hours = 0; hours < 24; hours++){
            for (int minutes = 0; minutes < 60; minutes++){
                System.out.println(hours + " : " + minutes );
            }
        }
    }
}
