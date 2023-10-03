import java.util.ArrayList;

public class ALAdd {
    public  static ArrayList<Integer> FindallIndex(int []arr,int target,int index,ArrayList<Integer>list){
        if (index> arr.length-1){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
     return    FindallIndex(arr,target,index+1,list);
    }
    public static void main(String[] args) {
        int []arr={2,4,5,7,8,9,12,15,15};
        int target=15;
      ArrayList<Integer>Afroz=new ArrayList<>();
        FindallIndex(arr,target,0,Afroz);
        System.out.println(Afroz);
    }
}
