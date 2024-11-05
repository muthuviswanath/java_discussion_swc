public class MyProducts {
    
    int prodid;
    String prodname;
    String desc;
    int price;
    public MyProducts(int prodid, String prodname, String desc,int price){
        this.prodid = prodid;
        this.prodname = prodname;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString() {
        return prodid + " | [" + prodname +", "+ desc +", "+ price + "]";
    }

    public static void main(String[] args) {
        MyProducts mp = new MyProducts(10, "Mouse", "Wireless", 675);
        System.out.println(mp);
        // 10 | [Mouse, Wireless, 675]
        String s = new String("Welcome");
        System.out.println(s);
    }
}
// The purpose of overriding the toString method is to display the content of the object
// rather than the hexadecimal representation of hashcode