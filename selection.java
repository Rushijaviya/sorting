/*
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning. 
 * The algorithm maintains two subarrays in a given array.
 * 
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 * 
 * In every iteration of selection sort, the minimum element from the unsorted subarray is picked and moved to the sorted subarray.
*/
import java.util.*;
public class selection {
    public static void main(String args[]){
        Scanner hp=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter length of array: ");
        n=hp.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array: ");
        for(i=0;i<n;i++){
            a[i]=hp.nextInt();
        }
        System.out.print("Given Array is: "+"[");
        for(i=0;i<n;i++) {
        	System.out.print(a[i] + " ");
        }
        System.out.print("]");
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
        System.out.print("\nSorted  Array is: "+"[");
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
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
