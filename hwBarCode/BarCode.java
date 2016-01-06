public class BarCode implements Comparable{
    privatge String _zip;
    private int _checkDigit;

    private static final String[] barcodes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};


    
    public BarCode(String zip){
	_checkDigit = checkSum();
	_zip = zip;
    }
    public BarCode(Barcode b){
	_zip = b._zip;
	_checkDigit = b._checkDigit;
    }
    //post: computes and returns the check sum for _zip
    //The check digit is equal to the sum of the digits of the zip code modulo 10.
    private int checkSum(){
	int parsedZip = Integer.parseInt(_zip);
	int saveNum = 0;
	for (int parsedZip; parsedZip != 0; parsedZip /= 10){
	    saveNum = parsedZip % 10; //MODULO!
	}
	int ans = saveNum %10; // need another modulo for the end!
	return ans;
	
    }
    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"  
    private String toString(){
	String ans = "";
	int i = 0;
	while(i < _zip.length();){
	    ans += barcodes[Integer.parseInt(_zip.substring(i,i+1))];
	    i++;
	}
	return ans;
	   
    }

    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.
    
    public boolean equals(Object other){
	return ((other instanceof BarCode) && (((BarCode)other)._zipequals(_zip)));
    }
    public int compareTo(Object other){
	int parsedZip = Integer.parseInt(_zip);
	int parsedOtherZip = Integer.parseInt(((BarCode)other)._zip);
	return parsedZip - parsedOtherZip;
    }
}

	    
	    
       

	 

    
