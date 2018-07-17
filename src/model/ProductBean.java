package model;

import java.sql.Timestamp;
import java.util.Date;


public class ProductBean {
	private String destinazione, partenza, compagniaAerea;
	private Float prezzo;
	private Timestamp dataArrivo, dataPartenza;
	private Integer id, posti;
	
	//we will use this one when retrieving a new flight
	public ProductBean (Integer id, String partenza, String destinazione, String compagnia, Float prezzo, Timestamp dataPartenza, Timestamp dataArrivo, Integer posti) {
		this.destinazione = destinazione;
		this.partenza = partenza;
		this.id = id;
		this.compagniaAerea = compagnia;
		this.prezzo = prezzo;
		this.dataPartenza = dataPartenza;
		this.dataArrivo = dataArrivo;
		this.posti = posti;
	}
	
	//we will use this one when adding a new flight
	//without the field 'id' because it's automatically generated by sql
	/*public ProductBean (String destinazione, String partenza, String compagnia, Float prezzo, Date dataPartenza, Date dataArrivo) {
		this.destinazione = destinazione;
		this.partenza = partenza;
		this.compagniaAerea = compagnia;
		this.prezzo = prezzo;
		this.dataPartenza = dataPartenza;
		this.dataArrivo = dataArrivo;
	}*/

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompagniaAerea() {
		return compagniaAerea;
	}

	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	public String getPartenza() {
		return partenza;
	}

	public void setPartenza(String partenza) {
		this.partenza = partenza;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public Timestamp getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(Timestamp dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public Timestamp getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(Timestamp dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public Integer getPosti() {
		return posti;
	}

	public void setPosti(Integer posti) {
		this.posti = posti;
	}
}