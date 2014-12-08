package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Natalya_Urikh
 */

@Entity
@Table(name = "ORDER_SOURCE")
public class OrderSource
{
	@Id
	@Column(name = "SOURCE_ID", nullable = false, unique = true)
	private  Long sourceId;

	@Column(name = "SOURCE_NAME")
	private String sourceName;

	public String getSourceName()
	{
		return sourceName;
	}

	public void setSourceName(String sourceName)
	{
		this.sourceName = sourceName;
	}

	public Long getSourceId()
	{
		return sourceId;
	}

	public void setSourceId(Long sourceId)
	{
		this.sourceId = sourceId;
	}
}


