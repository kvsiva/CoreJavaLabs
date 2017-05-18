package com.corelabs;

public class InheritanceLab4 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1  objref;

		objref  = new C1();

		objref.print( );

		//object  ref .of  super  class  points to  object  of  subclass

		objref  =  new C2( );
        
		/*calls to print method calls print of subclass as objref point to object of  subclass. */
		

		objref .print( );  //  calls print  of subclass

	}

}
