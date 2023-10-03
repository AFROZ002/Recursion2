public class Count_Zero {
    public static  int zeero(int n,int count){
        if (n==0){
            return count;
        }
        int rem=n%10;
        if (rem==0){
            count++;
        }
       return zeero(n/10,count);

    }
    public static void main(String[] args) {

        int n=30204;
        int count=0;
      int result=  zeero(n,count);
        System.out.println(result);
    }
}
