package fr.ring.capacites;

public class Protect extends SortDefense {
	
	public static final int PUI_PROTECT = 60, FAC_PROTECT = 40;
	
	public Protect() {
		this.nom = "Protect";
		this.PUI = PUI_PROTECT;
		this.FAC = FAC_PROTECT;
	}

	public Protect(String nom, double pBA, double eFF, int PUI, int FAC) {
		super(nom, pBA, eFF, PUI, FAC);
	}

	public Protect(Protect p) {
		super(p);
	}

}
