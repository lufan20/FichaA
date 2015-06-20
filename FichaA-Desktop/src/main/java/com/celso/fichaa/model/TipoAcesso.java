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
 * TipoAcesso generated by hbm2java
 */
@Entity
@Table(name="tipo_acesso"
    ,catalog="ficha"
)
public class TipoAcesso  implements java.io.Serializable {


     private Integer id;
     private String tipoAcesso;
     private Set<Domicilio> domicilios = new HashSet<Domicilio>(0);

    public TipoAcesso() {
    }

    public TipoAcesso(String tipoAcesso, Set<Domicilio> domicilios) {
       this.tipoAcesso = tipoAcesso;
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

    
    @Column(name="TIPO_ACESSO", length=45)
    public String getTipoAcesso() {
        return this.tipoAcesso;
    }
    
    public void setTipoAcesso(String tipoAcesso) {
        this.tipoAcesso = tipoAcesso;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoAcesso")
    public Set<Domicilio> getDomicilios() {
        return this.domicilios;
    }
    
    public void setDomicilios(Set<Domicilio> domicilios) {
        this.domicilios = domicilios;
    }




}


