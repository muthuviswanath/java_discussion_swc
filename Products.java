public class Products {
    int prodid;
    String prodname;
    double prodprice;
    int prodqty;

    Products(int prodid, String prodname, double prodprice, int prodqty){
        this.prodid = prodid;
        this.prodname = prodname;
        this.prodprice =prodprice;
        this.prodqty = prodqty;
    }
    public static void main(String[] args){
        Products p = new Products(123,"Mouse",345.50,5);
        System.out.println(p.prodid);
        System.out.println(p.prodname);
        System.out.println(p.prodprice);
        System.out.println(p.prodqty);
    }
}
