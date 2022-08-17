import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Disegno {
//	private Map<Integer, List<Rettangolo>> livello2rettangoli;
//	private Map<Integer, List<Cerchio>> livello2cerchi;
	private Map<Integer, List<Forma>> livello2Forme;
	public Disegno() {
//		this.livello2rettangoli = new TreeMap<Integer, List<Rettangolo>>();
//		this.livello2cerchi = new TreeMap<Integer, List<Cerchio>>();
		this.livello2Forme = new TreeMap<Integer, List<Forma>>();
	}
//	public void aggiungiRettangolo(Rettangolo rettangolo, int livello){
		//DOMANDA 1: scrivere il codice di questo metodo
//		if(livello2rettangoli.containsKey(livello)) {
//			livello2rettangoli.get(livello).add(rettangolo);
//		}
//		else {
//			List<Rettangolo> temp= new LinkedList<Rettangolo>();
//			temp.add(rettangolo);
//			livello2rettangoli.put(livello, temp);
//		}
		//DOMANDA 2: eliminare questo metodo e sostituirlo con il metodo
		// public void aggiungiForma(Forma forma, int livello)
//	}
//	public void aggiungiCerchio(Cerchio cerchio, int livello){
//		// codice omesso
//		//DOMANDA 2: eliminare questo metodo e sostituirlo con il metodo
//		// public void aggiungiForma(Forma forma, int livello)
//	}

	public void aggiungiForma(Forma forma, int livello) {
		if(livello2Forme.containsKey(livello)) {
			livello2Forme.get(livello).add(forma);
		}
		else {
			List<Forma> temp = new LinkedList<Forma>();
			temp.add(forma);
			livello2Forme.put(livello, temp);
		}
	}
	public Set<Colore> coloriPresentiNelDisegno() {
		Set<Colore> coloriNelDisegno = new HashSet<Colore>();
		for(Integer indice: livello2Forme.keySet()) {
			for(Forma forma: livello2Forme.get(indice)) {
				coloriNelDisegno.add(forma.getColore());
			}
		}
		//DOMANDA 3: scrivere il codice di questo metodo
		// (è possibile modificare Colore; non e’ possibile introdurre nuove classi)
		return coloriNelDisegno;
	}
	public Map<Colore, List<Forma>> colore2forme() {
		Map<Colore, List<Forma>> colore2forme = new HashMap<Colore, List<Forma>>();
		for(Integer intero : livello2Forme.keySet()) {
			for(Forma forma : livello2Forme.get(intero)) {
				if(colore2forme.containsKey(forma.getColore())) {
					colore2forme.get(forma.getColore()).add(forma);
				}
				else {
					List<Forma> spantina = new LinkedList<Forma>();
					spantina.add(forma);
					colore2forme.put(forma.getColore(), spantina);
				}
				Collections.sort(colore2forme.get(forma.getColore()));
			}
		}
		//DOMANDA 4: scrivere il codice di questo metodo
		// (non è possibile introdurre altre classi; è possibile modificare Forma)
		return colore2forme;
	}
	public List<Forma> formeOrdinatePerLuminosita() {
		List<Forma> forme = new LinkedList<Forma>();
		for(Integer interi: livello2Forme.keySet()) {
			for(Forma forma: livello2Forme.get(interi)) {
				forme.add(forma);
			}
		}
		Collections.sort(forme, new ComparatoreLuminosita());
		//DOMANDA 5: scrivere il codice di questo metodo
		// (non è possibile modificare Forma e Colore, è possibile introdurre nuove classi)
		return forme;
	}
}
