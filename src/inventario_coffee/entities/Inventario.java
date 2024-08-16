/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario_coffee.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author arian
 */
@Entity
@Table(name = "inventario")
@NamedQueries({
    @NamedQuery(name = "Inventario.findAll", query = "SELECT i FROM Inventario i"),
    @NamedQuery(name = "Inventario.findById", query = "SELECT i FROM Inventario i WHERE i.id = :id"),
    @NamedQuery(name = "Inventario.findByTipoEquipamento", query = "SELECT i FROM Inventario i WHERE i.tipoEquipamento = :tipoEquipamento"),
    @NamedQuery(name = "Inventario.findByNotaFiscal", query = "SELECT i FROM Inventario i WHERE i.notaFiscal = :notaFiscal"),
    @NamedQuery(name = "Inventario.findByDataCompra", query = "SELECT i FROM Inventario i WHERE i.dataCompra = :dataCompra"),
    @NamedQuery(name = "Inventario.findByMarcaModelo", query = "SELECT i FROM Inventario i WHERE i.marcaModelo = :marcaModelo"),
    @NamedQuery(name = "Inventario.findByConfiguracao", query = "SELECT i FROM Inventario i WHERE i.configuracao = :configuracao"),
    @NamedQuery(name = "Inventario.findByPatrimonio", query = "SELECT i FROM Inventario i WHERE i.patrimonio = :patrimonio"),
    @NamedQuery(name = "Inventario.findByObservacao", query = "SELECT i FROM Inventario i WHERE i.observacao = :observacao")})
public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "tipo_equipamento")
    private String tipoEquipamento;
    @Basic(optional = false)
    @Column(name = "nota_fiscal")
    private String notaFiscal;
    @Basic(optional = false)
    @Column(name = "data_compra")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCompra;
    @Basic(optional = false)
    @Column(name = "marca_modelo")
    private String marcaModelo;
    @Basic(optional = false)
    @Column(name = "configuracao")
    private String configuracao;
    @Basic(optional = false)
    @Column(name = "patrimonio")
    private String patrimonio;
    @Basic(optional = false)
    @Column(name = "observacao")
    private String observacao;

    public Inventario() {
    }

    public Inventario(String tipoEquipamento, String notaFiscal, Date dataCompra, String marcaModelo, String configuracao, String patrimonio, String observacao) {
        this.tipoEquipamento = tipoEquipamento;
        this.notaFiscal = notaFiscal;
        this.dataCompra = dataCompra;
        this.marcaModelo = marcaModelo;
        this.configuracao = configuracao;
        this.patrimonio = patrimonio;
        this.observacao = observacao;
    }

    public Inventario(Integer id) {
        this.id = id;
    }

    public Inventario(Integer id, String tipoEquipamento, String notaFiscal, Date dataCompra, String marcaModelo, String configuracao, String patrimonio, String observacao) {
        this.id = id;
        this.tipoEquipamento = tipoEquipamento;
        this.notaFiscal = notaFiscal;
        this.dataCompra = dataCompra;
        this.marcaModelo = marcaModelo;
        this.configuracao = configuracao;
        this.patrimonio = patrimonio;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public String getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(String configuracao) {
        this.configuracao = configuracao;
    }

    public String getPatrimonio() {
        return patrimonio;
    }

    public void setPatrimonio(String patrimonio) {
        this.patrimonio = patrimonio;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inventario)) {
            return false;
        }
        Inventario other = (Inventario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario_coffee.entities.Inventario[ id=" + id + " ]";
    }
    
}
