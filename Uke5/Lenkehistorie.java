class Lenkehistorie {

	private Node forste;
	static int index = 0;
	
	public void nyttKapittel(String kap) {
		Node ny = new Node(kap);
		Node midl = forste;
		
		if(midl == null) {
			forste = ny;
		} else {
			while(midl.neste != null) {
				midl = midl.neste;
			}
			midl.neste = ny;
		}
	}
	
	public void skrivHistorie() {
		Node midl = forste;
		if(forste == null) {
			System.out.println("=== Historien er tom ===");
		} else {
			while(midl != null) {
				System.out.println(midl.kapittel);
				midl = midl.neste;
			}
		}
	}
	
	public boolean fjern(int index) {
		Node midl = forste;
		boolean fjernet = false;
		if(midl != null) {
			if(index == 0) {
				forste = midl.neste;
				fjernet = true;
			}
			while(midl.neste != null) {
				if(midl.neste.minIndex == index) {
					midl.neste = midl.neste.neste;
					fjernet = true;
				}
				if(fjernet) {
					midl.neste.minIndex--;
				}
				midl = midl.neste;
			}
		}
		if(fjernet) {
			this.index--;
		}
		return fjernet;
	}
	
	private class Node {
		int minIndex;
		String kapittel;
		Node neste;
		
		public Node(String kapittel) {
			minIndex = index++;
			this.kapittel = kapittel;
		}
	}
}
