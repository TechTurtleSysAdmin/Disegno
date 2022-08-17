
public class Colore {
	private int red;
	private int green;
	private int blue;
	
	public Colore(int red, int green, int blue) {
		this.red = red;
		this.blue = blue;
		this.green = green;
	}
	public int getRed() {
		return this.red;
	}
	public int getGreen() {
		return this.green;
	}
	public int getBlue() {
		return this.blue;
	}
	public int luminosita() {
		return (this.red + this.green + this.blue) ;
	}
	
	public int hashCode() {
		return getRed()+getBlue()+getGreen();
	}
	
	public boolean equals(Object that) {
		if(that.getClass() != this.getClass() || that.getClass() == null) {
			return false;
		}
		Colore colore = (Colore)that;
		return this.getRed() == colore.getRed() && this.getGreen() == colore.getGreen() && this.getBlue() == colore.getBlue();
	}
}
