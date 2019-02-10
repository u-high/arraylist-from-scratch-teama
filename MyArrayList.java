public class MyArrayList{
	
	private int[] array;
	
	public MyArrayList(){
		array = new int[0];
	}
	
	public MyArrayList(int[] arrayIn){
		array = arrayIn;
	}
	
	public int[] getArray(){
		return array;
	}
	
	public void setArray(int[] arrayIn){
		array = arrayIn;
	}
	
	public void add(int input){
		int[] temp = new int[array.length+1];
		for(int i = 0; i< array.length; i++){
			temp[i] = array[i];
		}
		temp[array.length] = input;
		array = temp;
	}
	
	public int get(int i){
		return array[i];
	}
	
	public int set(int index, int input){
		int oldValue= -999;
		int[] temp = new int[array.length];
		for(int i = 0; i< array.length; i++){
			if( i == index){
				oldValue = array[i];
				temp[i] = input;
				continue;
			}
			temp[i] = array[i];
		}
		array = temp;
		return oldValue;
	}
	

}