public class Bubblesort{
    public static void main(String args[]){
        int nums[]={9,4,5,8,2,6};
        int temp=0;
        System.out.println("Before Sorting");
        for(int num:nums){
            System.out.print(num+ " ");
        }
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }

        }

System.out.println();
        System.out.println("After Sorting");
        for(int num:nums){
            System.out.print(num + " ");
        }

    }
}