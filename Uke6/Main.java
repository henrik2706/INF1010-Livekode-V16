class Main {
	public static void main(String[] args) {
		
		Lenkehistorie frozen = new Lenkehistorie();
		frozen.nyttKapittel(new Kapittel(1, "Anna drar avgårde"));
		frozen.nyttKapittel(new Kapittel(2, "Hesten rømmer"));
		frozen.nyttKapittel(new Kapittel(3, "Kommer til hytta og møter Kristoffer"));
		frozen.nyttKapittel(new Kapittel(4, "Ulver jager dem"));
		
		for(Kapittel k : frozen) {
			System.out.println(k);
		}
		
	}
}
