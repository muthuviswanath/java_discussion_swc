public class LabeledForLoop {
    public static void main(String[] args) {
        Laptop:
        for(int i=1;i<=3; i++){
            for(int j=1; j<=3; j++){
                if(i == 2)
                    break Laptop;
                System.out.println(i+" "+j);
            }
        }
    }
}

// 1 1 
// 1 2
// 1 3
// Whenever the outer loop has to be controlled by inner loop(break and continue)