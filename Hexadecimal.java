//NOTE: IF IT HAS '//TEMP', IT'S NOT DONE 


public class Hexadecimal {

    //class var
    private static String allHex = "0123456789ABCDEF";

    
    //instance vars
    private int _decNum;
    private String _hexNum;

    
    //CONSTRUCTORS
    //default constructor
    public Hexadecimal() {
	_decNum = 0;
	_hexNum = "" + _decNum;
    }

    //overloaded constructor #1--given _decNum (positive)
    public Hexadecimal( int n ) {
	this(); //TEMP
    }

    //overloaded constructor #2--given _hexNum (positive)
    public Hexadecimal( String n ) {
	this(); //TEMP
    }

    
    //string representation aka toString()
    public String toString() {
	return _hexNum; 
    }

    
    //convert from decimal num to hex num iterative
    public static String decToHex( int n ) {
	String hex = "";
	while ( n > 0 ) {
	    hex = (allHex.substring((n%16),(n%16)+1)) + hex;
	    n = n/16;
	}
	return hex;
    }

    //convert from decimal num to hex num recursive
    public static String decToHexR( int n ) {
	if ( n == 0 ) { return "0"; }
        return decToHexR( n/16 ) + (allHex.substring((n%16),(n%16)+1));
    }

    //convert from hex num to decimal num iterative
    public static int hexToDec( String n ) {
	return 0; //TEMP
    }

    //convert from hex num to decimal num recursive
    public static int hexToDecR( String n ) {
	return 0; //TEMP
    }

    
    //checks to see if 2 objects are equivalent
    public boolean equals( Object val ) {
	return false; //TEMP
    }

    
    //tells which of the 2 hexadecimal objects is greater
    public int compareTo( Object other ) {
	return 0; //TEMP
    }

    
    //main method for testing!!!
    public static void main( String[]args ) {
	System.out.println( decToHex(1) ); //1
	System.out.println( decToHex(2) ); //2
	System.out.println( decToHex(15) ); //F
	System.out.println( decToHex(32) ); //20
	System.out.println( decToHex(85) ); //55
	System.out.println( decToHex(4329) ); //10E9
	System.out.println( decToHex(127) ); //7F
	System.out.println( decToHex(918273645) ); //36BBBE6D
  	System.out.println( decToHexR(1) ); //1
	System.out.println( decToHexR(2) ); //2
	System.out.println( decToHexR(15) ); //F
	System.out.println( decToHexR(32) ); //20
	System.out.println( decToHexR(85) ); //55
	System.out.println( decToHexR(4329) ); //10E9
	System.out.println( decToHexR(127) ); //7F
	System.out.println( decToHexR(918273645) ); //36BBBE6D
    } //end main
    
} //end class
