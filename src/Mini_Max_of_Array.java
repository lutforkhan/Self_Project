
public class Mini_Max_of_Array {

	public static void main(String[] args) {


		int[] a= {10, 35, 50, 20};

		int Max, Mini;
		Max=a[0];
		Mini=a[0];

		for (int i=0; i<a.length;i++)
		{
			if (Max<a[i]) {
				Max=a[i];
			}
			
		}
		System.out.println("The maximum number in this array is "+Max);	
		
		for (int i=0; i<a.length;i++)
		{
			if (Mini>a[i]) {
				Mini=a[i];
			}
			
		}

		System.out.println("The minimum number in this array is "+Mini);	

	}

}
