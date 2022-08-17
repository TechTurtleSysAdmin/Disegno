
public class Cerchio extends Forma{
	private Punto centro;
	private int raggio;
	
	public Cerchio(Colore colore, Punto centro, int raggio){
		super(colore);
		this.centro = centro;
		this.raggio = raggio;
	}
	public Punto getCentro(){
		return this.centro;
	}
	public int getRaggio(){
		return this.raggio;
	}
	
	@Override
	public double superficie(){
		return Math.PI * this.raggio * this.raggio;
	}
	
	@Override
	public String toString() {
		return this.getClass() + "con raggio --> "+this.getRaggio();
	}
}
