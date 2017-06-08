package mk.gov.ia.controller;

import mk.gov.ia.model.Hiw;
import mk.gov.ia.service.HiwService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "testbean")
public class TestBean implements Serializable {

    @ManagedProperty(value = "#{HiwService}")
    HiwService hiwService;

    public HiwService getHiwService() {
        return hiwService;
    }

    public void setHiwService(HiwService hiwService) {
        this.hiwService = hiwService;
    }
    
    @PostConstruct
    public void init() {

    }

    public void testMethod1() {
        
        
        
        List<Hiw> test =  this.hiwService.getAllHiws(0);

        System.out.println(test);
        
    }

  

}
