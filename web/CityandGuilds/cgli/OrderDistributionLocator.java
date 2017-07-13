/**
 * OrderDistributionLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package web.CityandGuilds.cgli;

public class OrderDistributionLocator extends org.apache.axis.client.Service implements web.CityandGuilds.cgli.OrderDistribution {

    public OrderDistributionLocator() {
    }


    public OrderDistributionLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OrderDistributionLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IOrderDistribution
    private java.lang.String BasicHttpBinding_IOrderDistribution_address = "http://servicesqa.mymarkis.com/Contracts/OrderDistribution.svc";

    public java.lang.String getBasicHttpBinding_IOrderDistributionAddress() {
        return BasicHttpBinding_IOrderDistribution_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IOrderDistributionWSDDServiceName = "BasicHttpBinding_IOrderDistribution";

    public java.lang.String getBasicHttpBinding_IOrderDistributionWSDDServiceName() {
        return BasicHttpBinding_IOrderDistributionWSDDServiceName;
    }

    public void setBasicHttpBinding_IOrderDistributionWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IOrderDistributionWSDDServiceName = name;
    }

    public web.CityandGuilds.cgli.IOrderDistribution getBasicHttpBinding_IOrderDistribution() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IOrderDistribution_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IOrderDistribution(endpoint);
    }

    public web.CityandGuilds.cgli.IOrderDistribution getBasicHttpBinding_IOrderDistribution(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            web.CityandGuilds.cgli.BasicHttpBinding_IOrderDistributionStub _stub = new web.CityandGuilds.cgli.BasicHttpBinding_IOrderDistributionStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IOrderDistributionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IOrderDistributionEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IOrderDistribution_address = address;
    }


    // Use to get a proxy class for BasicHttpsBinding_IOrderDistribution
    private java.lang.String BasicHttpsBinding_IOrderDistribution_address = "https://servicesqa.mymarkis.com/Contracts/OrderDistribution.svc";

    public java.lang.String getBasicHttpsBinding_IOrderDistributionAddress() {
        return BasicHttpsBinding_IOrderDistribution_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpsBinding_IOrderDistributionWSDDServiceName = "BasicHttpsBinding_IOrderDistribution";

    public java.lang.String getBasicHttpsBinding_IOrderDistributionWSDDServiceName() {
        return BasicHttpsBinding_IOrderDistributionWSDDServiceName;
    }

    public void setBasicHttpsBinding_IOrderDistributionWSDDServiceName(java.lang.String name) {
        BasicHttpsBinding_IOrderDistributionWSDDServiceName = name;
    }

    public web.CityandGuilds.cgli.IOrderDistribution getBasicHttpsBinding_IOrderDistribution() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpsBinding_IOrderDistribution_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpsBinding_IOrderDistribution(endpoint);
    }

    public web.CityandGuilds.cgli.IOrderDistribution getBasicHttpsBinding_IOrderDistribution(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            web.CityandGuilds.cgli.BasicHttpsBinding_IOrderDistributionStub _stub = new web.CityandGuilds.cgli.BasicHttpsBinding_IOrderDistributionStub(portAddress, this);
            _stub.setPortName(getBasicHttpsBinding_IOrderDistributionWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpsBinding_IOrderDistributionEndpointAddress(java.lang.String address) {
        BasicHttpsBinding_IOrderDistribution_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (web.CityandGuilds.cgli.IOrderDistribution.class.isAssignableFrom(serviceEndpointInterface)) {
                web.CityandGuilds.cgli.BasicHttpBinding_IOrderDistributionStub _stub = new web.CityandGuilds.cgli.BasicHttpBinding_IOrderDistributionStub(new java.net.URL(BasicHttpBinding_IOrderDistribution_address), this);
                _stub.setPortName(getBasicHttpBinding_IOrderDistributionWSDDServiceName());
                return _stub;
            }
            if (web.CityandGuilds.cgli.IOrderDistribution.class.isAssignableFrom(serviceEndpointInterface)) {
                web.CityandGuilds.cgli.BasicHttpsBinding_IOrderDistributionStub _stub = new web.CityandGuilds.cgli.BasicHttpsBinding_IOrderDistributionStub(new java.net.URL(BasicHttpsBinding_IOrderDistribution_address), this);
                _stub.setPortName(getBasicHttpsBinding_IOrderDistributionWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IOrderDistribution".equals(inputPortName)) {
            return getBasicHttpBinding_IOrderDistribution();
        }
        else if ("BasicHttpsBinding_IOrderDistribution".equals(inputPortName)) {
            return getBasicHttpsBinding_IOrderDistribution();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cgli.CityandGuilds.web", "OrderDistribution");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cgli.CityandGuilds.web", "BasicHttpBinding_IOrderDistribution"));
            ports.add(new javax.xml.namespace.QName("http://cgli.CityandGuilds.web", "BasicHttpsBinding_IOrderDistribution"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IOrderDistribution".equals(portName)) {
            setBasicHttpBinding_IOrderDistributionEndpointAddress(address);
        }
        else 
if ("BasicHttpsBinding_IOrderDistribution".equals(portName)) {
            setBasicHttpsBinding_IOrderDistributionEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
