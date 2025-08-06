public class GreatRecursiv{
	static int[] array={2,2,1,1,1,2,2};
	public static int recIndex(){
	int count=0;
	int current=0;
	for(int i=0; i<array.length-1; i++){
	if(array[i]==array[i+1]){
	count++;
	}else{
	count--;
	}
	}	
	return count;
	}

	public static void main(String [] args){
	System.out.println("Hello , Abhishek");
	int result=recIndex();
	if(result==1){
	System.out.println("the most comming Element is 2");
	}else{
	System.out.println("the most comming element is 1");
	}
	}
}
