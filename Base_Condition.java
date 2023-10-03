public class Base_Condition {
    static  void  prints(int n){
        if (n>5){
            return;
        }
        System.out.println(n);
        prints(n+1);
    }
    public static void main(String[] args) {
        prints(1);
    }
}
