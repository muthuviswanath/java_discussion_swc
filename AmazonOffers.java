/*
 * -Amazon decded to give offers such that if they are women of age 30 and above and if they are working
 * professionals, then they will be given 35% off and if they are not working professionals, 30% off
 * If they are below 30 only 15% off
 */
public class AmazonOffers {
    public static void main(String[] args){
        int age = 12;
        char gender = 'F';
        boolean isWorking = true;
    
        if(age >30){
            if(gender == 'F'){
                if (isWorking){
                    System.out.println("35% off");
                }
                else{
                    System.out.println("30% off");
                }
            }
            else{
                System.out.println("No Offer");
            }
        }
        if (age <30 && gender =='F'){
            System.out.println("15% off");
        }
        
    }
}
