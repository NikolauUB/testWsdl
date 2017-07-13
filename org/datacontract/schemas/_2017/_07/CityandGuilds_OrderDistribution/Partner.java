/**
 * Partner.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class Partner  implements java.io.Serializable {
    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Address[] address;

    private java.lang.String partnerNo;

    private java.lang.String partnerType;

    public Partner() {
    }

    public Partner(
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Address[] address,
           java.lang.String partnerNo,
           java.lang.String partnerType) {
           this.address = address;
           this.partnerNo = partnerNo;
           this.partnerType = partnerType;
    }


    /**
     * Gets the address value for this Partner.
     * 
     * @return address
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Address[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Partner.
     * 
     * @param address
     */
    public void setAddress(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.Address[] address) {
        this.address = address;
    }


    /**
     * Gets the partnerNo value for this Partner.
     * 
     * @return partnerNo
     */
    public java.lang.String getPartnerNo() {
        return partnerNo;
    }


    /**
     * Sets the partnerNo value for this Partner.
     * 
     * @param partnerNo
     */
    public void setPartnerNo(java.lang.String partnerNo) {
        this.partnerNo = partnerNo;
    }


    /**
     * Gets the partnerType value for this Partner.
     * 
     * @return partnerType
     */
    public java.lang.String getPartnerType() {
        return partnerType;
    }


    /**
     * Sets the partnerType value for this Partner.
     * 
     * @param partnerType
     */
    public void setPartnerType(java.lang.String partnerType) {
        this.partnerType = partnerType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Partner)) return false;
        Partner other = (Partner) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.partnerNo==null && other.getPartnerNo()==null) || 
             (this.partnerNo!=null &&
              this.partnerNo.equals(other.getPartnerNo()))) &&
            ((this.partnerType==null && other.getPartnerType()==null) || 
             (this.partnerType!=null &&
              this.partnerType.equals(other.getPartnerType())));
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
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerNo() != null) {
            _hashCode += getPartnerNo().hashCode();
        }
        if (getPartnerType() != null) {
            _hashCode += getPartnerType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Partner.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Partner"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "Address"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PartnerNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "PartnerType"));
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
