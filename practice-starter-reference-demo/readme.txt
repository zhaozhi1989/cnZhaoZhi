这是一个引入practicestart工程的练习项目，其主要目的是为了练习自定义starter之后的调用。
启动步骤：
1、打包命令: mvn clean package -Dmaven.test.skip=true
2、打开cmd窗口
3、进入cd D:\project\practice-starter-reference-demo\target文件夹下
4、启动服务
    4.1、运行支持减法方法
        java -Dgeorge.supportnegative=true -jar practicestarterreferencedemo-1.0-SNAPSHOT.jar
    4.2、运行不支持减法方法
        java -Dgeorge.supportnegative=false -jar practicestarterreferencedemo-1.0-SNAPSHOT.jar