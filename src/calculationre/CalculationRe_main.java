package calculationre;
import java.util.Scanner;

public class CalculationRe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
			System.out.print("input number m>");
			int m=Integer.parseInt(scan.next());
			System.out.print("input NUmber n>");
			int n=Integer.parseInt(scan.next());
			CalculationRe_lib clib=new CalculationRe_lib(m,n);
			System.out.println("m+n="+clib.getPlus());
			System.out.println("m-n="+clib.getMinus());
			System.out.println("m*n="+clib.getProduct());
			System.out.println("m/n="+clib.getDivide());
			System.out.println("m%n="+clib.getMod());
	}
}
