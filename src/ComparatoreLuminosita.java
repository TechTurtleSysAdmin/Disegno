import java.util.Comparator;

public class ComparatoreLuminosita implements Comparator<Forma>{
	public int compare(Forma formaUno, Forma formaDue) {
		return formaUno.getColore().luminosita()- formaDue.getColore().luminosita();
	}
}
