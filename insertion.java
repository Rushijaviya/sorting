/* 
 * Algorithm
 * To sort an array of size n in ascending order:
 * 	1. Iterate from array[1] to array[n] over the array.
 * 	2. Compare the current element (key) to its predecessor.
 * 	3. If the key element is smaller than its predecessor, compare it to the elements before. 
 *     Move the greater elements one position up to make space for the swapped element.
*/

import java.util.Scanner;
public class insertion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter length of your array: ");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements: ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.print("Given Array is: "+"[");
        for(i=0;i<n;i++) {
        	System.out.print(a[i] + " ");
        }
        System.out.print("]");
        for(i=1;i<n;i++){
            int key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        System.out.print("\nSorted  Array is: "+"[");
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}
/*
    Best case:      O(N)
    Average case:   O(N^2)
    Worst case:     O(N^2)
*/
/*
    Internal sort:  YES
    External sort:  NO
    Stable sort:    YES
    In-place sort:  YES
*/
