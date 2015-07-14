package br.com.models.vo;
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
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,catalog="dbloja"
)
public class Cliente  implements java.io.Serializable {


     private Long idCliente;
     private String nomeCliente;
     private String cpfCliente;
     private String rgCliente;
     private String telefone;
     private Date dataNascimento;
     private String enderecoCliente;
     private String emailCliente;
     private String sexoCliente;
     private Date dataCriacao;
     private Date dataAtualizacao;
     private Set<Pedidocliente> pedidoclientes = new HashSet<Pedidocliente>(0);

    public Cliente() {
    }

	
    public Cliente(String nomeCliente, String cpfCliente, String telefone) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.telefone = telefone;
    }
    public Cliente(String nomeCliente, String cpfCliente, String rgCliente, String telefone, Date dataNascimento, String enderecoCliente, String emailCliente, String sexoCliente, Date dataCriacao, Date dataAtualizacao, Set<Pedidocliente> pedidoclientes) {
       this.nomeCliente = nomeCliente;
       this.cpfCliente = cpfCliente;
       this.rgCliente = rgCliente;
       this.telefone = telefone;
       this.dataNascimento = dataNascimento;
       this.enderecoCliente = enderecoCliente;
       this.emailCliente = emailCliente;
       this.sexoCliente = sexoCliente;
       this.dataCriacao = dataCriacao;
       this.dataAtualizacao = dataAtualizacao;
       this.pedidoclientes = pedidoclientes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idCliente", unique=true, nullable=false)
    public Long getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    
    @Column(name="nomeCliente", nullable=false, length=30)
    public String getNomeCliente() {
        return this.nomeCliente;
    }
    
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    
    @Column(name="cpfCliente", nullable=false, length=15)
    public String getCpfCliente() {
        return this.cpfCliente;
    }
    
    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    
    @Column(name="rgCliente", length=15)
    public String getRgCliente() {
        return this.rgCliente;
    }
    
    public void setRgCliente(String rgCliente) {
        this.rgCliente = rgCliente;
    }

    
    @Column(name="telefone", nullable=false, length=15)
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dataNascimento", length=19)
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
    @Column(name="enderecoCliente", length=50)
    public String getEnderecoCliente() {
        return this.enderecoCliente;
    }
    
    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    
    @Column(name="emailCliente", length=30)
    public String getEmailCliente() {
        return this.emailCliente;
    }
    
    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    
    @Column(name="sexoCLiente", length=1)
    public String getSexoCliente() {
        return this.sexoCliente;
    }
    
    public void setSexoCliente(String sexoCliente) {
        this.sexoCliente = sexoCliente;
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

@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    public Set<Pedidocliente> getPedidoclientes() {
        return this.pedidoclientes;
    }
    
    public void setPedidoclientes(Set<Pedidocliente> pedidoclientes) {
        this.pedidoclientes = pedidoclientes;
    }




}

