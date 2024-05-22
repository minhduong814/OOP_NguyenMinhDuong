package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Sinh vien");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Dai hoc Bach khoa Ha Noi");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("????");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.removeMedia(dvd2);

    }

}