**此工程springsecurity练习项目，仅当作个人学习之用**

------

1、执行建表语句请查看ddl.sql文件
    数据库中测试号的密码进行了加密,密码皆为123456
| 数据表名      | 中文表名         | 备注说明 |
| :------------ | :--------------- | :------- |
| sys_user      | 系统用户表       | 基础表   |
| sys_menu      | 权限表           | 基础表   |
| sys_role      | 角色表           | 基础表   |
| sys_role_menu | 角色与权限关系表 | 中间表   |
| sys_user_role | 用户与角色关系表 | 中间表   |
2、执行单元测试类com.george.security.SecurityTest插入用户名、密码及用户角色

3、获取身份认证Token

​	 3.1、请求地址：http://127.0.0.1:8764/login/userLogin?username=george&password=123456

​     3.2、请求方式：POST

​     3.3、请求类型：form-data

4、根据Token获取用户信息

​	  4.1、请求地址：http://127.0.0.1:8764/user/info

​	  4.2、请求方式：GET

​      4.3、请求头：Authorization:George-eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiIzIiwic3ViIjoiZ2VvcmdlIiwiaWF0IjoxNTk2MjcwMzg2LCJpc3MiOiJnZW9yZ2UiLCJhdXRob3JpdGllcyI6Ilt7XCJhdXRob3JpdHlcIjpcIlJPTEVf5pmu6YCa6KeS6ImyXCJ9XSIsImV4cCI6MTU5NjM1Njc4Nn0.9j99tnn1e9XqzQLSYE98MmYddyA1OdJWi6-78g4ZqjjYgVgfoDZgKzjCq_Wl2xsxDmbiwvk_QaxzsiBo0Nj48A

5、根据Token获取管理员信息

​       5.1、请求地址：http://127.0.0.1:8764/admin/info

​       5.2、请求方式：GET

​	   5.3、请求头：Authorization:George-eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiIzIiwic3ViIjoiZ2VvcmdlIiwiaWF0IjoxNTk2MjcwMzg2LCJpc3MiOiJnZW9yZ2UiLCJhdXRob3JpdGllcyI6Ilt7XCJhdXRob3JpdHlcIjpcIlJPTEVf5pmu6YCa6KeS6ImyXCJ9XSIsImV4cCI6MTU5NjM1Njc4Nn0.9j99tnn1e9XqzQLSYE98MmYddyA1OdJWi6-78g4ZqjjYgVgfoDZgKzjCq_Wl2xsxDmbiwvk_QaxzsiBo0Nj48A