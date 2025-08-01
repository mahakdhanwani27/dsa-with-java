package ArrayBasics;
import java .util.Scanner;
class Reversanarray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter  the value of n");
        int n=sc.nextInt();
        int arr[]=new int[n];
       
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
             i++;
        j--;
        }
       
        for(int num:arr){
            System.out.print(num);
        }
sc.close();

    }
}
