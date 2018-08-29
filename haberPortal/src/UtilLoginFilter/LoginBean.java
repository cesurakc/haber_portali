package UtilLoginFilter;

import javax.faces.application.FacesMessage;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import dal.tblUsersDAO;
import models.tblusers;
import util.StaticValues;

@SuppressWarnings("deprecation")
@ManagedBean
@SessionScoped
public class LoginBean {

	private static final long serialVersionUID = 7765876811740798583L;
	 
    // Simple user database :)
   // private static final String[] users = {"anna:qazwsx","kate:123456"};
	 private String username;
	 private String password;
     
	    private boolean loggedIn;
	 
	    @ManagedProperty(value="#{navigationBean}")
	    private NaviGationBean navigationBean;

	    
	    tblUsersDAO db= new tblUsersDAO();
	    
	 public String doLogin() {
	        // Get every user from our sample database :)
	    	for (tblusers item : db.listA(new tblusers())) {
				if(username.equals(item.getAd()) && password.equals(item.getSifre())) {
					loggedIn=true;
				 
					StaticValues.kullanici = username;
					StaticValues.kullaniciresim=item.getResimurl();
				
				return navigationBean.redirectToWelcome();
				
			}
			}
	         
	        // Set login ERROR
	        FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
	        msg.setSeverity(FacesMessage.SEVERITY_ERROR);
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	         
	        // To to login page
	        return navigationBean.toLogin();
	         
	    }
	     
	    public NaviGationBean getNavigationBean() {
		return navigationBean;
	}

	public void setNavigationBean(NaviGationBean navigationBean) {
		this.navigationBean = navigationBean;
	}

		/**
	     * Logout operation.
	     * @return
	     */
	    public String doLogout() {
	        // Set the paremeter indicating that user is logged in to false
	        loggedIn = false;
	         
	        // Set logout message
	        FacesMessage msg = new FacesMessage("Logout success!", "INFO MSG");
	        msg.setSeverity(FacesMessage.SEVERITY_INFO);
	        FacesContext.getCurrentInstance().addMessage(null, msg);
	         
	        return navigationBean.toLogin();
	    }
	 
	    // ------------------------------
	    // Getters & Setters 
	
	
	
	
	
	
	
	
	
	
	
	
   
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	

}
