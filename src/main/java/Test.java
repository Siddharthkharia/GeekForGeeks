
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,5,6,6,7,8,15};
		for (int i=0;i<=arr.length-3;i++) {
			if(arr[i]+arr[i+1]==arr[i+2]) {
				System.out.print(arr[i]+ ", "+ arr[i+1]+", "+arr[i+2]);
				System.out.println();
			}
		}

	}

}
