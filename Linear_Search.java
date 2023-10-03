public class Linear_Search {
    public  static  Boolean Linear(int []arr,int target,int  index){
        if (index>arr.length-1){
            return false;
        }
        return arr[index]==target || Linear(arr,target,index+1);

    }
    public  static  int Finds(int []arr,int target,int  index){
        if (index>arr.length-1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return  Finds(arr,target,index+1);

    }
    public static void main(String[] args) {
        int []arr={2,4,5,7,8,9,12,13,15};
        int target=15;
        System.out.println(Linear(arr,target,0));
        System.out.println(Finds(arr,target,0));
    }
}
