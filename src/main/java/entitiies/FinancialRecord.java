/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitiies;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gduresso
 */
@Entity
@XmlRootElement
public class FinancialRecord implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     
    @Column(name = "transactionId")
    private Integer transactionId;
    @Column(name = "ccNumbeer")
    private String ccNumbeer;
    @Column(name = "vendorId")
    private Integer vendorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalAmount")
    private Float totalAmount;
    @Column(name = "Profit")
    private Float profit;
    @Column(name = "profitToMycompany")
    private Float profitToMycompany;
    @Column(name = "amountToVendor")
    private Float amountToVendor;
    @Column(name = "dateOfTransaction")
    @Temporal(TemporalType.DATE)
    private Date dateOfTransaction;
    
    public Long getId() {
        return id; 
    }

    public FinancialRecord(Integer transactionId, String ccNumbeer, Integer vendorId, Float totalAmount, Float profit, Float profitToMycompany, Float amountToVendor, Date dateOfTransaction) {
        this.transactionId = transactionId;
        this.ccNumbeer = ccNumbeer;
        this.vendorId = vendorId;
        this.totalAmount = totalAmount;
        this.profit = profit;
        this.profitToMycompany = profitToMycompany;
        this.amountToVendor = amountToVendor;
        this.dateOfTransaction = dateOfTransaction;
    }

    public FinancialRecord() {
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getCcNumbeer() {
        return ccNumbeer;
    }

    public void setCcNumbeer(String ccNumbeer) {
        this.ccNumbeer = ccNumbeer;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public Float getProfitToMycompany() {
        return profitToMycompany;
    }

    public void setProfitToMycompany(Float profitToMycompany) {
        this.profitToMycompany = profitToMycompany;
    }

    public Float getAmountToVendor() {
        return amountToVendor;
    }

    public void setAmountToVendor(Float amountToVendor) {
        this.amountToVendor = amountToVendor;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof FinancialRecord)) {
            return false;
        }
        FinancialRecord other = (FinancialRecord) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entitiies.FinancialRecord[ id=" + id + " ]";
    }
    
}
