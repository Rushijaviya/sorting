import java.util.*;
public class selection {
    public static void main(String args[]){
        Scanner hp=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter length of array");
        n=hp.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++){
            a[i]=hp.nextInt();
        }
        for(i=0;i<n-1;i++){
            int min=i;
            for(j=i+1;j<n;j++){
                if(a[j]<a[min])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
/*
    Best case:      O(N^2)
    Average case:   O(N^2)
    Worst case:     O(N^2)
*/
/*
    Internal sort:  YES
    External sort:  NO
    Stable sort:    NO
    In-place sort:  YES
*/
