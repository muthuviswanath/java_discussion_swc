public class SystemFile {
    String name;
    String extension;
    String filesize;

    SystemFile(String name, String extension, String filesize) {
        this.name = name;
        this.extension = extension;
        this.filesize = filesize;
    }

    void behave(){
        System.out.println("Every file behaves differently");
    }
}

class JpegFile extends SystemFile {
    JpegFile(String name, String extension, String filesize) {
        super(name,extension,filesize);
    }

    void show(){
        System.out.println("Displayed in RGB Color");
    }

    void display(){
        System.out.println("Used as background");
    }

}

class PngFile extends SystemFile {
    PngFile(String name, String extension, String filesize) {
        super(name,extension,filesize);
    }

    @Override
    void behave(){
        System.out.println("Png files are open as layers withtransparent background.");
    }

    void show(){
        System.out.println("Displayed in CMYK Color");
    }
}

class PsdFile extends SystemFile {
    PsdFile(String name, String extension, String filesize) {
        super(name,extension,filesize);
    }

    @Override
    void behave(){
        System.out.println("Psd files are open as combination of various layers in the form of Photoshop project.");
    }

    void show(){
        System.out.println("Displayed in Grayscale Color");
    }
}

