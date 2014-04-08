思路：
	JApplet -> 启动jython引擎 -> 将JApplet自身传递给jython引擎 -> 执行applet参数指定的脚本

注意事项：
	1. java的安全控制级别设置为最低，否则，jython实现的applet会被浏览器阻止！
	2. 所有jar文件必须签名，否则，不能在浏览器中运行！！
