package br.com.model.vo;
// Generated 07/05/2015 21:01:14 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Categoria generated by hbm2java
 */
@Entity
@Table(name="categoria"
    ,catalog="dbloja"
)
public class Categoria  implements java.io.Serializable {


     private int idCategoria;
     private String nomeCategoria;
     private Set<Produto> produtos = new HashSet<Produto>(0);

    public Categoria() {
    }

	
    public Categoria(int idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }
    public Categoria(int idCategoria, String nomeCategoria, Set<Produto> produtos) {
       this.idCategoria = idCategoria;
       this.nomeCategoria = nomeCategoria;
       this.produtos = produtos;
    }
   
     @Id 

    
    @Column(name="id_categoria", unique=true, nullable=false)
    public int getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    
    @Column(name="nomeCategoria", nullable=false, length=20)
    public String getNomeCategoria() {
        return this.nomeCategoria;
    }
    
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="categoria")
    public Set<Produto> getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }




}


