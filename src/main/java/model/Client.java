package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Natalya_Urikh
 */

@Entity
@Table(name = "CLIENT")
public class Client
{
	@Id
	@Column(name = "CLIENT_ID", nullable = false, unique = true)
	private  Long clientId;

	@Column(name = "CLIENT_NAME")
	private String clientName;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "MAIL")
	private String mail;

	public Long getClientId()
	{
		return clientId;
	}

	public void setClientId(Long clientId)
	{
		this.clientId = clientId;
	}

	public String getClientName()
	{
		return clientName;
	}

	public void setClientName(String clientName)
	{
		this.clientName = clientName;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getMail()
	{
		return mail;
	}

	public void setMail(String mail)
	{
		this.mail = mail;
	}
}
