package Array;
 import java .util.*;

public class Index {
    

    public static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
for(int i=0;i<arr.length;i++){
System.out.print(i+ " "+arr[i]);
}
sc.close();
    }

    
}

