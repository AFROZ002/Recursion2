package Permutation_And_Combination;

public class permutation1 {
    public  static  void  Permutation(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
//        char ch=up.charAt(0);
        for (int i=0;i<=p.length();++i) {
            char ch=up.charAt(0);
            String f = p.substring(0, i);
            String s=p.substring(i,p.length());
            Permutation(f+ch+s,up.substring(1));
        }
    }

    public static void main(String[] args) {
     String up="abc";
     Permutation("",up);





    }
}
