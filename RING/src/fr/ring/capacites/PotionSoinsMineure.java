package fr.ring.capacites;

public class PotionSoinsMineure extends Remede {
	
	public static final int PUI_POTION_SOINS_MINEURE = 35,  FAC_POTION_SOINS_MINEURE = 65;
	public static final String NOM_POTION_SOINS_MINEURE = "PotionSoinsMineure";
	
	public PotionSoinsMineure() {
		this.nom = NOM_POTION_SOINS_MINEURE;
		this.PUI = PUI_POTION_SOINS_MINEURE;
		this.FAC = FAC_POTION_SOINS_MINEURE;
	}

	public PotionSoinsMineure(String nom, double pBA, double eFF, int PUI,
			int FAC) {
		super(nom, pBA, eFF, PUI, FAC);
	}

	public PotionSoinsMineure(PotionSoinsMineure p) {
		super(p);	
	}

}
