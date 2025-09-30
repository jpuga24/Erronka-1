import java.util.Scanner;

public class Erronka {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String larunbata = null;
        String igandea = null;

        System.out.println("Hasierako menua:");
        System.out.println("1- Aste Eguna aukeratu.");
        System.out.println("2- Pelikulen informazio orokorra.");
        System.out.println("3- Kokapena ikusi.");
        System.out.println("4- Irekiera ordutegia ikusi.");
        System.out.println("5- Irtetzeko aukera.");
        System.out.println(" ");
        System.out.println("Aukeratu bat:");
        int aukera=sc.nextInt();

        switch (aukera) {
            case 1:
                System.out.println("Aukeratu egun bat: larunbata edo igandea:");
                String eguna=sc.nextLine();
                if(eguna.equals(larunbata) || eguna.equals(igandea)){
                    //falta
                }
                break;

            case 2:
                System.out.println("Aukeratu opzio bat:");
                System.out.println("1- Pelikula kopurua eta hauen izenak.");
                System.out.println("2- Gela kopurua eta hauen izenak.");
                int opzioa=sc.nextInt();
                //falta
                break;

            case 3:
                
                break;

            case 4:
                System.out.println("Gure ordutegia:");
                System.out.println("Larunbata: 10:00 - 22:00");
                System.out.println("Igandea: 10:00 - 00:00");
                break;
        
            case 5:
                System.out.println("Irteera aukeratu duzu");
                break;
        }

        sc.close();
    }
}
