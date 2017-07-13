package web.CityandGuilds.cgli;

public class IOrderDistributionProxy implements web.CityandGuilds.cgli.IOrderDistribution {
  private String _endpoint = null;
  private web.CityandGuilds.cgli.IOrderDistribution iOrderDistribution = null;
  
  public IOrderDistributionProxy() {
    _initIOrderDistributionProxy();
  }
  
  public IOrderDistributionProxy(String endpoint) {
    _endpoint = endpoint;
    _initIOrderDistributionProxy();
  }
  
  private void _initIOrderDistributionProxy() {
    try {
      iOrderDistribution = (new web.CityandGuilds.cgli.OrderDistributionLocator()).getBasicHttpBinding_IOrderDistribution();
      if (iOrderDistribution != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iOrderDistribution)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iOrderDistribution)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iOrderDistribution != null)
      ((javax.xml.rpc.Stub)iOrderDistribution)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public web.CityandGuilds.cgli.IOrderDistribution getIOrderDistribution() {
    if (iOrderDistribution == null)
      _initIOrderDistributionProxy();
    return iOrderDistribution;
  }
  
  public org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderDistributeResponse orderDistributeRequest(org.datacontract.schemas._2017._07.CityandGuilds_OrderDistribution.OrderDistributeRequest orderDistributeRequest) throws java.rmi.RemoteException{
    if (iOrderDistribution == null)
      _initIOrderDistributionProxy();
    return iOrderDistribution.orderDistributeRequest(orderDistributeRequest);
  }
  
  
}