package by.htp.les10.logic;

import by.htp.les10.entity.Fraction;

public class FractionLogic {

	public Fraction sum(Fraction f1, Fraction f2) {
		int newNum;
		int newDen;
		
		newNum = f1.getNumerator() * f2.getDenominator() + f1.getDenominator() * f2.getDenominator();
		newDen = f1.getDenominator() * f2.getDenominator();
		
		Fraction rezult = new Fraction(newNum, newDen);
		
		return rezult;
	}
	
	public void reduce(Fraction f) {
		/*
		 * int nod;
		 * 
		 * if(numerator > denominator) { nod = denominator; }else { nod = numerator; }
		 * 
		 * while ( !((numerator % nod == 0) && (denominator % nod == 0)) ) { nod--; }
		 * 
		 * numerator = numerator / nod; denominator = denominator / nod;
		 */
	}
}
