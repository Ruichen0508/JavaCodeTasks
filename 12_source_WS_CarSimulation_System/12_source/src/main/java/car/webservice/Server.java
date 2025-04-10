
package car.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Server", targetNamespace = "http://server/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Server {


    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setCarName", targetNamespace = "http://server/", className = "car.webservice.SetCarName")
    @ResponseWrapper(localName = "setCarNameResponse", targetNamespace = "http://server/", className = "car.webservice.SetCarNameResponse")
    @Action(input = "http://server/Server/setCarNameRequest", output = "http://server/Server/setCarNameResponse")
    public void setCarName(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "destroyCar", targetNamespace = "http://server/", className = "car.webservice.DestroyCar")
    @ResponseWrapper(localName = "destroyCarResponse", targetNamespace = "http://server/", className = "car.webservice.DestroyCarResponse")
    @Action(input = "http://server/Server/destroyCarRequest", output = "http://server/Server/destroyCarResponse")
    public void destroyCar(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "moveCarTo", targetNamespace = "http://server/", className = "car.webservice.MoveCarTo")
    @ResponseWrapper(localName = "moveCarToResponse", targetNamespace = "http://server/", className = "car.webservice.MoveCarToResponse")
    @Action(input = "http://server/Server/moveCarToRequest", output = "http://server/Server/moveCarToResponse")
    public boolean moveCarTo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Direction arg1);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createCar", targetNamespace = "http://server/", className = "car.webservice.CreateCar")
    @ResponseWrapper(localName = "createCarResponse", targetNamespace = "http://server/", className = "car.webservice.CreateCarResponse")
    @Action(input = "http://server/Server/createCarRequest", output = "http://server/Server/createCarResponse")
    public int createCar();

    void moveCarRandomly(int carIndex);

    void setCarColor(int carIndex, String red);
}
