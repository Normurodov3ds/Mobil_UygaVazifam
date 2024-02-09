package Lesson21.SocialNetwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        SocialRepository repository = SocialRepository.getInstance(); // bu yerda bazada birdan
                                                                     // login: {komil} parol :{123} da 3 rtavedio bor

        boolean c = true;
        while (true) {
            if (c) {
                System.out.println("Welcome to Youtube");
                c = false;
            }
            System.out.println("1) Ro'yxatdan o'tish   2) Kirish   3) Vedio ko'rish");
            switch (in.nextInt()) {
                case 1 -> {
                    in.nextLine();
                    System.out.print("Ismizngiz :");
                    String name = in.nextLine();
                    System.out.print("Familyangiz :");
                    String lastname = in.nextLine();
                    System.out.print("Yoshingiz: ");
                    int age = in.nextInt();
                    repository.addUser(new UserData(name, lastname, age));
                }
                case 2 -> {
                    boolean f = true;
                    boolean g = true;
                    UserData user = null;
                    String login = "";
                    int parol = 0;
                    while (f) {
                        if (g) {
                            in.nextLine();
                            System.out.print("Login :");
                            login = in.nextLine();
                            System.out.print("Parol :");
                            parol = in.nextInt();
                            user = repository.userData(login, parol);
                            g = false;
                        }
                        if (user != null) {
                            System.out.println("1) vediolaringiz 2) vedio qo'shish 3) chiqish");
                            switch (in.nextInt()) {
                                case 1 -> {
                                    repository.getAllvedio(repository.userData(login, parol));
                                }
                                case 2 -> {
                                    System.out.print("Nechta qo'shasiz ? ");
                                    int a = in.nextInt();
                                    in.nextLine();
                                    List<VedioData> vedis = new ArrayList<>(a);
                                    for (int i = 0; i < a; i++) {
                                        System.out.print("vedio nomi: ");
                                        String name = in.nextLine();
                                        System.out.print("vedio haqida: ");
                                        String title = in.nextLine();
                                        vedis.add(new VedioData(name, title));
                                    }
                                    repository.addVideo(user, vedis);
                                }
                                case 3 -> {
                                    f = false;
                                }
                            }
                        } else {
                            System.out.println("bu foydalanuvchi topilmadi!");
                            g = true;
                        }
                    }
                }
                case 3 -> {
                    repository.getAllvedio();
                    System.out.println("Vediolarga Fikir berasizmi ?  1) Ha 2) Yo'q");
                    switch (in.nextInt()) {
                        case 1 -> {
                            if (!repository.getAllvedios().isEmpty()) {
                                System.out.println("Yuqoridan birini tanlang");
                                int a = in.nextInt();
                                System.out.println("1) Like 2) DisLike");
                                switch (in.nextInt()) {
                                    case 1 -> {
                                        repository.likeVedio(repository.getAllvedios().get(a - 1));
                                    }
                                    case 2 -> {
                                        repository.dislikeVedio(repository.getAllvedios().get(a - 1));
                                    }
                                }
                            } else System.out.println("vedio mavjud emas");

                        }
                        case 2 -> {
                            System.out.println("Orqaga");
                        }
                    }
                }
            }
        }
    }
}
