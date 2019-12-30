# my-spring

手写Spring(通过servlet启动的spring)

## 整体思路：

### 配置阶段

1. web.xml dispatcherServert 由spring提供的

2. init-param classpath:application.xml contextConfigLocation

3. url  /*

### 初始化、启动阶段

1. init 加载spring配置文件

2. IOC初始化 申明一个IOC容器，Map<String,Object>

3. scan-package 配置一个包路径，扫描到相关的类

4. 实例化 将扫描到的类，利用反射机制实例化，并保存到IOC容器中去

5. 依赖注入（DI）自动给IOC容器中的需要赋值的属性赋值

6. HandlerMapping 将一个url对应一个methed，将对应关系保存起来

### 运行阶段，等待请求

1. doGet/doPost request、response
2. 从HandlerMapping 通过request获取url，然后再去HandlerMapping
3. invoker 用反射调用Method
4. response.write()

参考文章：https://icode.blog.csdn.net/article/details/96505433