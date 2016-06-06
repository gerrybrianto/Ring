package fr.ring.capacites;

import fr.ring.personnage.Personnage;

public abstract class Capacite{
	
	public static final double PBA_MIN = 0, PBA_MAX = 1;
	
	protected String nom;
	protected double PBA;
	protected double EFF;
	
	public Capacite(){
		nom = "Unnamed";
		PBA = 0;
		EFF = 0;
	}
	public Capacite(String nom, double pBA, double eFF) {
		this.nom = nom;
		PBA = pBA;
		EFF = eFF;
	}
	
	public Capacite(Capacite c){
		this.nom = c.getNom();
		this.PBA = c.PBA;
		this.EFF = c.EFF;
	}
	
	public abstract boolean attaquer(Personnage attaquant);
	public abstract double efficaciteAttaque(Personnage attaquant);
	public abstract boolean seDefendre(Personnage defenseur);
	public abstract double efficaciteDefense(Personnage defenseur);
	public abstract boolean seSoigner(Personnage soigneur);
	public abstract double efficaciteSoin(Personnage soigneur);
	
	public boolean containInterfaces(String name){
		for(int i=0; i < this.getClass().getSuperclass().getInterfaces().length; i++){
			if(this.getClass().getSuperclass().getInterfaces()[i].getName().contains(name))
				return true;
		}
		return false;
	}
	
	public static Capacite getCapA(String name){
		if(name.equals(Epee.NOM_EPEE))
			return new Epee();
		else if(name.equals(Arc.NOM_ARC))
			return new Arc();
		else if(name.equals(Ecu.NOM_ECU))
			return new Ecu();
		else if(name.equals(BouleDeFeu.NOM_BOULE_DE_FEU))
			return new BouleDeFeu();
		else if(name.equals(PotionSoinsMineure.NOM_POTION_SOINS_MINEURE))
			return new PotionSoinsMineure();
		else if(name.equals(Protect.NOM_PROTECT))
			return new Protect();
		else if(name.equals(ToucheGuerrisseur.NOM_TOUCHE_GUERRISSEUR))
			return new ToucheGuerrisseur();
		return null;
	}
	
	public double getPBA() {
		return PBA;
	}
	public void setPBA(double pBA) {
		PBA = pBA;
	}
	public double getEFF() {
		return EFF;
	}
	public void setEFF(double eFF) {
		EFF = eFF;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(EFF);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(PBA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Capacite other = (Capacite) obj;
		if (Double.doubleToLongBits(EFF) != Double.doubleToLongBits(other.EFF))
			return false;
		if (Double.doubleToLongBits(PBA) != Double.doubleToLongBits(other.PBA))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Capacite [nom=" + nom + ", PBA=" + PBA + ", EFF=" + EFF + "]";
	}	
}
