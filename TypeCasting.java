public class TypeCasting {
    public static void main(String[] args) {
        byte by = 45;
        int age = by; // implicit typecasting
        System.out.println(by);
        System.out.println(age);

        short st = (short) age; // explicit typecasting
        System.out.println(st);
    }
}

//implicit vs explicit typecasting

//Implicit                                                                      Explicit
/* 
 * No need to write the conversion logic separately                     Need to conversion logic separately
 * There will not be any data loss                                      There might be data loss
 * Variable Widening                                                    Variable Narrowing
*/
