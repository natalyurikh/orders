package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Natalya_Urikh
 */

@Entity
@Table(name = "ORDER_STATUS")
public class OrderStatus
{
	@Id
	@Column(name = "STATUS_ID", nullable = false, unique = true)
	private Long statusId;

	@Column(name = "STATUS_NAME")
	private String statusName;

	public Long getStatusId()
	{
		return statusId;
	}

	public void setStatusId(Long statusId)
	{
		this.statusId = statusId;
	}

	public String getStatusName()
	{
		return statusName;
	}

	public void setStatusName(String name)
	{
		this.statusName = name;
	}
}
