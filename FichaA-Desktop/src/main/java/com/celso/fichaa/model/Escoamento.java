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
 * Escoamento generated by hbm2java
 */
@Entity
@Table(name="escoamento"
    ,catalog="ficha"
)
public class Escoamento  implements java.io.Serializable {


     private Integer id;
     private String tipo;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public Escoamento() {
    }

    public Escoamento(String tipo, Set<Domicilio> domicilios) {
       this.tipo = tipo;
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

    
    @Column(name="TIPO", length=195)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="escoamento")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}


