package ArrayBasics;
class dupArray{
public static void main(String[] args) {
    int ori[]={10,20,30,40,50};
    int []dup=ori.clone();
    System.out.println("dup arr");
    for(int num:dup){
        System.out.print(num+" ");
    }
}
}