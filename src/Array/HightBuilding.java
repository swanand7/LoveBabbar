package Array;

public class HightBuilding {
	
	    static int getMinDiff(int[] arr, int n, int k) {
	        int i;
	        //int min=arr[]0,max=0;
	        int mn=arr[0];
	        int mx=arr[0];
	        for (i=0;i<n;i++){
	            if(arr[i]<=k){
	                arr[i]=+k;
	            }
	            else{
	                arr[i]=-k;
	            }
	        }
	        for(i=0;i<n;i++) {
	        	int temp=0;
	        	if(arr[i]>mx) {
	        		mx=arr[i];
	        	}else if(arr[i]<mn) {
	        		mn=arr[i];
	        	}
	        }
	    return mx-mn;
	        
	    }
	    public static void main(String[] args) {
	    	int K = 2, N = 4;
	    			int Arr[] = {1, 5, 8, 10};
	    		System.out.println(getMinDiff(Arr, N, K));	
		}
}

