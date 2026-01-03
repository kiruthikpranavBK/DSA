package collection;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int key=sc.nextInt();
	    int c=0;
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            c=a[i]+a[j];
	            if(key==c){
	                System.out.println(a[i]+" "+a[j]);
	               
	            }
	        }
	    }
	}
}