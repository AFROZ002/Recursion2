package Permutation_And_Combination;

public class Permutation_With_Space {
    public  static  void pws(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        pws(p+"_"+ch,up.substring(1));
        pws(p+ch,up.substring(1));


    }
    public static void main(String[] args) {

        String up="ABC";
        pws(up.substring(0,1),up.substring(1));


    }
}
