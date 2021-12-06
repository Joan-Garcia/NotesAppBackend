
package clientews.servicio;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "NoteDaoService", targetNamespace = "http://dao/", wsdlLocation = "http://localhost:8080/NoteDaoService/NoteDao?wsdl")
public class NoteDaoService
    extends Service
{

    private final static URL NOTEDAOSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTEDAOSERVICE_EXCEPTION;
    private final static QName NOTEDAOSERVICE_QNAME = new QName("http://dao/", "NoteDaoService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/NoteDaoService/NoteDao?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTEDAOSERVICE_WSDL_LOCATION = url;
        NOTEDAOSERVICE_EXCEPTION = e;
    }

    public NoteDaoService() {
        super(__getWsdlLocation(), NOTEDAOSERVICE_QNAME);
    }

    public NoteDaoService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTEDAOSERVICE_QNAME, features);
    }

    public NoteDaoService(URL wsdlLocation) {
        super(wsdlLocation, NOTEDAOSERVICE_QNAME);
    }

    public NoteDaoService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTEDAOSERVICE_QNAME, features);
    }

    public NoteDaoService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NoteDaoService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns INoteDao
     */
    @WebEndpoint(name = "NoteDaoPort")
    public INoteDao getNoteDaoPort() {
        return super.getPort(new QName("http://dao/", "NoteDaoPort"), INoteDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns INoteDao
     */
    @WebEndpoint(name = "NoteDaoPort")
    public INoteDao getNoteDaoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://dao/", "NoteDaoPort"), INoteDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTEDAOSERVICE_EXCEPTION!= null) {
            throw NOTEDAOSERVICE_EXCEPTION;
        }
        return NOTEDAOSERVICE_WSDL_LOCATION;
    }

}
