package no.hvl.dat107;

import java.time.LocalDate;

import org.eclipse.persistence.internal.oxm.schema.model.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(schema = "forelesning3_one2many")
public class Vitnemal {
	
    @Id private int studnr;
    private LocalDate studiestart;
    private LocalDate studieslutt;

    @OneToMany(mappedBy = "vitnemal", fetch = FetchType.EAGER)
    private List<Karakter> karakterer;

    @Override
    public String toString() {
        return "Vitnemal [studnr=" + studnr + ", studiestart=" + studiestart + ", studieslutt=" + studieslutt + "]";
    }

    

}
