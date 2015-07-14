package br.com.model.vo;
// Generated 07/05/2015 21:01:14 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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

/**
 * Pedidocliente generated by hbm2java
 */
@Entity
@Table(name="pedidocliente"
    ,catalog="dbloja"
)
public class Pedidocliente  implements java.io.Serializable {


     private int idPedidoCliente;
     private Cliente cliente;
     private Itempedido itempedido;
     private Tipopagamento tipopagamento;
     private Vendedor vendedor;
     private BigDecimal valorTotal;
     private int statusPedido;
     private Set<Pedidoparceladocliente> pedidoparceladoclientes = new HashSet<Pedidoparceladocliente>(0);

    public Pedidocliente() {
    }

	
    public Pedidocliente(int idPedidoCliente, Itempedido itempedido, Tipopagamento tipopagamento, Vendedor vendedor, BigDecimal valorTotal, int statusPedido) {
        this.idPedidoCliente = idPedidoCliente;
        this.itempedido = itempedido;
        this.tipopagamento = tipopagamento;
        this.vendedor = vendedor;
        this.valorTotal = valorTotal;
        this.statusPedido = statusPedido;
    }
    public Pedidocliente(int idPedidoCliente, Cliente cliente, Itempedido itempedido, Tipopagamento tipopagamento, Vendedor vendedor, BigDecimal valorTotal, int statusPedido, Set<Pedidoparceladocliente> pedidoparceladoclientes) {
       this.idPedidoCliente = idPedidoCliente;
       this.cliente = cliente;
       this.itempedido = itempedido;
       this.tipopagamento = tipopagamento;
       this.vendedor = vendedor;
       this.valorTotal = valorTotal;
       this.statusPedido = statusPedido;
       this.pedidoparceladoclientes = pedidoparceladoclientes;
    }
   
     @Id 

    
    @Column(name="id_pedidoCliente", unique=true, nullable=false)
    public int getIdPedidoCliente() {
        return this.idPedidoCliente;
    }
    
    public void setIdPedidoCliente(int idPedidoCliente) {
        this.idPedidoCliente = idPedidoCliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_cliente")
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_item", nullable=false)
    public Itempedido getItempedido() {
        return this.itempedido;
    }
    
    public void setItempedido(Itempedido itempedido) {
        this.itempedido = itempedido;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_tipoPagamento", nullable=false)
    public Tipopagamento getTipopagamento() {
        return this.tipopagamento;
    }
    
    public void setTipopagamento(Tipopagamento tipopagamento) {
        this.tipopagamento = tipopagamento;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_vendedor", nullable=false)
    public Vendedor getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    
    @Column(name="valorTotal", nullable=false, precision=10)
    public BigDecimal getValorTotal() {
        return this.valorTotal;
    }
    
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    
    @Column(name="statusPedido", nullable=false)
    public int getStatusPedido() {
        return this.statusPedido;
    }
    
    public void setStatusPedido(int statusPedido) {
        this.statusPedido = statusPedido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="pedidocliente")
    public Set<Pedidoparceladocliente> getPedidoparceladoclientes() {
        return this.pedidoparceladoclientes;
    }
    
    public void setPedidoparceladoclientes(Set<Pedidoparceladocliente> pedidoparceladoclientes) {
        this.pedidoparceladoclientes = pedidoparceladoclientes;
    }




}


