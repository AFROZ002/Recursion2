public class Steps_to_Zero {
    public  static  int Steps(int n,int count){
        if (n==0){
            return count;

        }
      if (n%2==0)       //  Even
        {
             n=n/2;
        }
      else  {
          n=n-1;
      }
      count++;
      return Steps(n,count);
    }

    public static void main(String[] args) {
        int n=41;
        int count=0;
     int RT=   Steps(n,count);
        System.out.println(RT);


    }
}
