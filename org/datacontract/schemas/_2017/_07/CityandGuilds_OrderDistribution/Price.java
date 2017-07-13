/**
 * Price.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class Price  implements java.io.Serializable {
    private java.lang.String conditionType;

    private java.lang.String conditionUnit;

    private java.lang.String conditionValue;

    private java.lang.String currency;

    private java.lang.String discountAmount;

    private java.lang.String orderAmount;

    private java.lang.String tax;

    public Price() {
    }

    public Price(
           java.lang.String conditionType,
           java.lang.String conditionUnit,
           java.lang.String conditionValue,
           java.lang.String currency,
           java.lang.String discountAmount,
           java.lang.String orderAmount,
           java.lang.String tax) {
           this.conditionType = conditionType;
           this.conditionUnit = conditionUnit;
           this.conditionValue = conditionValue;
           this.currency = currency;
           this.discountAmount = discountAmount;
           this.orderAmount = orderAmount;
           this.tax = tax;
    }


    /**
     * Gets the conditionType value for this Price.
     * 
     * @return conditionType
     */
    public java.lang.String getConditionType() {
        return conditionType;
    }


    /**
     * Sets the conditionType value for this Price.
     * 
     * @param conditionType
     */
    public void setConditionType(java.lang.String conditionType) {
        this.conditionType = conditionType;
    }


    /**
     * Gets the conditionUnit value for this Price.
     * 
     * @return conditionUnit
     */
    public java.lang.String getConditionUnit() {
        return conditionUnit;
    }


    /**
     * Sets the conditionUnit value for this Price.
     * 
     * @param conditionUnit
     */
    public void setConditionUnit(java.lang.String conditionUnit) {
        this.conditionUnit = conditionUnit;
    }


    /**
     * Gets the conditionValue value for this Price.
     * 
     * @return conditionValue
     */
    public java.lang.String getConditionValue() {
        return conditionValue;
    }


    /**
     * Sets the conditionValue value for this Price.
     * 
     * @param conditionValue
     */
    public void setConditionValue(java.lang.String conditionValue) {
        this.conditionValue = conditionValue;
    }


    /**
     * Gets the currency value for this Price.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Price.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the discountAmount value for this Price.
     * 
     * @return discountAmount
     */
    public java.lang.String getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this Price.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(java.lang.String discountAmount) {
        this.discountAmount = discountAmount;
    }


    /**
     * Gets the orderAmount value for this Price.
     * 
     * @return orderAmount
     */
    public java.lang.String getOrderAmount() {
        return orderAmount;
    }


    /**
     * Sets the orderAmount value for this Price.
     * 
     * @param orderAmount
     */
    public void setOrderAmount(java.lang.String orderAmount) {
        this.orderAmount = orderAmount;
    }


    /**
     * Gets the tax value for this Price.
     * 
     * @return tax
     */
    public java.lang.String getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this Price.
     * 
     * @param tax
     */
    public void setTax(java.lang.String tax) {
        this.tax = tax;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Price)) return false;
        Price other = (Price) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.conditionType==null && other.getConditionType()==null) || 
             (this.conditionType!=null &&
              this.conditionType.equals(other.getConditionType()))) &&
            ((this.conditionUnit==null && other.getConditionUnit()==null) || 
             (this.conditionUnit!=null &&
              this.conditionUnit.equals(other.getConditionUnit()))) &&
            ((this.conditionValue==null && other.getConditionValue()==null) || 
             (this.conditionValue!=null &&
              this.conditionValue.equals(other.getConditionValue()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              this.discountAmount.equals(other.getDiscountAmount()))) &&
            ((this.orderAmount==null && other.getOrderAmount()==null) || 
             (this.orderAmount!=null &&
              this.orderAmount.equals(other.getOrderAmount()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax())));
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
        if (getConditionType() != null) {
            _hashCode += getConditionType().hashCode();
        }
        if (getConditionUnit() != null) {
            _hashCode += getConditionUnit().hashCode();
        }
        if (getConditionValue() != null) {
            _hashCode += getConditionValue().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getDiscountAmount() != null) {
            _hashCode += getDiscountAmount().hashCode();
        }
        if (getOrderAmount() != null) {
            _hashCode += getOrderAmount().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Price.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Price"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ConditionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ConditionUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ConditionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "DiscountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Tax"));
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
