package no.hvl.dat107;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(schema = "forelesning3_one2many")
public class Karakter {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int karNr; 	
	//autogenerert ... ?
	private String emnekode;
	private LocalDate eksdato;
	private String bokstav;
	
	@ManyToOne
	@JoinColumn(name = "studnr")
	private Vitnemal vitnemal; //en-til-mange til vitnemal, mellomrom i databasen

	public Karakter(){}

	public Karakter(String emnekode2, LocalDate eksdato2, String bokstav2) {
		this.emnekode = emnekode2;
		this.eksdato = eksdato2;
		this.bokstav = bokstav2;
	}



    @Override
	public String toString() {
		return "Karakter [karNr=" + karNr + ", emnekode=" + emnekode + ", eksdato=" + eksdato + ", bokstav=" + bokstav
				+  "]";
	}



	public void settVitnemal(Vitnemal vm) {
		vitnemal = vm;

	}

	public static void remove(Karakter gml) {
		Karakter.remove(gml);
	}
	
	

}
