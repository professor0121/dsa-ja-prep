public class q8{
	public static void printStart(int n){
		for(int i=0; i<n; i++){
			for (int j = 0; j < n; j++) {
                if(i==0){
                    System.out.print("*");
                }else{
                    if(j==0 || j==n-1 || i==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
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
