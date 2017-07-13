/**
 * OrderDistributeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution;

public class OrderDistributeResponse  implements java.io.Serializable {
    private org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.ResponseStatus[] responseStatus;

    public OrderDistributeResponse() {
    }

    public OrderDistributeResponse(
           org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.ResponseStatus[] responseStatus) {
           this.responseStatus = responseStatus;
    }


    /**
     * Gets the responseStatus value for this OrderDistributeResponse.
     * 
     * @return responseStatus
     */
    public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.ResponseStatus[] getResponseStatus() {
        return responseStatus;
    }


    /**
     * Sets the responseStatus value for this OrderDistributeResponse.
     * 
     * @param responseStatus
     */
    public void setResponseStatus(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.ResponseStatus[] responseStatus) {
        this.responseStatus = responseStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderDistributeResponse)) return false;
        OrderDistributeResponse other = (OrderDistributeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.responseStatus==null && other.getResponseStatus()==null) || 
             (this.responseStatus!=null &&
              java.util.Arrays.equals(this.responseStatus, other.getResponseStatus())));
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
        if (getResponseStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponseStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponseStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderDistributeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "OrderDistributeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ResponseStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ResponseStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2017/07/CityandGuilds.OrderDistribution", "ResponseStatus"));
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
