public class Pattern2 {
    public  static void Traingle2(int r,int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("* ");
            Traingle2(r,c+1);
        }
        else {
            System.out.println();
            Traingle2(r-1,0);
        }
    }
    public static void main(String[] args) {
        Traingle2(5,0);

    }
}
