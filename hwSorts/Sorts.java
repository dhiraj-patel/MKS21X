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

    public static void selection(int[]data){
	for(int i = 0; i <data.length;i++){
	    int minValue = i;
	    for(int x = i; x < data.length;x++){
		if(data[minValue]>data[x]){
		    minValue = x;
		}
	    }
	    int save = data[i];
	    data[minValue] = save;
	    data[i] = data[minValue];
	}
    }

}

    
    