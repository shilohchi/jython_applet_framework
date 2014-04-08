import javax.swing.JApplet;
import javax.script.*;

public class BootstrapApplet extends JApplet {
	public void init() {	
		try {
			ScriptEngine engine = new ScriptEngineManager().getEngineByName("python");
			engine.put("applet", this);
			engine.eval(getParameter("eval"));
		} catch (ScriptException ex) {
			ex.printStackTrace();
		}
	}
}
