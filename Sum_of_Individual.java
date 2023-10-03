public class Sum_of_Individual {
    public  static  int individual(int n){
        if (n==0){
            return 0;
        }

//       int  temp=n%10;
//        n=n/10;
       return n%10+individual(n/10);



    }
    public static void main(String[] args) {
//        individual(1342);
        System.out.println( individual(1342));
    }
}
