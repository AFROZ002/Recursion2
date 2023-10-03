public class Sum_of_N {
    public  static  int sums(int n){
        if (n==1){
            return 1;
        }
        return n=n+sums(n-1);
    }
    public static void main(String[] args) {
//        int sum=0;

        System.out.println( sums(10));

    }
}
