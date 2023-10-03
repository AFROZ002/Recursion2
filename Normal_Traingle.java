public class Normal_Traingle {
    public  static void Traingle(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            Traingle(r,c+1);
            System.out.print("* ");

        }
        else {
            Traingle(r-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Traingle(4,0);
    }
}
