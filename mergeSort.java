import java.util.Scanner;

class mergeSort{
    static void split(int a[],int n){
	    
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

	    split(b,m1);
	    split(c,m2);
	    sum(a,b,c,m1,m2);	
    }


    static void sum(int a[],int b[],int c[],int m1,int m2){
	    int i,j,k;
	  
		for(i=0,j=0,k=0;i<m1 && j<m2;){   
		if(b[i]<c[j])
			a[k++]=b[i++];     // adding lesser values to sorted array
		else
			a[k++]=c[j++];     // adding lesser values to sorted array
	    }
	    
		while(i<m1)a[k++]=b[i++];
	    while(j<m2)a[k++]=c[j++];	
    
	}


    public static void main(String[] args){
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
	   
	    split(a,n);
	 
	    //print the Array After Sorting
		System.out.print("\nSorted Array : ");
	    for(int i=0;i<n;i++) {
		    System.out.print(a[i] + " ");   //printing sorted array
    	}
    }
}