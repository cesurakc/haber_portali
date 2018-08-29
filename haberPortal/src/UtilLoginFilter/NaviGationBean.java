package UtilLoginFilter;

import java.io.Serializable;




import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="navigationBean")
@SessionScoped
public class NaviGationBean implements Serializable {
 
    private static final long serialVersionUID = 1520318172495977648L;
 
    /**
     * Redirect to login page.
     * @return Login page name.
     */
    public String redirectToLogin() {
        return "/login.jsf?faces-redirect=true";
    }
     
    /**
     * Go to login page.
     * @return Login page name.
     */
    public String toLogin() {
        return "/login.jsf";
    }
     
   
    /**
     * Redirect to welcome page.
     * @return Welcome page name.
     */
    public String redirectToWelcome() {
        return "/AdminPanel/index.jsf?faces-redirect=true";
    }
     
    /**
     * Go to welcome page.
     * @return Welcome page name.
     */
    public String toWelcome() {
        return "/AdminPanel/index.jsf";
    }
    public String indexSayfa()
    {
    	
    	return "/index.jsf?faces-redirect=true";
    	
    }
}
