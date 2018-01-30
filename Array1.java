
public class Array1 {
	public static void main(String[] args) {
//		<data type> <identifier>[];
		int a;//normal variable
		int ar[]; //or int []ar or int[] ar
//		array type variable
		ar = new int[5];//allocation
		
		ar[2] =45;
		ar[4] =30;//initialization
		System.out.println("Number of elements in array is "+ar.length);
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(i+1 + "--->" +ar[i]);
		}
	}
	
	

}
