
class BinaryRecursiveSearch implements Practice2Search {


	public String searchName(){
		return "BinaryRecursiveSearch";
	}

	public int search(int [] arr, int target) {
		return search(arr, target, 0, arr.length-1);
	}

	public int search(int [] arr, int target, int low, int upper) {
		if(low>upper) {
			return -1;
		}
		int mid = (upper + low)/2;
		if(arr[mid] == target) {
			return mid;
		} else if(arr[mid]<target) {
			return search(arr, target, mid + 1, upper);
		} else {
			return search(arr, target, low, mid-1);
		}
	}
}