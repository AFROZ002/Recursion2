package SubSets_Recursion;

public class Sub_Sequence_Print {
    public  static void  Subsequence(String p, String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        Subsequence(p+ch,up.substring(1));
        Subsequence(p,up.substring(1));


    }
    public static void main(String[] args) {
        String up="abc";
        Subsequence("",up);
//        System.out.println(Subsequence("",up));


    }
}
