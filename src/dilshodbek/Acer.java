package dilshodbek;

public class Acer extends Computer{
    String processesModel = "Acer";
    double diskSize = 256.0;
    @Override
    void showInfo() {
        System.out.println("proccess model: " + processesModel + "\n" + "disk Size: " + diskSize);
    }
}
