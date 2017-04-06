package abc;

public class Demo {
	
	 public static void main(String[] args) {
		 int[] a={12,3,4,44,78,96,100,55};
		 int temp;
		 for(int i=0;i<a.length-1;i++){
			 for (int j = i+1; j < a.length; j++) {
				if (a[j-1]>a[j]) {
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		 }
		 for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	 }   

}
