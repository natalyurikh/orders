package action;


import model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterAction implements Action {

    RegisterService service = new RegisterService();

    @Override
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp) {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        service.register(user);
        req.getSession().setAttribute("login", login);


        return new ActionResult("success.jsp", true);
    }
}
