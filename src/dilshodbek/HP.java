package dilshodbek;

public class HP extends Computer{
    String processesModel = "Acer";
    double diskSize = 256.0;
    @Override
    void showInfo() {
        System.out.println("proccess model: " + processesModel + "\n" + "disk Size: " + diskSize);
    }
}
