package SubSets_Recursion;

public class Remove_String {
    public static String Skipapple(String up){
       if (up.isEmpty()){
           return "";
       }
       if (up.startsWith("apple")){
           return Skipapple(up.substring(5));
       }
       else {
           return up.charAt(0)+Skipapple(up.substring(1));
       }




    }
    public static void main(String[] args) {
         String up="bdfgapple";
         Skipapple(up);
        System.out.println(Skipapple(up));
    }
}
