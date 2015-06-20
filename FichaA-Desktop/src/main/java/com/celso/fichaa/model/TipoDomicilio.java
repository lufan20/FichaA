package com.celso.fichaa.model;
// Generated 25/05/2015 08:57:14 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoDomicilio generated by hbm2java
 */
@Entity
@Table(name="tipo_domicilio"
    ,catalog="ficha"
)
public class TipoDomicilio  implements java.io.Serializable {


     private Integer id;
     private String tipoDomicilio;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public TipoDomicilio() {
    }

    public TipoDomicilio(String tipoDomicilio, Set<Domicilio> domicilios) {
       this.tipoDomicilio = tipoDomicilio;
       this.domicilios = domicilios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="ID", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="TIPO_DOMICILIO", length=45)
    public String getTipoDomicilio() {
        return this.tipoDomicilio;
    }
    
    public void setTipoDomicilio(String tipoDomicilio) {
        this.tipoDomicilio = tipoDomicilio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoDomicilio")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}

