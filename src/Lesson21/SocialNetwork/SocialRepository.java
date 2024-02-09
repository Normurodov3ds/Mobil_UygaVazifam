package Lesson21.SocialNetwork;

import Hamburger.Indregents.ProductDB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocialRepository {
    public static SocialRepository dataBase = null;
    private List<UserData> userData = new ArrayList<>();


    private SocialRepository() {
        VedioData vedioData = new VedioData("itlar haqida", "itlarninh vaxshiy xayoti");
        VedioData vedioData1 = new VedioData("maymun xo'r odamlar", "makamalar mazzalimi?");
        VedioData vedioData2 = new VedioData("dasturchi bo'lish osonmas", "dasturlash haqida gaplashamiz");

        List<VedioData> list = new ArrayList<>();
        list.add(vedioData);
        list.add(vedioData1);
        list.add(vedioData2);

        UserData userData1 = new UserData("komil","normurodov",23,123,"komil",list);
        userData.add(userData1);
    }

    public static SocialRepository getInstance() {
        if (dataBase == null) {
            dataBase = new SocialRepository();
        }
        return dataBase;
    }

    public void addUser(UserData userData) {
        boolean b = true;
        for (UserData userDatum : this.userData) {
            if (userDatum.getName().equals(userData.getName()) && userDatum.getLastname().equals(userData.getLastname())) {
                b = false;
            }
        }
        if (b) {
            Scanner in = new Scanner(System.in);
            System.out.println("Foydalanuvchi qo'shildi.!\nLogin va parol tanlang...");
            System.out.print("Login: ");
            String s = in.nextLine();
            System.out.print("Parol: ");
            int s1 = in.nextInt();
            userData.setLogin(s);
            userData.setPassWord(s1);
            this.userData.add(userData);
            System.out.println("Muofaqiyatli qo'shildingiz");
        } else System.out.println("Siz oldin ro'yhatdan no'tgansiz.!");
    }

    public void addVideo(UserData userData, VedioData vedioData) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        for (UserData userDatum : this.userData) {
            if (userDatum.getName().equals(userData.getName()) && userDatum.getLastname().equals(userData.getLastname())) {
                int count = 0;
                while (count < 3) {
                    if (count == 0) System.out.println("Login va parolingiz?");
                    else System.out.println("Qaytadan kriting.!");
                    System.out.print("Login: ");
                    String s = in.nextLine();
                    System.out.print("Parol: ");
                    int s1 = in.nextInt();
                    if (s.equals(userDatum.getLogin()) && userDatum.getPassWord() == s1) {
                        userDatum.getVedios().add(vedioData);
                        b = false;
                        System.out.println("Success");
                        break;
                    } else {
                        System.out.println("login yoki parol hato kritildi");
                    }
                    count++;
                }
            }
        }
        if (b) System.out.println("Foydalanuvchi ro'yhatdan o'tmagan!");
    }

    public void addVideo(UserData userData, List<VedioData> vedioData) {
        Scanner in = new Scanner(System.in);
        boolean b = true;
        for (UserData userDatum : this.userData) {
            if (userDatum.getName().equals(userData.getName()) && userDatum.getLastname().equals(userData.getLastname())) {
                int count = 0;
                while (count < 3) {
                    if (count == 0) System.out.println("Login va parolingiz?");
                    else System.out.println("Qaytadan kriting.!");
                    System.out.print("Login: ");
                    String s = in.next();
                    System.out.print("Parol: ");
                    int s1 = in.nextInt();
                    if (s.equals(userDatum.getLogin()) && userDatum.getPassWord() == s1) {
                        userDatum.getVedios().addAll(vedioData);
                        b = false;
                        System.out.println("Success");
                        break;
                    } else {
                        System.out.println("login yoki parol hato kritildi");
                    }
                    count++;
                }
                if (!b) break;
            }
        }
        if (b) System.out.println("Foydalanuvchi ro'yhatdan o'tmagan!");
    }

    public void removeVideo(UserData userData, VedioData vedioData) {
        Scanner in = new Scanner(System.in);
        boolean b = false;
        for (UserData userDatum : this.userData) {
            if (userDatum.getVedios().contains(vedioData)&&userDatum.getLogin().equals(userData.getLogin())) {
                int count = 0;
                while (count < 3) {
                    if (count==0) System.out.println("Vedoini o'chirish uchun\nLogin va parolni kriting.!");
                    else System.out.println("Qaytadan kriting.!");
                    System.out.print("Login: ");
                    String s = in.nextLine();
                    System.out.print("Parol: ");
                    int a = in.nextInt();
                    if (s.equals(userDatum.getLogin()) && a == userDatum.getPassWord()) {
                        userDatum.getVedios().remove(vedioData);
                        System.out.println("Vedio o'chirildi.!");
                        b = true;
                        break;
                    } else System.out.println("login yoki parol hato.!");
                    count++;
                }
            }
        }
        if (!b) System.out.println("Vedio o'chirilmadi!");
    }
    public void likeVedio(VedioData vedioData){
        boolean b = true;
        for (UserData userDatum : this.userData) {
            if (userDatum.getVedios().contains(vedioData)){
                userDatum.getVedios().get(userDatum.getVedios().indexOf(vedioData)).setLikeCount(1);
                b = false;
            }
        }
        if (b) System.out.println("vedio topilmadi.!");
    }
    public void dislikeVedio(VedioData vedioData){
        boolean b = true;
        for (UserData userDatum : this.userData) {
            if (userDatum.getVedios().contains(vedioData)){
                userDatum.getVedios().get(userDatum.getVedios().indexOf(vedioData)).setDislikeCount(1);
                b = false;
            }
        }
        if (b) System.out.println("vedio topilmadi.!");
    }

    public UserData userData(String s,int password){
        for (UserData userDatum : this.userData) {
            if (userDatum.getLogin().equals(s)&&userDatum.getPassWord()==password){
                return userDatum;
            }
        }
        return null;
    }


    public void getAllvedio(){
        for (UserData userDatum : this.userData) {
            System.out.println(userDatum.getLogin()+" - foydalanuvchi vediolari.");
            int i = 1;
            for (VedioData vedio : userDatum.getVedios()) {
                System.out.println(i+"-vedio = " + "Like {"+ vedio.getLikeCount()+"}, DisLike {"+vedio.getDislikeCount()+"} "+ "nomi= {"+vedio.getTitle()+"}");
                i++;
            }
        }
    }

    public List<VedioData> getAllvedios(){
        List<VedioData>list = new ArrayList<>();
        for (UserData userDatum : this.userData) {
            int i = 1;
            for (VedioData vedio : userDatum.getVedios()) {
                System.out.println(i+"-vedio = " + "Like {"+ vedio.getLikeCount()+"}, DisLike {"+vedio.getDislikeCount()+"} "+ "nomi= {"+vedio.getTitle()+"}");
                list.add(vedio);
                i++;
            }
        }
        return list;
    }
    public void getAllvedio(UserData userData){
        int i = 1;
        for (VedioData vedio : userData.getVedios()) {
            System.out.println(i+"-vedio = " + "Like {"+ vedio.getLikeCount()+"}, DisLike {"+vedio.getDislikeCount()+"} "+ "nomi= {"+vedio.getTitle()+"}");
        }
        if (userData.getVedios().size()==0){
            System.out.println("vedio mavjud emas.");
        }
    }

}
