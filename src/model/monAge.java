package model;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class monAge {
	
	
	public monAge(){
		
	}

	@WebMethod
	public int maFonction(int annee) {
		
		int howold = 2016-annee;
		
		return howold;

	}

}
