package demo.stackoverflow.dao;

import javax.ejb.Stateless;

@Stateless
public class MyDAOImpl implements MyDAO {

    @Override
    public String hello() {
        return "Hello from me";
    }
}
