public class BarCode implements Comparable{
    privatge String _zip;
    private int _checkDigit;
    public BarCode(String zip){
	_checkDigit = checkSum();
	_zip = zip;
    }
    public BarCode(Barcode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }
    //post: computes and returns the check sum for _zip

    private int checkSum(){
	int save = 0;
	int parsedZip = Integer.parseInt(_zip);
	for(int save; save
    }
    
	 

    
