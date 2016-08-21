README
1.在工程文件下打开命令行 输入mvn compile 编译程序
2.输入mvn jetty：run 开启服务器
3.dbconfig.properties文件位于resources目录下
4.打开浏览器输入http://localhost:8080/SpringMVCExam/user.do 进入管理界面，会被拦截下来弹回登录界面（拦截功能）
5.http://localhost:8080/SpringMVCExam/login.do为登录界面链接
6.输入错误无法登陆，输入正确进入管理界面
