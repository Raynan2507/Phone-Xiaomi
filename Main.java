
package xiaomi_;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Phone redmiNote10 = new xiaomi_();
        
        PhoneUser Raynan = new PhoneUser(redmiNote10);
        
         Raynan.turnOnThePhone();
         
         Scanner input = new Scanner(System.in);
         String aksi;
         
          while (true) {
            System.out.println("=== APLIKASI INTERFACE ===");
            System.out.println("{1} Menyalakan HP");
            System.out.println("{2} Mematikan HP");
            System.out.println("{3} Perbesar Volume");
            System.out.println("{4} Kecilkan Volume");
            System.out.println("[0] Keluar");
            System.out.println("--------------------------");
            System.out.print("Pilih aksi> ");
            aksi = input.nextLine();
    }
           if(aksi.equalsIgnoreCase("1")){
                Raynan.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                Raynan.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                Raynan.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                Raynan.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                System.exit(0);
            } else {
                System.out.println("Kamu memilih aksi yang salah!");
            }
        }

    private static class Phone {

        public Phone() {
        }
    }

    }



