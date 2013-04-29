package com.packtpub.techbuzz.entities;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author siva
 */
public class User implements Serializable 
{
    private static final long serialVersionUID = 1L;
    
    private Integer id;
    private String userName;
    private String password;
    private String firstName;
	private String lastName;
    private String emailId;
    private String phone;
	private Date dob;
    private boolean disabled;
    
    public User() {
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(Integer id, String userName, String password, String firstName, String emailId,boolean disabled)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.emailId = emailId;
	}
    
    public User(Integer id, String userName, String password, 
    		String firstName, String lastName, String phone, Date dob, String emailId, boolean disabled)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.dob = dob;
		this.emailId = emailId;
		this.disabled = disabled;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public Date getDob()
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}

	public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }
    
}