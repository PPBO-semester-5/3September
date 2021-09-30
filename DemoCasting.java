public class DemoCasting{

	/**Main Method*/
	public static void main(String [] args){

		//Narrowing
		double nilaiDouble = 3000.56d;
		long m = (long)nilaiDouble;
		int j = (int)m;
		byte x = (byte)j;

		//Widening
		byte nilaiByte = -72;
		int i = (int)nilaiByte;
		long p = (long)i;
		double z = (double)p;

		System.out.println("\nPROGRAM CASTING TIPE DATA");
		System.out.println("-------------------------\n");

		System.out.println("NARROWING");
		System.out.println("Nilai asli double" + "\t" + nilaiDouble);
		System.out.println("Proses Narrowing long" + "\t" + m);
		System.out.println("Proses Narrowing int" + "\t" + j);
		System.out.println("Proses Narrowing byte" + "\t" + x);

		System.out.println("\nWIDENING");
		System.out.println("Nilai asli byte" + "\t" + nilaiByte);
		System.out.println("Proses Widening long" + "\t" + i);
		System.out.println("Proses Widening int" + "\t" + p);
		System.out.println("Proses Widening double" + "\t" + z);

	}
}