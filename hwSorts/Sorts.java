public class Sorts{
    public static void printArray(int[]data){
	String res = "[";
	for (int i = 0; i < data.length; i++){
	    res += " " + data[i];
	    if (i != (data.length - 1)){
		res += ",";
	    }
	}
	System.out.println(res + "]");
    }
    
    public static void insertionSort(int[]data){
	for (int i = 1; i < data.length; i++){
	    int old = data[i];
	    int j = i;
	    while(j > 0  && data[j-1] > old){
		data[j] = data [j - 1];
		j--;
	    }
	    data[j] = old;
	}
    }

    public static void selectionSort(int[]data){
	for(int i = 0; i < data.length; i++){
	    int minValue = data[i];
	    int indexToReplace = i;
	    for(int x = i; x < data.length; x++){
		if(data[x]<minValue){
		    minValue = data[x];
		    indexToReplace = x;
		}
	    }
	    // switch the values: 
	    int replacingValue = data[indexToReplace];
	    data[indexToReplace]=data[i];
	    data[i] = replacingValue; 
	}
    }
		
    public static String printTry(int[]data){
	String answer = "";
	for(int i = 0; i < data.length; i++){
	    answer = answer + data[i] + ", ";
	}
	return answer;
    }
	
    public static void main(String[] args){
	int[]data = {1,2,9,5,0,3};
	selectionSort(data);
	System.out.println(printTry(data));
    }
    
		 

    

}

    
    