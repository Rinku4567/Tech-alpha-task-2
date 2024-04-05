import java.util.*;
public class Taskthree {
    public static int[] rotate(int[] arr,int d){
        int i=1;
        while(i<=d){
            for(int j=0;j<arr.length-1;j++){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
            }
            i++;
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
        return arr;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
        array[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        rotate(array,k);
sc.close();
    }
}
