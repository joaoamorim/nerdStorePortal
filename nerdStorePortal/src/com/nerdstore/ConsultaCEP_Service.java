package com.nerdstore;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.14.redhat-1
 * 2016-12-06T12:02:39.604-02:00
 * Generated source version: 2.7.14.redhat-1
 * 
 */
@WebServiceClient(name = "ConsultaCEP", 
                  wsdlLocation = "file:/C:/Users/Jo�o/git/nerdStorePortal/nerdStorePortal/src/ConsultaCEP.wsdl",
                  targetNamespace = "http://das.ufsc.br/ConsultaCEP/") 
public class ConsultaCEP_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://das.ufsc.br/ConsultaCEP/", "ConsultaCEP");
    public final static QName ConsultaCEPSOAP = new QName("http://das.ufsc.br/ConsultaCEP/", "ConsultaCEPSOAP");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Jo�o/git/nerdStorePortal/nerdStorePortal/src/ConsultaCEP.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ConsultaCEP_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Jo�o/git/nerdStorePortal/nerdStorePortal/src/ConsultaCEP.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ConsultaCEP_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultaCEP_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultaCEP_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ConsultaCEP_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ConsultaCEP_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ConsultaCEP_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ConsultaCEP
     */
    @WebEndpoint(name = "ConsultaCEPSOAP")
    public ConsultaCEP getConsultaCEPSOAP() {
        return super.getPort(ConsultaCEPSOAP, ConsultaCEP.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultaCEP
     */
    @WebEndpoint(name = "ConsultaCEPSOAP")
    public ConsultaCEP getConsultaCEPSOAP(WebServiceFeature... features) {
        return super.getPort(ConsultaCEPSOAP, ConsultaCEP.class, features);
    }

}
