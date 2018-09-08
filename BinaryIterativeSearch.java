
public class BinaryIterativeSearch implements Practice2Search {

	public String searchName(){
		return "BinaryIterativeSearch";
	}


	public int search(int [] arr, int target) {
		return search(arr, target, 0, arr.length-1);
	}

	public int search(int [] arr, int target, int low, int upper){
		while(low<upper) {
			int mid = (upper + low)/2;
			if(arr[mid] == target){
				return mid;
			} else if(arr[mid]<target) {
				low = mid+1;
			} else {
				upper = mid-1;
			}
		}
		return -1;
	}
}