package mk.gov.ia.controller;

import mk.gov.ia.model.Hiw;
import mk.gov.ia.service.HiwService;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import mk.gov.ia.exception.DataStoreIntegrityException;
import mk.gov.ia.exception.NoSuchObjectException;

@SessionScoped
@ManagedBean(name = "howItWorksBean")
public class HiwBean implements Serializable {

    @ManagedProperty(value = "#{HiwService}")
    HiwService hiwService;

    private String title;

    private String description;

    public HiwService getHiwService() {
        return hiwService;
    }

    public void setHiwService(HiwService hiwService) {
        this.hiwService = hiwService;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @PostConstruct
    public void init() {

    }

    public void addNewHiw() {
        Hiw hiw = new Hiw();
        
        hiw.setTitle(title);
        hiw.setDescription(description);
        
        try {
            this.hiwService.createHiw(hiw);
        } catch (DataStoreIntegrityException ex) {
            Logger.getLogger(HiwBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchObjectException ex) {
            Logger.getLogger(HiwBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void testMethod1() {

        List<Hiw> test = this.hiwService.getAllHiws(0);

        System.out.println(test);

    }

}
