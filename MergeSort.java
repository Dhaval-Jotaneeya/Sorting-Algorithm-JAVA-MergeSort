package sorting_algo;

public class MergeSort {

	public static void main(String[] args) {
		
		int arr[] = mergeSort(new int[] {34,6,78,34,87,98,56,98,0,-76,-54,-65,999}, 0, 12);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}	
	public static int[] mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int mid = (left+right)/2;
			mergeSort(a, left, mid);
			mergeSort(a, mid+1, right);
			merge(a, left, mid, right);
		}
		return a;		
	}
	public static int[] merge(int[] a, int left, int mid, int right) {
		int b[] = new int[a.length];
		
		int i = left;
		int j = mid+1;
		int k = left;
		while(i<=mid && j<=right) {
			if(a[i]<a[j]) {
				b[k]=a[i];
				i++;
			}
			else {
				b[k]=a[j];
				j++;
			}
			k++;
		}
		if(i>mid) {
			while(j<=right) {
				b[k]=a[j];
				k++;
				j++;
			}
		}
		else {
			while(i<=mid) {
				b[k]=a[i];
				k++;
				i++;
			}
		}
		for(k=left; k<=right; k++) {
			a[k]=b[k];
		}
		return a;
	}	
}
