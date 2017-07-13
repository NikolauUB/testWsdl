/**
 * OrderHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class OrderHeader  implements java.io.Serializable {
    private java.lang.String CAGKey;

    private java.lang.String campaignId;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.CardDetails cardDetails;

    private java.lang.String centreNo;

    private java.lang.String createdBy;

    private java.lang.String customerGroup1;

    private java.lang.String customerGroup2;

    private java.lang.String customerGroup3;

    private java.lang.String customerGroup4;

    private java.lang.String customerGroup5;

    private java.lang.String customerNo;

    private java.lang.String distributionChannel;

    private java.lang.String division;

    private java.lang.String documentDate;

    private java.lang.String documentType;

    private java.lang.String exchangeRate;

    private java.lang.String language;

    private java.lang.String modifiedBy;

    private java.lang.String modifiedOn;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.LineItem[] orderLineItems;

    private java.lang.String orderNumber;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] orderPrice;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners;

    private java.lang.String paymentMethod;

    private java.lang.String priceDate;

    private java.lang.String purchaseDate;

    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[] remarks;

    private java.lang.String salesGroup;

    private java.lang.String salesOffice;

    private java.lang.String salesOrg;

    private java.lang.String transactionCurrency;

    public OrderHeader() {
    }

    public OrderHeader(
           java.lang.String CAGKey,
           java.lang.String campaignId,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.CardDetails cardDetails,
           java.lang.String centreNo,
           java.lang.String createdBy,
           java.lang.String customerGroup1,
           java.lang.String customerGroup2,
           java.lang.String customerGroup3,
           java.lang.String customerGroup4,
           java.lang.String customerGroup5,
           java.lang.String customerNo,
           java.lang.String distributionChannel,
           java.lang.String division,
           java.lang.String documentDate,
           java.lang.String documentType,
           java.lang.String exchangeRate,
           java.lang.String language,
           java.lang.String modifiedBy,
           java.lang.String modifiedOn,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.LineItem[] orderLineItems,
           java.lang.String orderNumber,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] orderPrice,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners,
           java.lang.String paymentMethod,
           java.lang.String priceDate,
           java.lang.String purchaseDate,
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[] remarks,
           java.lang.String salesGroup,
           java.lang.String salesOffice,
           java.lang.String salesOrg,
           java.lang.String transactionCurrency) {
           this.CAGKey = CAGKey;
           this.campaignId = campaignId;
           this.cardDetails = cardDetails;
           this.centreNo = centreNo;
           this.createdBy = createdBy;
           this.customerGroup1 = customerGroup1;
           this.customerGroup2 = customerGroup2;
           this.customerGroup3 = customerGroup3;
           this.customerGroup4 = customerGroup4;
           this.customerGroup5 = customerGroup5;
           this.customerNo = customerNo;
           this.distributionChannel = distributionChannel;
           this.division = division;
           this.documentDate = documentDate;
           this.documentType = documentType;
           this.exchangeRate = exchangeRate;
           this.language = language;
           this.modifiedBy = modifiedBy;
           this.modifiedOn = modifiedOn;
           this.orderLineItems = orderLineItems;
           this.orderNumber = orderNumber;
           this.orderPrice = orderPrice;
           this.partners = partners;
           this.paymentMethod = paymentMethod;
           this.priceDate = priceDate;
           this.purchaseDate = purchaseDate;
           this.remarks = remarks;
           this.salesGroup = salesGroup;
           this.salesOffice = salesOffice;
           this.salesOrg = salesOrg;
           this.transactionCurrency = transactionCurrency;
    }


    /**
     * Gets the CAGKey value for this OrderHeader.
     * 
     * @return CAGKey
     */
    public java.lang.String getCAGKey() {
        return CAGKey;
    }


    /**
     * Sets the CAGKey value for this OrderHeader.
     * 
     * @param CAGKey
     */
    public void setCAGKey(java.lang.String CAGKey) {
        this.CAGKey = CAGKey;
    }


    /**
     * Gets the campaignId value for this OrderHeader.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this OrderHeader.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the cardDetails value for this OrderHeader.
     * 
     * @return cardDetails
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.CardDetails getCardDetails() {
        return cardDetails;
    }


    /**
     * Sets the cardDetails value for this OrderHeader.
     * 
     * @param cardDetails
     */
    public void setCardDetails(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }


    /**
     * Gets the centreNo value for this OrderHeader.
     * 
     * @return centreNo
     */
    public java.lang.String getCentreNo() {
        return centreNo;
    }


    /**
     * Sets the centreNo value for this OrderHeader.
     * 
     * @param centreNo
     */
    public void setCentreNo(java.lang.String centreNo) {
        this.centreNo = centreNo;
    }


    /**
     * Gets the createdBy value for this OrderHeader.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this OrderHeader.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the customerGroup1 value for this OrderHeader.
     * 
     * @return customerGroup1
     */
    public java.lang.String getCustomerGroup1() {
        return customerGroup1;
    }


    /**
     * Sets the customerGroup1 value for this OrderHeader.
     * 
     * @param customerGroup1
     */
    public void setCustomerGroup1(java.lang.String customerGroup1) {
        this.customerGroup1 = customerGroup1;
    }


    /**
     * Gets the customerGroup2 value for this OrderHeader.
     * 
     * @return customerGroup2
     */
    public java.lang.String getCustomerGroup2() {
        return customerGroup2;
    }


    /**
     * Sets the customerGroup2 value for this OrderHeader.
     * 
     * @param customerGroup2
     */
    public void setCustomerGroup2(java.lang.String customerGroup2) {
        this.customerGroup2 = customerGroup2;
    }


    /**
     * Gets the customerGroup3 value for this OrderHeader.
     * 
     * @return customerGroup3
     */
    public java.lang.String getCustomerGroup3() {
        return customerGroup3;
    }


    /**
     * Sets the customerGroup3 value for this OrderHeader.
     * 
     * @param customerGroup3
     */
    public void setCustomerGroup3(java.lang.String customerGroup3) {
        this.customerGroup3 = customerGroup3;
    }


    /**
     * Gets the customerGroup4 value for this OrderHeader.
     * 
     * @return customerGroup4
     */
    public java.lang.String getCustomerGroup4() {
        return customerGroup4;
    }


    /**
     * Sets the customerGroup4 value for this OrderHeader.
     * 
     * @param customerGroup4
     */
    public void setCustomerGroup4(java.lang.String customerGroup4) {
        this.customerGroup4 = customerGroup4;
    }


    /**
     * Gets the customerGroup5 value for this OrderHeader.
     * 
     * @return customerGroup5
     */
    public java.lang.String getCustomerGroup5() {
        return customerGroup5;
    }


    /**
     * Sets the customerGroup5 value for this OrderHeader.
     * 
     * @param customerGroup5
     */
    public void setCustomerGroup5(java.lang.String customerGroup5) {
        this.customerGroup5 = customerGroup5;
    }


    /**
     * Gets the customerNo value for this OrderHeader.
     * 
     * @return customerNo
     */
    public java.lang.String getCustomerNo() {
        return customerNo;
    }


    /**
     * Sets the customerNo value for this OrderHeader.
     * 
     * @param customerNo
     */
    public void setCustomerNo(java.lang.String customerNo) {
        this.customerNo = customerNo;
    }


    /**
     * Gets the distributionChannel value for this OrderHeader.
     * 
     * @return distributionChannel
     */
    public java.lang.String getDistributionChannel() {
        return distributionChannel;
    }


    /**
     * Sets the distributionChannel value for this OrderHeader.
     * 
     * @param distributionChannel
     */
    public void setDistributionChannel(java.lang.String distributionChannel) {
        this.distributionChannel = distributionChannel;
    }


    /**
     * Gets the division value for this OrderHeader.
     * 
     * @return division
     */
    public java.lang.String getDivision() {
        return division;
    }


    /**
     * Sets the division value for this OrderHeader.
     * 
     * @param division
     */
    public void setDivision(java.lang.String division) {
        this.division = division;
    }


    /**
     * Gets the documentDate value for this OrderHeader.
     * 
     * @return documentDate
     */
    public java.lang.String getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this OrderHeader.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.lang.String documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the documentType value for this OrderHeader.
     * 
     * @return documentType
     */
    public java.lang.String getDocumentType() {
        return documentType;
    }


    /**
     * Sets the documentType value for this OrderHeader.
     * 
     * @param documentType
     */
    public void setDocumentType(java.lang.String documentType) {
        this.documentType = documentType;
    }


    /**
     * Gets the exchangeRate value for this OrderHeader.
     * 
     * @return exchangeRate
     */
    public java.lang.String getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this OrderHeader.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the language value for this OrderHeader.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this OrderHeader.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the modifiedBy value for this OrderHeader.
     * 
     * @return modifiedBy
     */
    public java.lang.String getModifiedBy() {
        return modifiedBy;
    }


    /**
     * Sets the modifiedBy value for this OrderHeader.
     * 
     * @param modifiedBy
     */
    public void setModifiedBy(java.lang.String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    /**
     * Gets the modifiedOn value for this OrderHeader.
     * 
     * @return modifiedOn
     */
    public java.lang.String getModifiedOn() {
        return modifiedOn;
    }


    /**
     * Sets the modifiedOn value for this OrderHeader.
     * 
     * @param modifiedOn
     */
    public void setModifiedOn(java.lang.String modifiedOn) {
        this.modifiedOn = modifiedOn;
    }


    /**
     * Gets the orderLineItems value for this OrderHeader.
     * 
     * @return orderLineItems
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.LineItem[] getOrderLineItems() {
        return orderLineItems;
    }


    /**
     * Sets the orderLineItems value for this OrderHeader.
     * 
     * @param orderLineItems
     */
    public void setOrderLineItems(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.LineItem[] orderLineItems) {
        this.orderLineItems = orderLineItems;
    }


    /**
     * Gets the orderNumber value for this OrderHeader.
     * 
     * @return orderNumber
     */
    public java.lang.String getOrderNumber() {
        return orderNumber;
    }


    /**
     * Sets the orderNumber value for this OrderHeader.
     * 
     * @param orderNumber
     */
    public void setOrderNumber(java.lang.String orderNumber) {
        this.orderNumber = orderNumber;
    }


    /**
     * Gets the orderPrice value for this OrderHeader.
     * 
     * @return orderPrice
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] getOrderPrice() {
        return orderPrice;
    }


    /**
     * Sets the orderPrice value for this OrderHeader.
     * 
     * @param orderPrice
     */
    public void setOrderPrice(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Price[] orderPrice) {
        this.orderPrice = orderPrice;
    }


    /**
     * Gets the partners value for this OrderHeader.
     * 
     * @return partners
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] getPartners() {
        return partners;
    }


    /**
     * Sets the partners value for this OrderHeader.
     * 
     * @param partners
     */
    public void setPartners(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Partner[] partners) {
        this.partners = partners;
    }


    /**
     * Gets the paymentMethod value for this OrderHeader.
     * 
     * @return paymentMethod
     */
    public java.lang.String getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this OrderHeader.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(java.lang.String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the priceDate value for this OrderHeader.
     * 
     * @return priceDate
     */
    public java.lang.String getPriceDate() {
        return priceDate;
    }


    /**
     * Sets the priceDate value for this OrderHeader.
     * 
     * @param priceDate
     */
    public void setPriceDate(java.lang.String priceDate) {
        this.priceDate = priceDate;
    }


    /**
     * Gets the purchaseDate value for this OrderHeader.
     * 
     * @return purchaseDate
     */
    public java.lang.String getPurchaseDate() {
        return purchaseDate;
    }


    /**
     * Sets the purchaseDate value for this OrderHeader.
     * 
     * @param purchaseDate
     */
    public void setPurchaseDate(java.lang.String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


    /**
     * Gets the remarks value for this OrderHeader.
     * 
     * @return remarks
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this OrderHeader.
     * 
     * @param remarks
     */
    public void setRemarks(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Remark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the salesGroup value for this OrderHeader.
     * 
     * @return salesGroup
     */
    public java.lang.String getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this OrderHeader.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(java.lang.String salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the salesOffice value for this OrderHeader.
     * 
     * @return salesOffice
     */
    public java.lang.String getSalesOffice() {
        return salesOffice;
    }


    /**
     * Sets the salesOffice value for this OrderHeader.
     * 
     * @param salesOffice
     */
    public void setSalesOffice(java.lang.String salesOffice) {
        this.salesOffice = salesOffice;
    }


    /**
     * Gets the salesOrg value for this OrderHeader.
     * 
     * @return salesOrg
     */
    public java.lang.String getSalesOrg() {
        return salesOrg;
    }


    /**
     * Sets the salesOrg value for this OrderHeader.
     * 
     * @param salesOrg
     */
    public void setSalesOrg(java.lang.String salesOrg) {
        this.salesOrg = salesOrg;
    }


    /**
     * Gets the transactionCurrency value for this OrderHeader.
     * 
     * @return transactionCurrency
     */
    public java.lang.String getTransactionCurrency() {
        return transactionCurrency;
    }


    /**
     * Sets the transactionCurrency value for this OrderHeader.
     * 
     * @param transactionCurrency
     */
    public void setTransactionCurrency(java.lang.String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderHeader)) return false;
        OrderHeader other = (OrderHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CAGKey==null && other.getCAGKey()==null) || 
             (this.CAGKey!=null &&
              this.CAGKey.equals(other.getCAGKey()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.cardDetails==null && other.getCardDetails()==null) || 
             (this.cardDetails!=null &&
              this.cardDetails.equals(other.getCardDetails()))) &&
            ((this.centreNo==null && other.getCentreNo()==null) || 
             (this.centreNo!=null &&
              this.centreNo.equals(other.getCentreNo()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.customerGroup1==null && other.getCustomerGroup1()==null) || 
             (this.customerGroup1!=null &&
              this.customerGroup1.equals(other.getCustomerGroup1()))) &&
            ((this.customerGroup2==null && other.getCustomerGroup2()==null) || 
             (this.customerGroup2!=null &&
              this.customerGroup2.equals(other.getCustomerGroup2()))) &&
            ((this.customerGroup3==null && other.getCustomerGroup3()==null) || 
             (this.customerGroup3!=null &&
              this.customerGroup3.equals(other.getCustomerGroup3()))) &&
            ((this.customerGroup4==null && other.getCustomerGroup4()==null) || 
             (this.customerGroup4!=null &&
              this.customerGroup4.equals(other.getCustomerGroup4()))) &&
            ((this.customerGroup5==null && other.getCustomerGroup5()==null) || 
             (this.customerGroup5!=null &&
              this.customerGroup5.equals(other.getCustomerGroup5()))) &&
            ((this.customerNo==null && other.getCustomerNo()==null) || 
             (this.customerNo!=null &&
              this.customerNo.equals(other.getCustomerNo()))) &&
            ((this.distributionChannel==null && other.getDistributionChannel()==null) || 
             (this.distributionChannel!=null &&
              this.distributionChannel.equals(other.getDistributionChannel()))) &&
            ((this.division==null && other.getDivision()==null) || 
             (this.division!=null &&
              this.division.equals(other.getDivision()))) &&
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate()))) &&
            ((this.documentType==null && other.getDocumentType()==null) || 
             (this.documentType!=null &&
              this.documentType.equals(other.getDocumentType()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.modifiedBy==null && other.getModifiedBy()==null) || 
             (this.modifiedBy!=null &&
              this.modifiedBy.equals(other.getModifiedBy()))) &&
            ((this.modifiedOn==null && other.getModifiedOn()==null) || 
             (this.modifiedOn!=null &&
              this.modifiedOn.equals(other.getModifiedOn()))) &&
            ((this.orderLineItems==null && other.getOrderLineItems()==null) || 
             (this.orderLineItems!=null &&
              java.util.Arrays.equals(this.orderLineItems, other.getOrderLineItems()))) &&
            ((this.orderNumber==null && other.getOrderNumber()==null) || 
             (this.orderNumber!=null &&
              this.orderNumber.equals(other.getOrderNumber()))) &&
            ((this.orderPrice==null && other.getOrderPrice()==null) || 
             (this.orderPrice!=null &&
              java.util.Arrays.equals(this.orderPrice, other.getOrderPrice()))) &&
            ((this.partners==null && other.getPartners()==null) || 
             (this.partners!=null &&
              java.util.Arrays.equals(this.partners, other.getPartners()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.priceDate==null && other.getPriceDate()==null) || 
             (this.priceDate!=null &&
              this.priceDate.equals(other.getPriceDate()))) &&
            ((this.purchaseDate==null && other.getPurchaseDate()==null) || 
             (this.purchaseDate!=null &&
              this.purchaseDate.equals(other.getPurchaseDate()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.salesOffice==null && other.getSalesOffice()==null) || 
             (this.salesOffice!=null &&
              this.salesOffice.equals(other.getSalesOffice()))) &&
            ((this.salesOrg==null && other.getSalesOrg()==null) || 
             (this.salesOrg!=null &&
              this.salesOrg.equals(other.getSalesOrg()))) &&
            ((this.transactionCurrency==null && other.getTransactionCurrency()==null) || 
             (this.transactionCurrency!=null &&
              this.transactionCurrency.equals(other.getTransactionCurrency())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCAGKey() != null) {
            _hashCode += getCAGKey().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCardDetails() != null) {
            _hashCode += getCardDetails().hashCode();
        }
        if (getCentreNo() != null) {
            _hashCode += getCentreNo().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCustomerGroup1() != null) {
            _hashCode += getCustomerGroup1().hashCode();
        }
        if (getCustomerGroup2() != null) {
            _hashCode += getCustomerGroup2().hashCode();
        }
        if (getCustomerGroup3() != null) {
            _hashCode += getCustomerGroup3().hashCode();
        }
        if (getCustomerGroup4() != null) {
            _hashCode += getCustomerGroup4().hashCode();
        }
        if (getCustomerGroup5() != null) {
            _hashCode += getCustomerGroup5().hashCode();
        }
        if (getCustomerNo() != null) {
            _hashCode += getCustomerNo().hashCode();
        }
        if (getDistributionChannel() != null) {
            _hashCode += getDistributionChannel().hashCode();
        }
        if (getDivision() != null) {
            _hashCode += getDivision().hashCode();
        }
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        if (getDocumentType() != null) {
            _hashCode += getDocumentType().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getModifiedBy() != null) {
            _hashCode += getModifiedBy().hashCode();
        }
        if (getModifiedOn() != null) {
            _hashCode += getModifiedOn().hashCode();
        }
        if (getOrderLineItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderLineItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderLineItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrderNumber() != null) {
            _hashCode += getOrderNumber().hashCode();
        }
        if (getOrderPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrderPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrderPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getPriceDate() != null) {
            _hashCode += getPriceDate().hashCode();
        }
        if (getPurchaseDate() != null) {
            _hashCode += getPurchaseDate().hashCode();
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSalesOffice() != null) {
            _hashCode += getSalesOffice().hashCode();
        }
        if (getSalesOrg() != null) {
            _hashCode += getSalesOrg().hashCode();
        }
        if (getTransactionCurrency() != null) {
            _hashCode += getTransactionCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CAGKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CAGKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CampaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardDetails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CardDetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CardDetails"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centreNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CentreNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerGroup1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerGroup2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerGroup3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerGroup4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerGroup5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerGroup5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "CustomerNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distributionChannel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "DistributionChannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("division");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Division"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "DocumentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "DocumentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ModifiedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedOn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ModifiedOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLineItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderLineItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "LineItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Price"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partners");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partner"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partner"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PaymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PriceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PurchaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Remark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Remark"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SalesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOffice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SalesOffice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesOrg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "SalesOrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "TransactionCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
