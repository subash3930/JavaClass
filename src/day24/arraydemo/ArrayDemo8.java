package day24.arraydemo;

public class ArrayDemo8 {

	public static void main(String[] args) {
		double [][]d= new double[][]{{1.1,2.1,3.1},{2.5,2.6,2.7},{3.2,3.3,3.4}};
        for(int i=0;i<d.length;i++) {
        	for(int j=0;j<d[i].length;j++) {
        	System.out.print(d[i][j]+" ");	
        	}
        	System.out.println(" ");
        }
	}

}
