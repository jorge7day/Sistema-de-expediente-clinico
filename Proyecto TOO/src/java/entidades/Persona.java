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
 * Persona generated by hbm2java
 */
@Entity
@Table(name="PERSONA"
    ,schema="SYSTEM"
)
public class Persona  implements java.io.Serializable {


     private BigDecimal codPersona;
     private Departamento departamento;
     private Municipio municipio;
     private String nombre;
     private String apellido;
     private Date fechaNacimiento;
     private String conyuge;
     private String direccion;
     private String dui;
     private String profesion;
     private String estadoCivil;
     private String padre;
     private String madre;
     private char genero;
     private Set<Empleado> empleados = new HashSet<Empleado>(0);
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<Paciente> pacientes = new HashSet<Paciente>(0);

    public Persona() {
    }

	
    public Persona(BigDecimal codPersona, Departamento departamento, Municipio municipio, String nombre, String apellido, Date fechaNacimiento, String direccion, String estadoCivil, char genero) {
        this.codPersona = codPersona;
        this.departamento = departamento;
        this.municipio = municipio;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
    }
    public Persona(BigDecimal codPersona, Departamento departamento, Municipio municipio, String nombre, String apellido, Date fechaNacimiento, String conyuge, String direccion, String dui, String profesion, String estadoCivil, String padre, String madre, char genero, Set<Empleado> empleados, Set<Usuario> usuarios, Set<Paciente> pacientes) {
       this.codPersona = codPersona;
       this.departamento = departamento;
       this.municipio = municipio;
       this.nombre = nombre;
       this.apellido = apellido;
       this.fechaNacimiento = fechaNacimiento;
       this.conyuge = conyuge;
       this.direccion = direccion;
       this.dui = dui;
       this.profesion = profesion;
       this.estadoCivil = estadoCivil;
       this.padre = padre;
       this.madre = madre;
       this.genero = genero;
       this.empleados = empleados;
       this.usuarios = usuarios;
       this.pacientes = pacientes;
    }
   
     @Id 

    
    @Column(name="COD_PERSONA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getCodPersona() {
        return this.codPersona;
    }
    
    public void setCodPersona(BigDecimal codPersona) {
        this.codPersona = codPersona;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COD_DEPARTAMENTO", nullable=false)
    public Departamento getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COD_MUNICIPIO", nullable=false)
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    
    @Column(name="NOMBRE", nullable=false, length=50)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="APELLIDO", nullable=false, length=50)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="FECHA_NACIMIENTO", nullable=false, length=7)
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    @Column(name="CONYUGE", length=100)
    public String getConyuge() {
        return this.conyuge;
    }
    
    public void setConyuge(String conyuge) {
        this.conyuge = conyuge;
    }

    
    @Column(name="DIRECCION", nullable=false, length=50)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="DUI", length=50)
    public String getDui() {
        return this.dui;
    }
    
    public void setDui(String dui) {
        this.dui = dui;
    }

    
    @Column(name="PROFESION", length=50)
    public String getProfesion() {
        return this.profesion;
    }
    
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    
    @Column(name="ESTADO_CIVIL", nullable=false, length=25)
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
    @Column(name="PADRE", length=100)
    public String getPadre() {
        return this.padre;
    }
    
    public void setPadre(String padre) {
        this.padre = padre;
    }

    
    @Column(name="MADRE", length=100)
    public String getMadre() {
        return this.madre;
    }
    
    public void setMadre(String madre) {
        this.madre = madre;
    }

    
    @Column(name="GENERO", nullable=false, length=1)
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setEmpleados(Set<Empleado> empleados) {
        this.empleados = empleados;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="persona")
    public Set<Paciente> getPacientes() {
        return this.pacientes;
    }
    
    public void setPacientes(Set<Paciente> pacientes) {
        this.pacientes = pacientes;
    }




}


