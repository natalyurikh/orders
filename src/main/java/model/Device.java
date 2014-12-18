package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Natalya_Urikh
 */

@Entity
@Table(name = "DEVICE")
public class Device
{
	@Id
	@Column(name = "DEVICE_ID", nullable = false, unique = true)
	private Long deviceId;

	@Column(name = "MODEL")
	private String model;

	@Column(name = "Serial_Number")
	private String serialNumber;

	@Column(name = "DEFECT")
	private  String defect;

	@Column(name = "CONCLUSION")
	private String conclusion;

	public Long getDeviceId()
	{
		return deviceId;
	}

	public void setDeviceId(Long deviceId)
	{
		this.deviceId = deviceId;
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


}
