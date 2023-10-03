public class Pattern_Recursion {
    public  static  void PR(int i,int j){
        if (i<1){
            return;
        }
        if (j<i){
            System.out.print("*");
            PR(i,j+1);

        }
        else {
            System.out.println();
            PR(i-1,0);
        }

    }
    public static void main(String[] args) {
         int i=5;
         int j=0;
        PR(i,j);

        }
    }

