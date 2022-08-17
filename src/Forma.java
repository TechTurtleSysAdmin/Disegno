
public abstract class Forma implements Comparable<Forma> {
	private Colore colore;
	
	public Forma(Colore colore) {
		this.colore = colore;
	}
	public Colore getColore(){
		return this.colore;
	}
	
	public abstract double superficie();
	
	public int compareTo(Forma forma) {
		return (int) (this.superficie() - forma.superficie());
	}
}
