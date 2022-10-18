import java.util.*;
public class Data {
    private ArrayList<Integer> idList = new ArrayList<>();
    private ArrayList<String> namesList = new ArrayList<>();
    private ArrayList<String> trash = new ArrayList<>();

    public Scanner sc = new Scanner(System.in);

    public Data(){  //Hazir veri olsun diye yaptim.
        idList.add(50);     namesList.add("Cesur");
        idList.add(51);     namesList.add("Kerem");
        idList.add(52);     namesList.add("Enes");
        idList.add(53);     namesList.add("Arda");
        idList.add(54);     namesList.add("Utku");
        idList.add(55);     namesList.add("Berkem");
        idList.add(56);     namesList.add("Hasan Emre");
    }
    public void idNameListAdd(int id,String name){    //ArrayListe Veri Ekler.
        if(idList.contains(id)){
            System.out.println("---ID Yanlis---");
        }
        else{
            idList.add(id);     namesList.add(name);
            System.out.println("---Ekleme islemi basarili.---");
        }
    }
    public void updateName(int id,String name){     //Arrayliste Id kulanarak isim gunceller.
        int index = idList.indexOf(id);
        namesList.set(index,name);
        System.out.println("---Islem Basarili---");
    }
    public void deleteName(String name){           //Arrayliste isim kulanarak isim ve id siler daha sonra silinen isimi baska Arrayliste ekler.
        int index = namesList.indexOf(name);
        if(namesList.contains(name)){
            while (namesList.contains(name)){
                trash.add(namesList.get(index));
                idList.remove(index);
                namesList.remove(index);
            }
            System.out.println("---Silme Isleme Basarili---");
        }

        else
            System.out.println("---Isim Bulanamadi---");
    }
    public void idNameListPrint(){      //Arraylisti Ekrana Yazdirir.
        System.out.println("\n");
        System.out.println("--- --- --- --- --- --- --- ---");
        for (int i = 0; i <namesList.size(); i++) {
            System.out.println("ID= " + idList.get(i) + "       " + "Name: " + namesList.get(i));
        }
        System.out.println("--- --- --- --- --- --- --- ---\n");
    }
    public void trashPrint(){          //Silnenler Arraylistesini Ekrana yazdirir
        System.out.println("--- --- --- --- --- --- --- ---");
        System.out.println("        ---COP KUTUSU---");
        for (int i = 0; i < trash.size(); i++) {
            System.out.println((i+1) + "." +trash.get(i));
        }
        System.out.println("--- --- --- --- --- --- --- ---\n");
    }
}
