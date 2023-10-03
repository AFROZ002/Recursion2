import java.util.Arrays;

public class Selection_Recursion {
    public  static void Selection(int []arr,int len,int i,int max){
        if (len==0){
            return;
        }
        if (i<len){
         if (arr[i]>arr[max]){
             Selection(arr,len,i+1,i);
         }
         else {
             Selection(arr,len,i+1,max);

         }
        }
        else {
            int temp=arr[max];
            arr[max]=arr[len-1];
            arr[len-1]=temp;
            Selection(arr,len-1,0,0);
        }

    }
    public static void main(String[] args) {
        int []arr={4,3,2,1};

      Selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
}
