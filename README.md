# firstFrame
springMVC+spring+mybatis-demo

1.这是一个SSM框架的基础DEMO,没有前端页面，就是一个单纯的后端框架。

2.项目结构非常简化，目的就是为了有一个基本的认识，所以特别容易理解。

3.构建于IDEA的Maven项目，导入即可用。跑起来之后浏览器输入 localhost:端口号/test/doTest.do 控制台输出“注解成功”,页面展示json字符串就代表跑通了。{"flag":"Y","data":"XXXXXXXXXXXXXXXXX"}

4.pom.xml 应该是最少的jar包引用，数据库用的sqlserver，不一样的请自行换驱动

5.表结构
CREATE TABLE student(
isid int PRIMARY KEY IDENTITY(1,1) ,
name varchar(30),
sex varchar(2) ,
address varchar(30)
)

6.运行环境请自行构建

有了基本的认识，后续想要集成shiro/ehcache/redis/等等就方便很多。

个人博客：https://759716722.github.io/blog/
这里是我平时的一些问题记录。
