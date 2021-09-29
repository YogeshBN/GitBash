package myproject;

public class TypeConversion {

	public static void main(String[] args) {
		int z=50;
		long a=z;
		float b=a;
		System.out.println(z + " "+a + " "+b);	
		
		int i1=34349958;
		byte b1=(byte)i1;
		System.out.println(i1 + " "+b1);
				
		byte b2=55;
		float f1=2.2f;
		float f2=b2*f1;
		System.out.println(b2 + " "+f1+ " "+f2);
		
		System.out.println(534535.453453);
		System.out.println((float)534535.453453);
		
		char a3=66;
		char b3=98;
		System.out.println("Char: "+a3+ " "+b3);

		a3++;
		b3++;
		System.out.println("Char(++): "+a3+ " "+b3);

		a3--;
		b3--;
		System.out.println("Char(--): "+a3+ " "+b3);
		
		int n=90;
		char b11=(char)n;
		System.out.println("Char: "+b11);

	}

}
