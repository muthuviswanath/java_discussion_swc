public class ImplementationClass {
    public static void main(String[] args) {
        Container c = new Container();
        Water w = new Water();
        Petrol p = new Petrol();
        Sand s = new Sand();

        c.storeData(w);
        c.storeData(s);
        c.storeData(p);
    }
}
