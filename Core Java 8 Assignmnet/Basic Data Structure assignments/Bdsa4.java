package CapgeminiAssignment;

class Result{
    public String declareResults( double num1, double num2,double num3) {
		int count = 0;
    	if(num1 > 60) {
        	count++;
        }
        if(num2 > 60) {
        	count++;
        }
        if(num3 > 60) {
        	count++;
        }

        if(count == 3 ) {
        	System.out.println("Result is Passed");
        } else if(count == 2) {
        	System.out.println("Result is Promoted");
        } else {
        	System.out.println("Result is Failed");
        }
		return null;
    }

}
public class Bdsa4 {
    public static void main(String[] args) {

    	Result a = new Result();
    	{
    		a.declareResults(70, 70, 50);
    		a.declareResults(10,10,10);
    		a.declareResults(70, 70, 90);
    	}
    }
}
