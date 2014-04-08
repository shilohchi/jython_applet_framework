from javax.swing import *
import demo

def inject_to(applet):
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
	applet.getContentPane().add(demo.MainPanel())
