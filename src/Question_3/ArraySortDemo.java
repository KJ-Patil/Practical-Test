package Question_3;

public class ArraySortDemo {
	
public static double[] sortArray(double[] array){
        
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                double temp = 0;
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] a=new double[]{1.3,2.9,4.1,6.2,8.2,3.3};
        double[] sort =sortArray(a);
        for(int i=0; i<a.length; i++){
            System.out.println(""+sort[i]);
        }
		
		

	}

}
