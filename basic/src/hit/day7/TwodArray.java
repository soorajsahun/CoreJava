package hit.day7;

public class TwodArray {

	public static void main(String[] args) {
		//one dimensional array
		int marks[]=new int[5];
		marks[1]=1000;
//		for(int i=0;i<marks.length;i++)
//			System.out.println(marks[i]);
		
//		new for loop
		for(int i:marks) {
			System.out.println(i);
		}
	
//	two dimensional array
	int twod[][]= {{1,2,3},{4,5,6}};
//	for(int i=0;i<twod.length;i++) {//length returns row value
//		for(int j=0;j<twod[i].length;j++) {//length returns column value
//			System.out.print(twod[i][j]+" ");
//		}
//		System.out.println();
//	}
	
//	new for loop
	for(int i[]:twod) {
		for(int j:i) {
			System.out.print(j);
		}
		System.out.println();
	}
	
	//uneven multidimensional array=rows are fixed and columns are not fixed
	
	int unevenarr[][]= {
			{1,2,3,4},
			{5,6},
			{7,8,9}};
	int unevenarr2[][]=new int[3][];//means 3rows are fixed
	unevenarr2[0]=new int[3];//zeroth row has 3 columns
	unevenarr2[1]=new int[5];//1st row has 5 columns
	unevenarr2[2]=new int[2];//2nd row has 2 columns
	
	for(int i[]:unevenarr) {
		for(int j:i) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}
}
