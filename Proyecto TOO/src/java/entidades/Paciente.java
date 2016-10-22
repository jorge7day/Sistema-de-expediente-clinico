package entidades;
// Generated 10-21-2016 10:03:23 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Paciente generated by hbm2java
 */
@Entity
@Table(name="PACIENTE"
    ,schema="SYSTEM"
)
public class Paciente  implements java.io.Serializable {


     private BigDecimal idAfiliado;
     private Persona persona;
     private Set<Signosvitales> signosvitaleses = new HashSet<Signosvitales>(0);
     private Set<Expediente> expedientes = new HashSet<Expediente>(0);

    public Paciente() {
    }

	
    public Paciente(BigDecimal idAfiliado, Persona persona) {
        this.idAfiliado = idAfiliado;
        this.persona = persona;
    }
    public Paciente(BigDecimal idAfiliado, Persona persona, Set<Signosvitales> signosvitaleses, Set<Expediente> expedientes) {
       this.idAfiliado = idAfiliado;
       this.persona = persona;
       this.signosvitaleses = signosvitaleses;
       this.expedientes = expedientes;
    }
   
     @Id 

    
    @Column(name="ID_AFILIADO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdAfiliado() {
        return this.idAfiliado;
    }
    
    public void setIdAfiliado(BigDecimal idAfiliado) {
        this.idAfiliado = idAfiliado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COD_PERSONA", nullable=false)
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="paciente")
    public Set<Signosvitales> getSignosvitaleses() {
        return this.signosvitaleses;
    }
    
    public void setSignosvitaleses(Set<Signosvitales> signosvitaleses) {
        this.signosvitaleses = signosvitaleses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="paciente")
    public Set<Expediente> getExpedientes() {
        return this.expedientes;
    }
    
    public void setExpedientes(Set<Expediente> expedientes) {
        this.expedientes = expedientes;
    }




}


