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
 * SituacaoMoradia generated by hbm2java
 */
@Entity
@Table(name="situacao_moradia"
    ,catalog="ficha"
)
public class SituacaoMoradia  implements java.io.Serializable {


     private Integer id;
     private String situacaoMoradia;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public SituacaoMoradia() {
    }

    public SituacaoMoradia(String situacaoMoradia, Set<Domicilio> domicilios) {
       this.situacaoMoradia = situacaoMoradia;
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

    
    @Column(name="SITUACAO_MORADIA", length=45)
    public String getSituacaoMoradia() {
        return this.situacaoMoradia;
    }
    
    public void setSituacaoMoradia(String situacaoMoradia) {
        this.situacaoMoradia = situacaoMoradia;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="situacaoMoradia")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}


