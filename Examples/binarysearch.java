import java.util.*;
class search{
    int a[]=new int[10];
    int key;
    int pos;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.print("Enter no:");
            a[i]=sc.nextInt();
        }
        System.out.println();
        System.out.println("Enter number to search:");
        key=sc.nextInt();
    }
    void bsearch(){
        int mid,flag=0;
        
        int i=0,j=9;
        while(i<=j && flag==0){
            mid=(i+j)/2;
            if(a[mid]==key){
                flag++;
                pos=mid+1;
            }
            if(mid>key){
                j=mid-1;
            }
            if(mid<key){
                i=mid+1;
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
        else{
            System.out.println("no found at:"+pos);
        }
    }
}

class binarysearch {
    public static void main(String[] args) {
        search aa=new search();
        aa.getdata();
        aa.bsearch();
    }   
}
