# firstFrame
springMVC+spring+mybatis-demo

这是一个SSM框架的基础DEMO,没有前端页面，就是一个单纯的后端框架，特别适合像我这样的菜鸟。
构建于IDEA的Maven项目，导入即可用。
跑起来之后浏览器输入 localhost:端口号/test/doTest.do
控制台输出“注解成功”,页面展示json字符串就代表跑通了。
{"flag":"Y","data":"XXXXXXXXXXXXXXXXX"}
里面结构非常简单 action->service->dao，特别容易理解。
pom.xml 应该是最少的jar包引用
运行环境请自行构建
有了基本的认识，后续想要集成shiro/ehcache/redis/等等就方便很多。

个人博客：https://759716722.github.io/blog/
这里是我平时的一些问题记录，不提供详细的搭框架步骤，遇到问题才能成长。
