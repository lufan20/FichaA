package com.celso.fichaa.model;
// Generated 25/05/2015 08:57:14 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Paredes generated by hbm2java
 */
@Entity
@Table(name="paredes"
    ,catalog="ficha"
)
public class Paredes  implements java.io.Serializable {


     private int id;
     private String material;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public Paredes() {
    }

	
    public Paredes(int id) {
        this.id = id;
    }
    public Paredes(int id, String material, Set<Domicilio> domicilios) {
       this.id = id;
       this.material = material;
       this.domicilios = domicilios;
    }
   
     @Id 

    
    @Column(name="ID", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    
    @Column(name="MATERIAL", length=100)
    public String getMaterial() {
        return this.material;
    }
    
    public void setMaterial(String material) {
        this.material = material;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="paredes")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}


