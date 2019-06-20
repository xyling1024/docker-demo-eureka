# docker-demo-eureka
一个简单的上传docker镜像到仓库的demo。

使用步骤：
修改pom.xml文件。
进入当前项目路径后，执行命令：
```mvn clean package docker:build -DpushImage -Dspring.profiles.active=default```

执行成功后，登录docker服务器，使用```docker images```命令，能看到上传的镜像。

运行docker容器：```docker run -di --net=host --name=eureka4 0ee88018fe88```

注意：--net=host必须在--name前面，否则net设置不生效。











