import java.util.*;
public class bubble {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter length");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
/*
    Best case:    O(N^2)
    Average case: O(N^2)
    Worst case:   O(N^2)
*/
