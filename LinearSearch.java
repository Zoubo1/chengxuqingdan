package chengcuqingdan;

public class LinearSearch {

	public static int linearSearch(int[]list,int key) {
		// TODO Auto-generated method stub
for (int i=0;i<list.length;i++) {
	if(key==list[i])
		return i;

}
	return -1;
	}

}
