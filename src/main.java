import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Disegno disegno = new Disegno();
		Punto origine = new Punto(0, 0);
		Colore rosso = new Colore(2, 0, 0);
		Colore verde = new Colore(0, 1, 0);
		Forma cerchio = new Cerchio(rosso, origine, 4);
		Forma rettangolo = new Rettangolo(verde, origine, 2,4);
		Forma cerchio_uno = new Cerchio(verde, origine, 2);
		Forma rettangolo_uno = new Rettangolo(rosso, origine, 4,2);
		disegno.aggiungiForma(cerchio, 0);
		disegno.aggiungiForma(rettangolo, 0);
		disegno.aggiungiForma(cerchio_uno, 1);
		disegno.aggiungiForma(rettangolo_uno, 1);
		Map<Colore, List<Forma>> mappa = new HashMap<Colore, List<Forma>>();
		mappa = disegno.colore2forme();
		for(Colore colore : mappa.keySet()) {
			System.out.println("Le forme associate al colore: "+ colore.luminosita());
			for(Forma forma : mappa.get(colore)) {
				System.out.println("forma: "+ forma);
			}
		}
	}

}
