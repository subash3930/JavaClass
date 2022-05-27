package day24.arraydemo;

public class ArrayDemo7 {

	public static void main(String[] args) {
		String[][]namelist={{"ab","bc","cd"},{"ef","gh","ij"},{"lm","no","pq"}};
       for(int i=0;i<namelist.length;i++) {
    	   for(int j=0;j<namelist[i].length;j++) {
    		   System.out.println(namelist[i][j]+" ");
    	   }
    	   System.out.println(" ");
    	   
       }
	}

}
