package Permutation_And_Combination;

public class Letter_Case_Permutation {

    public  static  void  Rix(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

char ch=up.charAt(0);
 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
     Rix(p + up.substring(0, 1).toLowerCase(), up.substring(1));

     Rix(p + up.substring(0, 1).toUpperCase(), up.substring(1));
 }
 else if (ch >= '0' && ch <= '9') {
     // If it's a digit, directly add it to the current permutation
     Rix(p + ch, up.substring(1));
 }

    }



    public static void main(String[] args) {

        String up="a1B2";
        Rix( "",up);
    }
}
