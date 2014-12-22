import service.UserService;

/**
 * @author Natalya_Urikh
 */
public class Runner
{
	public static void main(String[] args)
	{
		/*		Role role = new Role();
		role.setRoleId(1L);;
		role.setRoleName("admin");

		User user = new User();
		user.setUserId(1L);
		user.setSurname("surname");
		user.setLogin("login");
		user.setPassword("password");
		user.setName("name");
		user.setRole(role);*/

		UserService userService = new UserService();
		userService.findAll();

	}
}
