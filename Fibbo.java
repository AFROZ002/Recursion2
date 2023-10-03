public class Fibbo {
     static int  fibbo(int n){
        if (n<2){
            return n;
        }
        return fibbo(n-1)+fibbo(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fibbo(4
        ));

    }
}
