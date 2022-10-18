import java.util.*;
public class Menu {
    public Scanner sc = new Scanner(System.in);
    public void menuDesign(){
        System.out.println("---Devam etmek icin Enter Bas---");
        sc.nextLine();
        System.out.println("--- --- --- --- --- ---");
        System.out.println("" +

                "     ---MENU---\n" +
                "1)Isim Listesini yazdir.\n" +
                "2)Isim Ekle\n" +
                "3)Isim Sil.\n" +
                "4)Isim Guncele\n" +
                "5)Cop kutusunu goster.\n" +
                "6)Cikis.\n" +
                "--- --- --- --- --- ---");
    }
    public void menuStart(){
        Data data = new Data();
        boolean control = true;
        int choose;
        int id;
        String name;
        while (control){
            menuDesign();
            System.out.print("Seciminiz:");
            choose = sc.nextInt();

            switch (choose){
                case 1:
                    data.idNameListPrint();
                    break;
                case 2:
                    System.out.print("ID giriniz:");
                    id = sc.nextInt();
                    System.out.println("---Devam etmek icin Enter Bas---");
                    sc.nextLine();
                    System.out.println("Isim giriniz:");
                    name = sc.nextLine();
                    data.idNameListAdd(id,name);
                    break;
                case 3:
                    System.out.println("---Devam etmek icin Enter Bas---");
                    sc.nextLine();
                    System.out.println("Isim giriniz:");
                    name = sc.nextLine();
                    data.deleteName(name);
                    break;
                case 4:
                    System.out.println("Id giriniz:");
                    id = sc.nextInt();
                    System.out.println("---Devam etmek icin Enter Bas---");
                    sc.nextLine();
                    System.out.println("Isim giriniz:");
                    name = sc.nextLine();
                    data.updateName(id,name);
                    break;
                case 5:
                    data.trashPrint();
                    break;
                case 6:
                    System.out.println("--- o7 GOOD BYE o7 ---");
                    control = false;
                    break;
                default:
                    System.out.println("Yanlis Secim");
                    break;
            }
        }
    }
}
