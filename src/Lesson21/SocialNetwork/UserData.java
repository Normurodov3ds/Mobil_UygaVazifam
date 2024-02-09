package Lesson21.SocialNetwork;

import java.util.ArrayList;
import java.util.List;

public class UserData {
    private String name;
    private String lastname;
    private int age;
    private int passWord;
    private String login;
    private List<VedioData> vedios = new ArrayList<>(0);

    public UserData(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public UserData(String name, String lastname, int age, int passWord, String login, List<VedioData> vedios) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.passWord = passWord;
        this.login = login;
        this.vedios = vedios;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public int getPassWord() {
        return passWord;
    }

    public String getLogin() {
        return login;
    }

    public List<VedioData> getVedios() {
        return vedios;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPassWord(int passWord) {
        this.passWord = passWord;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setVedios(List<VedioData> vedios) {
        for (VedioData vedio : vedios) {
            if (!this.vedios.contains(vedio)) {
                this.vedios.add(vedio);
                System.out.println("vedio qo'shildi");
            } else System.out.println("vedio qo;shilmadi");
        }
    }

    public void setVedios(VedioData vedio) {
        if (!this.vedios.contains(vedio)) {
            this.vedios.add(vedio);
            System.out.println("vedio qo'shildi");
        } else System.out.println("vedio qo;shilmadi");
    }


}
