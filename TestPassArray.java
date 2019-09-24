package zoubo;

public class TestPassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a={1,2};
System.out.println("Before invoking swap");
System.out.println("Array is{"+a[0]+","+a[1]+"}");
swap(a[0],a[1]);
System.out.println("After invoking swap ");
System.out.println("Array is{"+a[0]+","+a[1]+"}");
System.out.println("Before invoking swapFirstTwoInarray ");
swapFirstTwoInArray(a);
System.out.println("After invoking swapFirstTwoInarray ");
System.out.println("Array is{"+a[0]+","+a[1]+"}");
	}
	public static void swapFirstTwoInarray(int[]array ){
		int temp=array[0];
		array[0]=array[1];
		array[1]=temp;
	}
}
