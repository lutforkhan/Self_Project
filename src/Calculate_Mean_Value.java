
public class Calculate_Mean_Value {

	public static void main(String[] args) {



		int[] a= {10, 35, 50, 20};

		int total=0, dataNumber;
		float mean;

		dataNumber=a.length;

		for (int i=0; i<a.length;i++)
		{

			total=total+a[i];

		}
		mean=total/dataNumber;
		System.out.println("Total value is  "+total);
		System.out.println("Array size is  "+dataNumber);
		System.out.println("Mean value is "+mean);

	}
	

}


