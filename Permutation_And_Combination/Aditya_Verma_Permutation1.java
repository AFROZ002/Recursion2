package Permutation_And_Combination;

public class Aditya_Verma_Permutation1 {
    public static void Recur(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        char ch = up.charAt(0);
        String ws = up.substring(1);
        Recur(p + ch, ws);
        Recur(p, ws);

    }

    public static void main(String[] args) {
        String up="abc";
        Recur("_",up);


    }
}
