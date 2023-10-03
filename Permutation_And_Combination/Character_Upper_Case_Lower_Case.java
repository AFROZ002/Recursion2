package Permutation_And_Combination;

public class Character_Upper_Case_Lower_Case {
    public  static  void  Rix(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }



       Rix(p+up.substring(0,1),up.substring(1));
//
       Rix(p+up.substring(0,1).toUpperCase(),up.substring(1));

    }
    public static void main(String[] args) {
        String up="ab";
        Rix( "",up);
    }
}
