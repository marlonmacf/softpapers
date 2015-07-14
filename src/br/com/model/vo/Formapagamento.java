package br.com.model.vo;
// Generated 09/05/2015 14:52:35 by Hibernate Tools 4.3.1


import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Formapagamento generated by hbm2java
 */
@Entity
@Table(name="formapagamento"
    ,catalog="dbloja"
)
public class Formapagamento  implements java.io.Serializable {


     private Integer idFormaPagamento;
     private String nomeFormaPagamento;
     private Date dataCriacao;
     private Date dataAtualizacao;
     private Set<Pedidocliente> pedidoclientes = new HashSet<Pedidocliente>(0);

    public Formapagamento() {
    }

	
    public Formapagamento(String nomeFormaPagamento) {
        this.nomeFormaPagamento = nomeFormaPagamento;
    }
    public Formapagamento(String nomeFormaPagamento, Date dataCriacao, Date dataAtualizacao, Set<Pedidocliente> pedidoclientes) {
       this.nomeFormaPagamento = nomeFormaPagamento;
       this.dataCriacao = dataCriacao;
       this.dataAtualizacao = dataAtualizacao;
       this.pedidoclientes = pedidoclientes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idFormaPagamento", unique=true, nullable=false)
    public Integer getIdFormaPagamento() {
        return this.idFormaPagamento;
    }
    
    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
    }

    
    @Column(name="nomeFormaPagamento", nullable=false, length=30)
    public String getNomeFormaPagamento() {
        return this.nomeFormaPagamento;
    }
    
    public void setNomeFormaPagamento(String nomeFormaPagamento) {
        this.nomeFormaPagamento = nomeFormaPagamento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataCriacao", length=19)
    public Date getDataCriacao() {
        return this.dataCriacao;
    }
    
    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataAtualizacao", length=19)
    public Date getDataAtualizacao() {
        return this.dataAtualizacao;
    }
    
    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="formapagamento")
    public Set<Pedidocliente> getPedidoclientes() {
        return this.pedidoclientes;
    }
    
    public void setPedidoclientes(Set<Pedidocliente> pedidoclientes) {
        this.pedidoclientes = pedidoclientes;
    }




}


