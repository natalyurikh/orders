package entity;

import javax.persistence.*;

/**
 * @author Natalya_Urikh
 */

@Entity
@Table(name = "User")
public class User
{
	@Id
	@Column(name = "USER_ID", nullable = false, unique = true)
	private  Long userId;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "PASSWORD")
	private String password;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ROLE_ID")
	private Role role;
}
