public class q4{
	public static void printStart(int n){
		for(int i=1; i<=n; i++){
			for(int j=n; j>=i; j--){
			System.out.print("*");
			}
		System.out.println("");
		}
	}
	public static void main(String[] args){
	System.out.println("hello worlds");
	printStart(5);	
	}
}
