import java.util.*;
class solution {
    void array(int arr[]){
        Set<Integer> list=new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
             if(arr[i]!=arr[i+1]){
                list.add(arr[i]);
             }
        }
        System.out.println(list);
          
    }
    public static void main(String[] args) {
        int arr[]={30,30,10,20,5,5};
        solution ss=new solution();
        ss.array(arr);
    }
}
