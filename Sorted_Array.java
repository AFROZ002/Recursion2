public class Sorted_Array {
    public  static  Boolean Sorted(int[]arr,int index){
        if (index== arr.length-1){
            return true;
        }
        return arr[index]<=arr[index+1] &&Sorted(arr,index+1);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,111,10};

        System.out.println(  Sorted(arr,0));



    }
}
