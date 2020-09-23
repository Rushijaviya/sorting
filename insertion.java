import java.util.Scanner;
public class insertion {
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
        for(i=1;i<n;i++){
            int key=a[i];
            j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
}
