package Array;

import java.util.Arrays;
import java.lang.ArrayIndexOutOfBoundsException;
public class BMinMax {
	static class Pair{
		int min;
		int max;
	}
	static Pair getMinMax(int arr[],int n) {

		Pair minmax = new Pair();
		minmax.max=0;
		minmax.min=arr[1];
		if(n==1) {
			minmax.min=arr[0];
			minmax.max=arr[0];
		}
		else
		{
			for(int i=0;i<n;i++) {
				if(arr[i]>minmax.max) {
					minmax.max=arr[i];
				}
				else if(arr[i]<minmax.min)
				{
					minmax.min=arr[i];
				}
			}
		}
		return minmax;
		
	}
public static void main(String[] args) {
	int arr[]= {3,2,5,6,72,2,4,5,4,3,0};
	int arr2[]= {1,9,5};
	int n=arr.length;
	int n2=arr2.length;
	System.out.println(getMinMax(arr, n).max + " " +getMinMax(arr, n).min);
System.out.println("Going strong");

}
}
