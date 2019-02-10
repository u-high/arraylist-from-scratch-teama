import java.util.Arrays;

public class MyArrayList_Runner{
	
	public static void main(String[] args){
		int[] array1 = {10, 5, 2, 3};
		
		MyArrayList ob = new MyArrayList();
		ob.add(2);
		ob.add(3);
		ob.add(99);
		System.out.println("Array 1");
		System.out.println(Arrays.toString(ob.getArray()));
		ob.setArray(array1);
		System.out.println("After setArray" + Arrays.toString(ob.getArray()));
		
		
		MyArrayList ob2 = new MyArrayList(array1);
		System.out.println("Array 2");
		System.out.println(Arrays.toString(ob2.getArray()));
		
		
	}
}