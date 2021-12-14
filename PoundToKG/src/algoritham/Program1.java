package algoritham;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value [] = {1,-2,4,-5,1};
		//int i=value.length-1;
		//int j =1;
		int count =0;
		for(int i=0;i<value.length;i++) {
			
			int sum =0;
			for(int j =i;j<value.length;j++) {
				
				sum =value[j]+sum;
				
				if(sum<0) {
					
					count++;
				}
				
			}
			
			
		}
		System.out.println(count);

	}

}
