import java.util.Scanner;
import java.time.*;
public class mergeSort{
	public static void main(String[] args) {

		Instant start=Instant.now();
		try (Scanner scn = new Scanner(System.in)) {
			//Size of array
			System.out.println("Enter the size of Array");
			int n=scn.nextInt();

			//Create an array and add element to it
			int arr[]=new int[n];
			System.out.println("Add element to the Array");
			for(int i=0;i<n;i++){
				arr[i]=scn.nextInt();
			}

			//Display the Entered array
			System.out.println("Entered Array : ");
			for(int i=0;i<n;i++){
				System.out.print(arr[i] + " ");
			}

			//invoke sort function
			divide(arr,n);

			//Print final Sorted Array
			System.out.println("\nSorted Array : ");
			for(int i=0;i<n;i++){
				System.out.print(arr[i] + " ");
			}
			Instant end=Instant.now();
			Duration timeElapsed=Duration.between(start, end);
			System.out.println("\nTotal time taken to complete execution of code " + timeElapsed.toMillis() + "milo second");
		}
	}
	static void divide(int arr[],int n){
		if(n<2)
		return;

		int m1=n/2;
		int m2=n-m1;
		int b[]=new int[m1];
		int c[]=new int[m2];

		for(int i=0;i<m1;i++){
			b[i]=arr[i];
		}
		for(int i=0;i<m2;i++){
			c[i]=arr[i+m1];
		}

		divide(b, m1);
		divide(c, m2);

		//invoke merge function
		merge(arr,b,c,m1,m2);
	}
	static void merge(int arr[],int b[],int c[],int m1,int m2){
		int i,j,k;
		for(i=0,j=0,k=0;i<m1&&j<m2;){
			if(b[i]<c[j])
				arr[k++]=b[i++];	
			else
			arr[k++]=c[j++];
		}

		while(i<m1){
			arr[k++]=b[i++];
		}
		while(j<m2){
			arr[k++]=c[j++];
		}
	}
}
