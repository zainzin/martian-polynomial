package p4_martianpolynomial;



import p4_utility.MyDouble;

/**
 * A general representation of a Martian polynomial of the form:
 * (a*x^2 + b*x + c)
 * 
 * @author YOUR NAME HERE
 * @date October 2014
 */

public class MartianPolynomial {
	private final MyDouble a;
	private final MyDouble b;
	private final MyDouble c;
	
	
	//IMPLEMENT THE CLASS UP HERE
	//PLEASE NOTE: You will need to implement your constructor before
	//   this project will even be able to compile.  You must use the
	//   instance fields above in your project.
	public MartianPolynomial(MyDouble a,MyDouble b,MyDouble c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public MartianPolynomial(MyDouble b, MyDouble c){
		this.a = MyDouble.zero;
		this.b = b;
		this.c = c;
	}
	public MartianPolynomial(MyDouble c){
		this.a = MyDouble.zero;
		this.b = MyDouble.zero;
		this.c = c;
	}
	public MartianPolynomial(){
		this.a = MyDouble.zero;
		this.b = MyDouble.zero;
		this.c = MyDouble.zero;
	}
	public MartianPolynomial(MartianPolynomial poly){
		a = poly.a;
		b = poly.b;
		c = poly.c;
	}
	public MyDouble getA(){
		return a;
	}
	public MyDouble getB(){
		return b;
	}
	public MyDouble getC(){
		return c;
	}
	public MyDouble eval(MyDouble XValue){
		MyDouble evaluation = a.multiply(XValue.square()).add(b.multiply(XValue)).add(c);
		return evaluation;
	}
	public MartianPolynomial add(MartianPolynomial polynomial){
		MartianPolynomial sum = new MartianPolynomial(a,b,c);
		MyDouble aCoff = sum.a.add(polynomial.a);
		MyDouble bCoff = sum.b.add(polynomial.b);
		MyDouble cCoff = sum.c.add(polynomial.c);
		return new MartianPolynomial(aCoff, bCoff, cCoff);
	}
	public MartianPolynomial subtract(MartianPolynomial polynomial){
		MartianPolynomial sum = new MartianPolynomial(a,b,c);
		MyDouble aCoff = sum.a.subtract(polynomial.a);
		MyDouble bCoff = sum.b.subtract(polynomial.b);
		MyDouble cCoff = sum.c.subtract(polynomial.c);
		return new MartianPolynomial(aCoff, bCoff, cCoff);
	}
	public MartianPolynomial glorp(MartianPolynomial polynomial){
		MyDouble firstTerm = this.a.multiply(polynomial.c);
		MyDouble seconedTerm = this.a.multiply(polynomial.b).add(this.b.multiply(polynomial.c));
		MyDouble thirdTerm = this.c.multiply(polynomial.c).add(this.b.multiply(polynomial.b)).add(this.a.multiply(polynomial.a));
		MyDouble fourthTerm = this.c.multiply(polynomial.b).add(this.b.multiply(polynomial.a));
		MyDouble fifthTerm = this.c.multiply(polynomial.a);
		if(firstTerm.isZero() && seconedTerm.isZero()){
			return new MartianPolynomial(thirdTerm, fourthTerm, fifthTerm);
		}else
		return null;
	}
	public MartianPolynomial splee(){
		MyDouble coB = new MyDouble(4).multiply(a.multiply(c));
		MyDouble coC = new MyDouble(b.multiply(c));
		return new MartianPolynomial(coB, coC);
	}
	public MyDouble cliff(){
		MyDouble newDouble = new MyDouble(((a.add(b).add(c)).square()).sqrt());
		return new MyDouble(newDouble);
	}
	public int compareTo(MartianPolynomial polynomial){
		return this.cliff().compareTo(polynomial.cliff());
	}
	public String toString(){
		String firstTerm = null,secTerm = null,thirdTerm = null;
		if(this.a.compareTo(MyDouble.zero)>0){
			firstTerm = this.a + "x^2";
		}
		else if(this.a.compareTo(MyDouble.zero)<0){
			firstTerm = "-" + this.a + "x^2";
		}
		if(this.b.compareTo(MyDouble.zero)>0){
			secTerm = "+" + this.b + "x";
		} 
		else if(this.b.compareTo(MyDouble.zero)<0){
			secTerm = "-" + this.b + "x";
		}
		if(this.c.compareTo(MyDouble.zero)>0){
			thirdTerm = "+" + this.c;
		}
		else if(this.c.compareTo(MyDouble.zero)<0){
			thirdTerm = "-" + this.c;
		}
		if(!this.a.isZero()){
			firstTerm = this.a.toString() + "x^2";
		}
		if(!this.b.isZero()){
			if(true){
				
			}
			secTerm = "";
		}
		else if(this.c.isZero()){
			thirdTerm = "";
		}
		
		return firstTerm+secTerm+thirdTerm;
	}
	public static MartianPolynomial parseMartianPolynomial(String polynomial){
		polynomial.replaceAll(" ", "");
		int xSquared = polynomial.indexOf("x^2");
		String firstTerm = polynomial.substring(xSquared);
		MyDouble val1 = MyDouble.parseDouble(firstTerm);
		int x = polynomial.indexOf("x");
		String secTerm = polynomial.substring(x);
		MyDouble val2 = MyDouble.parseDouble(secTerm);
		String thirdTerm = polynomial.substring(x+1);
		MyDouble val3 = MyDouble.parseDouble(thirdTerm);
		if((xSquared-1) == 0)
			val1 = MyDouble.parseDouble("");
		if((x-1) == 0)
			val2 = MyDouble.parseDouble("");
		if((x+1) == 0)
			val3 = MyDouble.parseDouble("");
		return new MartianPolynomial(val1,val2,val3);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//NOTE: THIS IS WRITTEN FOR YOU - DO NOT CHANGE
	public boolean equals (Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			MartianPolynomial casted = (MartianPolynomial)other;
			return (
					a.equals(casted.a) && 
					b.equals(casted.b) && 
					c.equals(casted.c)
			);
		}
	}
	
	
}