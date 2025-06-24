
public class Array {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,58,5,5};
		String b[]=new String[5];
		
		for(int x:a) {
			System.out.println(x);
		}
		int c[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int[] x:c) {
			for(int h:x) {
				System.out.print(h+" ");
			}
			System.out.println();
		}
	}
}
