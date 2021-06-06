package Array;

import java.util.HashSet;

public class unionOfElement {
	
	static int unionOfArray(int []a,int m,int []b,int n) {
	HashSet<Integer> hs=new HashSet<Integer>();
	int i;
	for (i=0;i<m;i++) {
		hs.add(a[i]);
	}
	for (i=0;i<n;i++) {
		hs.add(b[i]);
	}
	
	return hs.size();
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3};
		int m=a.length;
		int n=b.length;
		System.out.println(unionOfArray(a, m, b, n));
		//nice
	}
}
