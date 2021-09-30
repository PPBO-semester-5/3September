class DemoOperasiBit {
	/**Main Method*/
	public static void main(String [] args){
		//byte adalah 8 bit signed, int adalah 32 bit signed
		byte x = 65; //0000 0001
		int y = 5; //0000 1001
		int hasilNot, hasilAnd, hasilOr, hasilXor;

	System.out.println("\nDEMO OPERASI BITWISE INTEGER");
	System.out.println("----------------------------\n");

	//inisialisasi variabel hasil dengan 0 (0000 0000 0000 0000)
	hasilNot = 0;
	hasilAnd = 0;
	hasilOr = 0;
	hasilXor = 0;

	//operasi bitwise
	hasilNot = ~x;
	hasilAnd = x & y;
	hasilOr = x | y;
	hasilXor = x ^ y;

	System.out.println("Hasil Negasi : " + x + " = " + hasilNot);
	System.out.println("Hasil Konjungsi : " + x + " & " + y + " = " + hasilAnd);
	System.out.println("Hasil Disjungsi : " + x + " | " + y + " = " + hasilOr);
	System.out.println("Hasil XOR : " + x + " ^ " + y + " = " + hasilXor);
	}
}