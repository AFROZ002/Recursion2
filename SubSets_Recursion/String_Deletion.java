package SubSets_Recursion;

public class String_Deletion {
    public  static  void Skip(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            Skip(p,up.substring(1));
        }
        else {
        Skip(p+ch,up.substring(1));
        }
    }
    public  static  String Skip(String up){
        if (up.isEmpty()){
//            System.out.println(p);
            return " ";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
          return   Skip(up.substring(1));
        }
        else {
         return  ch+Skip( up.substring(1));
        }
    }
    public static void main(String[] args) {
        String up="afrozalam";
        System.out.println( Skip(up));


    }
}
