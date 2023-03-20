import java.time.*;
import java.util.*;

class mergeSort{

	//divide the array till single element
    static void divide(int a[],int n){
	    
		//recursive Base condition
		if(n<2)    
		return;
	    
	    int m1=n/2;                
	    int m2=n-m1;               
	    int b[]=new int[m1];       
	    int c[]=new int[m2];       
	
	    for(int i=0;i<m1;i++){
	    	b[i]=a[i];             
    	}
	    for(int i=0;i<m2;i++){
		    c[i]=a[i+m1];          
	    }

	    divide(b,m1);
	    divide(c,m2);
	    merge(a,b,c,m1,m2);	
    }


	// Merge the breaked array in sorted order
    static void merge(int a[],int b[],int c[],int m1,int m2){

	    int i,j,k;
	  
		for(i=0,j=0,k=0;i<m1 && j<m2;){   
		    
			if(b[i]<c[j])
			a[k++]=b[i++]; // adding lesser values to sorted array
	
		    else
			a[k++]=c[j++];   // adding lesser values to sorted array  
	    }
	    
		while(i<m1)
	    a[k++]=b[i++];		

	    while(j<m2)
	    a[k++]=c[j++];
		

	}


    public static void main(String[] args){

	  
		Instant start=Instant.now();

	    Scanner scn=new Scanner(System.in);
	   
	    //No of Element to Add in the Array
	    System.out.println("Enter the no of Element you want in Array ");
        int n=scn.nextInt();

	    //Create a Array of Size n
	    int a[]=new int[n];

	    // Add Element to the Array 
	    System.out.println("Add elemnt to the array to SORT it");
	   
	    for(int i=0;i<n;i++){
		    a[i]=scn.nextInt();
	    }
		System.out.print("Entered Array : ");
		for(int i=0;i<n;i++){
			System.out.print(a[i] + " ");
		}
	    
		//invoking fn. Divide the Array untill single element left 
	    divide(a,n);
	 
	    //print the Array After Sorting
		System.out.print("\nSorted  Array : ");
	    for(int i=0;i<n;i++) {
		    System.out.print(a[i] + " ");   
    	}

		//get the total time taken to execute the code
		Instant end=Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("\nTotal time taken to execute this code : " + timeElapsed.toSeconds() + " milliseconds");
    }
}