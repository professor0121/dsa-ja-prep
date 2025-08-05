public class q5{
	public static void printStart(int n){
		for(int i=n; i>=1; i--){
			for(int j=n; j>=1; j--){
				if(j <= i){
					System.out.print("*");	
				}else{
					System.out.print(" ");
				}
			}
		System.out.println("");
		}
	}
	public static void main(String[] args){
	System.out.println("hello worlds");
	printStart(5);	
	}
}
 