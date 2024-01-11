package Bilet_12;

public class PhoneStorage {
    int storage;
    int busyPart;

    public PhoneStorage(int storage, int busyPart) {
        this.storage = storage;
        this.busyPart = busyPart;
    }
    int getEmptyStorage(){
        return storage-busyPart;
    }
    void addMusic(int musicSize){
        if(musicSize<=(storage-busyPart)){
            System.out.println("Qo'shildi");
        }else System.out.println("Xotirada joy kam");
    }
    boolean addMusics(int musicSize, int count){
        return storage>=musicSize*count;
    }
}
