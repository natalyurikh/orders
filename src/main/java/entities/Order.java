package entities;

import org.joda.time.DateTime;

/**
 * @author Natalya_Urikh
 */
public class Order
{
	private  int number;
	private DateTime date;
	private SourceType sourceType;
	private String model;
	private String serialNumber;
	private  String defect;
	private String conclusion;
	private int price;
	private String clientName;
	private String phoneNumber;
	private String mail;
	private  OrderStatus orderStatus;
	private DateTime statusDate;

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public DateTime getDate()
	{
		return date;
	}

	public void setDate(DateTime date)
	{
		this.date = date;
	}

	public SourceType getSourceType()
	{
		return sourceType;
	}

	public void setSourceType(SourceType sourceType)
	{
		this.sourceType = sourceType;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public String getSerialNumber()
	{
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber = serialNumber;
	}

	public String getDefect()
	{
		return defect;
	}

	public void setDefect(String defect)
	{
		this.defect = defect;
	}

	public String getConclusion()
	{
		return conclusion;
	}

	public void setConclusion(String conclusion)
	{
		this.conclusion = conclusion;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
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

	public OrderStatus getOrderStatus()
	{
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus)
	{
		this.orderStatus = orderStatus;
	}

	public DateTime getStatusDate()
	{
		return statusDate;
	}

	public void setStatusDate(DateTime statusDate)
	{
		this.statusDate = statusDate;
	}
}
