package entidades;
// Generated 10-21-2016 10:03:23 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Empleado generated by hbm2java
 */
@Entity
@Table(name="EMPLEADO"
    ,schema="SYSTEM"
)
public class Empleado  implements java.io.Serializable {


     private BigDecimal codigoEmpleado;
     private Persona persona;
     private Clinica clinica;
     private BigDecimal fechaContratacion;
     private Date puesto;
     private Set<Medico> medicos = new HashSet<Medico>(0);

    public Empleado() {
    }

	
    public Empleado(BigDecimal codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
    public Empleado(BigDecimal codigoEmpleado, Persona persona, Clinica clinica, BigDecimal fechaContratacion, Date puesto, Set<Medico> medicos) {
       this.codigoEmpleado = codigoEmpleado;
       this.persona = persona;
       this.clinica = clinica;
       this.fechaContratacion = fechaContratacion;
       this.puesto = puesto;
       this.medicos = medicos;
    }
   
     @Id 

    
    @Column(name="CODIGO_EMPLEADO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodigoEmpleado() {
        return this.codigoEmpleado;
    }
    
    public void setCodigoEmpleado(BigDecimal codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COD_PERSONA")
    public Persona getPersona() {
        return this.persona;
    }
    
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COD_CLINICA")
    public Clinica getClinica() {
        return this.clinica;
    }
    
    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    
    @Column(name="FECHA_CONTRATACION", precision=22, scale=0)
    public BigDecimal getFechaContratacion() {
        return this.fechaContratacion;
    }
    
    public void setFechaContratacion(BigDecimal fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="PUESTO", length=7)
    public Date getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Date puesto) {
        this.puesto = puesto;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="empleado")
    public Set<Medico> getMedicos() {
        return this.medicos;
    }
    
    public void setMedicos(Set<Medico> medicos) {
        this.medicos = medicos;
    }




}


