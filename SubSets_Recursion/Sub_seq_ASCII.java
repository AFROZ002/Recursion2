package SubSets_Recursion;

public class Sub_seq_ASCII {
    public  static  void  subseqAscii(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }
        char ch=up.charAt(0);
//        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p +(ch+0),up.substring(1));
    }
    public static void main(String[] args) {
        String up="abc";
        subseqAscii("",up);

    }
}
