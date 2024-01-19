package Lesson18.Collecton;

import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        SportMan sport0 = new SportMan("Anvar","Qo'qonov",21);
        SportMan sport1 = new SportMan("Jasur","Ahmedov",20);
        SportMan sport2 = new SportMan("Dilshot","Bahrommov",22);
        SportMan sport3 = new SportMan("Firdavs","Nomozov",23);
        SportMan sport4 = new SportMan("Javlon","To'raboyev",24);
        SportMan sport5 = new SportMan("Malik","Xasanov",29);
        SportMan sport6 = new SportMan("Jamol","Nasasov",22);
        SportMan sport7 = new SportMan("Abdulla","Boqeyev",20);
        SportMan sport8 = new SportMan("Zafar","Aliyev",22);
        SportMan sport9 = new SportMan("Akmal","Jamolov",25);


        ArrayList<Fudbool> fudbools = new ArrayList<>();
        fudbools.add(new Fudbool(sport0));
        fudbools.add(new Fudbool(sport1));
        fudbools.add(new Fudbool(sport7));
        fudbools.add(new Fudbool(sport2));
        fudbools.add(new Fudbool(sport3));
        fudbools.add(new Fudbool(sport4));

        ArrayList<Tenes> tenes = new ArrayList<>();
        tenes.add(new Tenes(sport5));
        tenes.add(new Tenes(sport6));
        tenes.add(new Tenes(sport2));
        tenes.add(new Tenes(sport1));
        tenes.add(new Tenes(sport7));
        tenes.add(new Tenes(sport8));
        tenes.add(new Tenes(sport9));

        ArrayList<SportMan> sportMEN = new ArrayList<>();
        for (Fudbool fudbool : fudbools) sportMEN.add(fudbool.getSportMan());
        for (Tenes tene : tenes)
            if (!sportMEN.contains(tene.getSportMan())) {
                sportMEN.add(tene.getSportMan());
            }
        for (SportMan sportMAN : sportMEN) {
            System.out.println(sportMAN);
        }

        System.out.println(sportMEN.size());

        for (Tenes tene : tenes) {
            boolean b = false;
            Fudbool fudbool1 =null;
            for (Fudbool fudbool : fudbools) {
                if (tene.getSportMan().equals(fudbool.getSportMan())){
                    b = true;
                   fudbool1 = fudbool;
                    break;
                }
            }
            if (b) {
                fudbools.remove(fudbool1);
            }
        }

        for (Fudbool fudbool : fudbools) {
            System.out.println(fudbool.getSportMan());
        }








    }
}
