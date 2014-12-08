package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Natalya_Urikh
 */
@Entity
@Table(name = "ROLES")
public class Role
{
	@Id
	@Column(name = "ROLE_ID", nullable = false, unique = true)
	private Long roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

	public Long getRoleId()
	{
		return roleId;
	}

	public void setRoleId(Long roleId)
	{
		this.roleId = roleId;
	}

	public String getRoleName()
	{
		return roleName;
	}

	public void setRoleName(String roleName)
	{
		this.roleName = roleName;
	}
}
