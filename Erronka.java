import java.util.Scanner;
import java.util.ArrayList;

public class Erronka {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> pelikulak = new ArrayList<String>();
        String[] pelikula={"Lilo y Stitch","Una película de Minecraft","Mufasa: El rey león",
                            "Cómo entrenar a tu dragón","Capitán América: Brave New World",
                            "Conclave","Sonic 3: La película","Misión: Imposible. Sentencia Final",
                            "Blancanieves","Thunderbolt","Padre no hay más que uno 5",
                            "Wolfgang (Extraordinario)","El casoplón","Un funeral de locos","Sirāt"};

        ArrayList<String> gelak = new ArrayList<String>();
        String[] gela ={"Umeen gela","Superheroien gela","Thriller gela","Zientzia fikzioko gela","Zientzia fikzioko gela"};
        
        String larunbata = null;
        String igandea = null;
        String segui=null;
        String atera=null;

        boolean continuar=true;

        while(continuar){

            System.out.println("Hasierako menua:");
            System.out.println("1- Aste Eguna aukeratu.");
            System.out.println("2- Pelikulen informazio orokorra.");
            System.out.println("3- Kokapena ikusi.");
            System.out.println("4- Irekiera ordutegia ikusi.");
            System.out.println("5- Irtetzeko aukera.");
            System.out.println(" ");
            System.out.println("Aukeratu bat:");
            int aukera=sc.nextInt();
            sc.nextLine();

            switch (aukera) {
            case 1:
                System.out.println("Aukeratu egun bat larunbata edo igandea:");
                String eguna = sc.nextLine();
                
                if(eguna.equalsIgnoreCase("larunbata")){
                    System.out.println();
                }else if(eguna.equalsIgnoreCase("igandea")){

                }else{
                    System.out.println("Errorea. Bakarrik larunbata edo igandea idatzi behar duzu.");
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
                System.out.println("Gure kokapena hau da");
                System.out.println("Bo. Txiki-Erdi, 7, 20170 Usurbil, Gipuzkoa");
                System.out.println("");
                System.out.println("Zer egin nahi duzu? Atera edo beste aukera bat aukeratu? (atera/segui):");
                String selekzioa=sc.nextLine();
                if(selekzioa.equalsIgnoreCase(atera)){
                    break;
                }if(selekzioa.equalsIgnoreCase(segui)){
                    break;
                }

            case 4:
                System.out.println("Gure ordutegia:");
                System.out.println("Larunbata: 10:00 - 22:00");
                System.out.println("Igandea: 10:00 - 00:00");
                break;
        
            case 5:
                System.out.println("Irteera aukeratu duzu");
                break;

            default:
                System.out.println("Elige una opción correcta");
                break;
        }
        }
        
    }
}
