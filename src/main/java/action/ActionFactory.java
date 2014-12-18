package action;

import java.util.HashMap;
import java.util.Map;

public class ActionFactory {

    static Map<String, Action> actions = new HashMap<>();
    static {
//        actions.put("GET/register", new RegisterAction());
        actions.put("POST/register", new RegisterAction());
        actions.put("GET/home", new ShowPageAction("home.jsp"));
        actions.put("GET/home", new ShowHomeAction());
    }


    public static Action getAction(String action) {
        return actions.get(action);
    }
}
