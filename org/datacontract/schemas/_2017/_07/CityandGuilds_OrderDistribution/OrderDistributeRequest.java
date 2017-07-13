/**
 * OrderDistributeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class OrderDistributeRequest  implements java.io.Serializable {
    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderHeader orderHeader;

    public OrderDistributeRequest() {
    }

    public OrderDistributeRequest(
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderHeader orderHeader) {
           this.orderHeader = orderHeader;
    }


    /**
     * Gets the orderHeader value for this OrderDistributeRequest.
     * 
     * @return orderHeader
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderHeader getOrderHeader() {
        return orderHeader;
    }


    /**
     * Sets the orderHeader value for this OrderDistributeRequest.
     * 
     * @param orderHeader
     */
    public void setOrderHeader(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderHeader orderHeader) {
        this.orderHeader = orderHeader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDistributeRequest)) return false;
        OrderDistributeRequest other = (OrderDistributeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.orderHeader==null && other.getOrderHeader()==null) || 
             (this.orderHeader!=null &&
              this.orderHeader.equals(other.getOrderHeader())));
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
        if (getOrderHeader() != null) {
            _hashCode += getOrderHeader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDistributeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderDistributeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderHeader"));
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
