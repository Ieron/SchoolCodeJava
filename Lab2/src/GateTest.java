
public class GateTest {
	
	public static void main(String[] args) {
		
		HalfAdder ha1 = new HalfAdder();
		HalfAdder ha2 = new HalfAdder();
		HalfAdder ha3 = new HalfAdder();
		HalfAdder ha4 = new HalfAdder();
	
		ha1.setValues(false, false);
		ha2.setValues(true, false);
		ha3.setValues(false, true);
		ha4.setValues(true, true);
		
		ha1.execute();
		ha2.execute();
		ha3.execute();
		ha4.execute();
		
		System.out.println("Half Adder Tests");
		System.out.println("S     |     C");
		System.out.println(ha1.getS() + " | " + ha1.getC());
		System.out.println(ha2.getS() + " | " + ha2.getC());
		System.out.println(ha3.getS() + " | " + ha3.getC());
		System.out.println(ha4.getS() + " | " + ha4.getC());
		
		FullAdder fa1 = new FullAdder();
		FullAdder fa2 = new FullAdder();
		FullAdder fa3 = new FullAdder();
		FullAdder fa4 = new FullAdder();
		FullAdder fa5 = new FullAdder();
		FullAdder fa6 = new FullAdder();
		FullAdder fa7 = new FullAdder();
		FullAdder fa8 = new FullAdder();
		fa1.execute(false, false, false);
		fa2.execute(false, false, true);
		fa3.execute(false, true, false);
		fa4.execute(false, true, true);
		fa5.execute(true, false, false);
		fa6.execute(true, false, true);
		fa7.execute(true, true, false);
		fa8.execute(true, true, true);
		
		System.out.println("\nFull Adder Tests");
		System.out.println("S     |     T");
		System.out.println(fa1.getS() + " | " + fa1.getT());
		System.out.println(fa2.getS() + " | " + fa2.getT());
		System.out.println(fa3.getS() + " | " + fa3.getT());
		System.out.println(fa4.getS() + " | " + fa4.getT());
		System.out.println(fa5.getS() + " | " + fa5.getT());
		System.out.println(fa6.getS() + " | " + fa6.getT());
		System.out.println(fa7.getS() + " | " + fa7.getT());
		System.out.println(fa8.getS() + " | " + fa8.getT());
		
		System.out.println("\n4bitALU");
		
		//boolean a, b, c, d, e, f, g, h, k;
		FourBitALU alu = new FourBitALU();
		boolean [] out = alu.getOut();
		String aluOut = "";
		for (int i = 0; i < 1; i++){
			
			alu.setValues(false, false, true, true, false, true, true, true, true);
			alu.execute();
			out = alu.getOut();
			aluOut = "";
			//String aluBin = "";
			for(int j = 0; j < out.length; j++){
				
				aluOut += out[j] + " ";
			}
			System.out.println("\n" + i + " " + aluOut);
		}
		
		/*for(int i = 0; i < out.length; i++){
			if (out[i] == true)
				aluBin += 1 + " ";
			else
				aluBin += 0 + " ";
		}*/
		
		
		//System.out.println("\n" + aluBin);
		
	}
}
