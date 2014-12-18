package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowHomeAction implements Action {
    @Override
    public ActionResult execute(HttpServletRequest req, HttpServletResponse resp) {
        //получить данные из реквеста

        //сходит в базу

        //засетать в риквест аттрибутов

        return new ActionResult("admin/home.jsp");
    }
}
