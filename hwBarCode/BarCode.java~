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
    private int checkSum(){
	int ans = 0;
	for (int i =0 ; i < _zip.length();i++){
	    ans+=_zip.charAt(i);
	}
	return sum % 10;
    }
    
	 

    
