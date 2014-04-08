import sys
sys.path += ["lib/ui_demo.jar"]

from javax.swing import *
from demo import MainPanel

if __name__ == "__main__":
	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
	frame = JFrame()
	panel = MainPanel()
	frame.getContentPane().add(panel)
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
	frame.setSize(800, 600)
	frame.setVisible(True)
