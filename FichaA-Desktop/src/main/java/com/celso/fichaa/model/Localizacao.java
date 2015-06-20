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
 * Localizacao generated by hbm2java
 */
@Entity
@Table(name="localizacao"
    ,catalog="ficha"
)
public class Localizacao  implements java.io.Serializable {


     private Integer id;
     private String localizacao;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public Localizacao() {
    }

    public Localizacao(String localizacao, Set<Domicilio> domicilios) {
       this.localizacao = localizacao;
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

    
    @Column(name="LOCALIZACAO", length=45)
    public String getLocalizacao() {
        return this.localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="localizacao")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}


