package javaConcepts;

import javax.swing.plaf.multi.MultiButtonUI;

public class ControlStatementIfElse {
	int a = 43;
	
	int Mul(int i, int j) {
		return i*j;
	}

	public static void main(String[] args) {
		
		ControlStatementIfElse obj =  new ControlStatementIfElse();
		int result = obj.Mul(6, 3);
		if(result>14) {
			System.out.println("output: "+result +" is greatan than 12 , condition satisfied");
		}else {
			System.out.println("condition is not satisfied");
		}
		
	}

}
