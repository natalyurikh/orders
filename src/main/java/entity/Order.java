package entity;

import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.HashMap;

/**
 * @author Natalya_Urikh
 */
@Entity
@Table(name = "ORDERS")
public class Order
{
	@Id
	@Column(name = "ORDER_ID", nullable = false, unique = true)
	private  Long orderId;

	@Column(name = "ORDER_NUMBER")
	private  String orderNumber;

	@Column(name = "ORDER_DATE")
	private DateTime orderDate;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "SOURCE_ID")
	private OrderSource sourceType;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "DEVICE_ID")
	private Device device;

	@Column(name = "PRICE")
	private int price;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "CLIENT_ID")
	private Client client;

	private HashMap<DateTime, OrderStatus> statusMap = new HashMap<DateTime, OrderStatus>();

	public Long getOrderId()
	{
		return orderId;
	}

	public void setOrderId(Long orderId)
	{
		this.orderId = orderId;
	}

	public String getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public DateTime getOrderDate()
	{
		return orderDate;
	}

	public void setOrderDate(DateTime orderDate)
	{
		this.orderDate = orderDate;
	}

	public OrderSource getSourceType()
	{
		return sourceType;
	}

	public void setSourceType(OrderSource sourceType)
	{
		this.sourceType = sourceType;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	public Device getDevice()
	{
		return device;
	}

	public void setDevice(Device device)
	{
		this.device = device;
	}

	public Client getClient()
	{
		return client;
	}

	public void setClient(Client client)
	{
		this.client = client;
	}

	public HashMap<DateTime, OrderStatus> getStatusMap()
	{
		return statusMap;
	}

	public void setStatusMap(HashMap<DateTime, OrderStatus> statusMap)
	{
		this.statusMap = statusMap;
	}

/*	public OrderStatus getOrderStatus()
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
	}*/
}
