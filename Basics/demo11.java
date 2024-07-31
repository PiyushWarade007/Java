import java.util.Arrays;

public class demo11 {
    static void func(int arr[],int n){
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            if(count==1){
                System.out.print(arr[i]);
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,10,20};
        int n=arr.length;
        func(arr,n);
    }
}
