public class REverse_a_Number {

  static  int sum=0;
   static   void Rn(int n){
//     int sum=0;
     if (n==0){
         return;
     }
     int rem=n%10;
      sum=sum*10+rem;
     Rn(n/10);
 }
 static   int   Rn2(int n){
       int digit=(int)(Math.log(10))+1;
       return helper(n,digit);
 }
 private   static int helper(int n,int digit){
      if (n%10==0){
          return n;
      }
      int rem=n%10;
      return rem*(int)Math.pow(10,digit-1)+helper(n/10,digit-1);

 }

    public static void main(String[] args) {
//        Rn(1824);

        Rn2(1824);
        System.out.println(  Rn2(1824));
    }
}
