#encoding: utf-8

import random
from java.awt import *
from javax.swing import *
from org.java import MainPanelUi

class MainPanel(MainPanelUi):
	def __init__(self):
		MainPanelUi.__init__(self)

		self.change_bgcolor_button.actionPerformed.append(self.change_bgcolor)
		self.display_message_button.actionPerformed.append(self.display_message)

	def change_bgcolor(self, ev):
		colors = [Color.red, Color.white, Color.gray, Color.blue, Color.green, Color.yellow, Color.black]
		idx = random.randrange(0, len(colors))
		self.setBackground(colors[idx])
	
	def display_message(self, ev):
		messages = [u"你是谁", u"这是在哪里", u"看，这是什么"]
		idx = random.randrange(0, len(messages))
		JOptionPane.showMessageDialog(self, messages[idx])
