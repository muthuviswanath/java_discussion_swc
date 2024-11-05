/*
 * Create the photoshop application that opens different types of files nad each file
 * exhibits it own behaviourwhen opened in photoshop
 */
public class Photoshop {
    
    void openFile(SystemFile fileptr){
        if (fileptr instanceof JpegFile){
            JpegFile jp = (JpegFile) fileptr;
            System.out.println(fileptr.name);
            System.out.println(fileptr.extension);
            System.out.println(fileptr.filesize);
            fileptr.behave();
            jp.show();
            jp.display();
        }
        else if(fileptr instanceof PngFile){
            PngFile pn = (PngFile) fileptr;
            System.out.println(fileptr.name);
            System.out.println(fileptr.extension);
            System.out.println(fileptr.filesize);
            fileptr.behave();
            pn.show();
          }
        else if(fileptr instanceof PsdFile){
            PsdFile psd = (PsdFile) fileptr;
            System.out.println(fileptr.name);
            System.out.println(fileptr.extension);
            System.out.println(fileptr.filesize);
            fileptr.behave();
            psd.show();
          }
          else{
            System.out.println("New Wile format and hence cannot display");
          }
        
    }


    public static void main(String[] args) {
        JpegFile j = new JpegFile("My Pic", ".jpg", "250 Kb");
        PngFile png = new PngFile("ProfilePic", ".png", "50 Kb");
        Photoshop p = new Photoshop();
        p.openFile(j);
        p.openFile(png);        
    }
}



