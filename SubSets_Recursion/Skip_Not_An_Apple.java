package SubSets_Recursion;

public class Skip_Not_An_Apple {
    public  static  String SkipAppNotapple(String up){
        if (up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& !up.startsWith("apple")){
          return SkipAppNotapple(up.substring(3));

        }
        else {
            return up.charAt(0)+SkipAppNotapple(up.substring(1));
        }
    }
    public static void main(String[] args) {

        String up="bdfgappledgf";

        SkipAppNotapple(up);
        System.out.println(SkipAppNotapple(up));

    }
}
