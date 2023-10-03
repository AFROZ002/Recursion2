package SubSets_Recursion;

import java.util.ArrayList;

public class ASCII_ArrayList {
   public    static ArrayList<String> asciireturn(String p,String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>first=asciireturn(p+ch,up.substring(1));
        ArrayList<String>second=asciireturn(p,up.substring(1));
        ArrayList<String>third=asciireturn(p+(ch+0),up.substring(1));
        first.addAll(second);
        first.addAll((third));
        return first;
    }
    public static void main(String[] args) {
        String up="abc";
    asciireturn("",up);
        System.out.println(asciireturn("",up));

    }
}
