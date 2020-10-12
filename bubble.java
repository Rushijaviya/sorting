import java.util.*;
public class bubble {
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
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("\nSorted  Array is: "+"[");
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.print("]");
    }
}
/*
    Best case:    O(N^2)
    Average case: O(N^2)
    Worst case:   O(N^2)
*/
/*
    Internal sort: YES
    External sort: NO
    stable sort:   YES
    In place:      YES 
*/
