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
 * Tipopagamento generated by hbm2java
 */
@Entity
@Table(name="tipopagamento"
    ,catalog="dbloja"
)
public class Tipopagamento  implements java.io.Serializable {


     private int idTipoPagamento;
     private String nomeTipoPagamento;
     private Set<Pedidocliente> pedidoclientes = new HashSet<Pedidocliente>(0);

    public Tipopagamento() {
    }

	
    public Tipopagamento(int idTipoPagamento, String nomeTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
        this.nomeTipoPagamento = nomeTipoPagamento;
    }
    public Tipopagamento(int idTipoPagamento, String nomeTipoPagamento, Set<Pedidocliente> pedidoclientes) {
       this.idTipoPagamento = idTipoPagamento;
       this.nomeTipoPagamento = nomeTipoPagamento;
       this.pedidoclientes = pedidoclientes;
    }
   
     @Id 

    
    @Column(name="id_tipoPagamento", unique=true, nullable=false)
    public int getIdTipoPagamento() {
        return this.idTipoPagamento;
    }
    
    public void setIdTipoPagamento(int idTipoPagamento) {
        this.idTipoPagamento = idTipoPagamento;
    }

    
    @Column(name="nomeTipoPagamento", nullable=false, length=20)
    public String getNomeTipoPagamento() {
        return this.nomeTipoPagamento;
    }
    
    public void setNomeTipoPagamento(String nomeTipoPagamento) {
        this.nomeTipoPagamento = nomeTipoPagamento;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipopagamento")
    public Set<Pedidocliente> getPedidoclientes() {
        return this.pedidoclientes;
    }
    
    public void setPedidoclientes(Set<Pedidocliente> pedidoclientes) {
        this.pedidoclientes = pedidoclientes;
    }




}


