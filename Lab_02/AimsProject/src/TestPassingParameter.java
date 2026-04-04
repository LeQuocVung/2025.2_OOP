public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungLeDVD = new DigitalVideoDisc("JungLe");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungLeDVD,cinderellaDVD);
        
    }
    public static void swap(Object a1, Object a2){
        Object tmp = a1;
        a1 = a2;
        a2 = tmp;
    }
}
