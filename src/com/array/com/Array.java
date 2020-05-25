package com.array.com;
import java.util.*;
public class Array {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of the Array :");
			int n = sc.nextInt();
			long arr[] = new long [n];
			System.out.print("Enter the Elements in the Array :");
			// For inserting data into the array
			for(int i =0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			// for Displaying the element in the array
			for(int i = 0; i<arr.length;i++) {
				System.out.println("Elements in the array are : "+arr[i]);
			}
			// Searching the element in the array
			System.out.println("Enter the element to search in the array");
			int data = sc.nextInt();
			int k;
			for( k= 0; k<arr.length; k++) {
				if(arr[k] == data) {
					break;
				}}
				if(k == arr.length) {
					
					System.out.println("Data is not availabe");
				}else {
					System.out.println("Data is availabel at index of "+k);
				}
			
			// For deleting  data form the array
			 System.out.println("Enter the data to delete form the array");
			int data1 = sc.nextInt();
			int l;
			for( l=0; l<arr.length;l++) 
				if(arr[l] == data1) 
					break;
				for(int j =l;j<n-1;j++) 
					arr[j] = arr[j+1];
					n--;
				
			
			// Again to display the array after the deletion of the array
			for(int i =0; i<n;i++) {// here is n is the next size of the array;
				System.out.println("Elements after the deletion of the data from the array : "+arr[i]);
			}
	}

}
