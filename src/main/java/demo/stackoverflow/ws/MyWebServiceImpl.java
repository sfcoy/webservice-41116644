package demo.stackoverflow.ws;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import demo.stackoverflow.dao.MyDAO;

@Stateless
@WebService
public class MyWebServiceImpl implements MyWebService {

    @EJB
    private MyDAO myDAO;

    @Override
    public String performOperation() {
        return myDAO.hello();
    }

}
