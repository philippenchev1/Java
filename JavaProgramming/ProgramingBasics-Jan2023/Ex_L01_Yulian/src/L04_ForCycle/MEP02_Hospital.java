package L04_ForCycle;

import java.util.Scanner;

public class MEP02_Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctors = 7;

        for(int i = 1; i <= period;i++){
            int patients = Integer.parseInt(scanner.nextLine());

            if(i % 3 == 0 && untreatedPatients > treatedPatients){
                doctors++;
            }
            if(patients > doctors){
                untreatedPatients += patients - doctors;
                treatedPatients += doctors;
            }else {
                treatedPatients += patients;
            }

        }
        System.out.println("Treated patients: " + treatedPatients + ".");
        System.out.println("Untreated patients: "+untreatedPatients + ".");
    }
}

