
public class Rettangolo extends Forma{

	private Punto vertice;
	private int larghezza;
	private int altezza;
	public Rettangolo(Colore colore, Punto vertice, int altezza, int larghezza){
		super(colore);
		this.vertice = vertice;
		this.larghezza = larghezza;
		this.altezza = altezza;
	}
	public Punto getVertice(){
		return this.vertice;
	}
	public int getAltezza(){
		return this.altezza;
	}
	public int getLarghezza(){
		return this.larghezza;
	}
	
	@Override
	public double superficie(){
		return (this.altezza * this.larghezza);
	}
	
	@Override
	public String toString() {
		return this.getClass() + "con altezza --> "+this.getAltezza();
	}

}
