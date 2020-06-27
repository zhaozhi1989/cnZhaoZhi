执行mvn clean install -Dmaven.test.skip=true -U命令上传工程到本地仓库(不附带源码)
上传源码2种方式：
第一种以命令方式运行：mvn clean source:jar install -Dmaven.test.skip=true -U
第二种在pom文件中添加以下内容：
<build>
    <plugins>
        <!-- Source attach plugin -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-source-plugin</artifactId>
            <executions>
                <execution>
                    <id>attach-sources</id>
                    <goals>
                        <goal>jar</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>

practice-add 加法服务
practice-minus 减法服务
practice-api 接口及异常定义
practice-service-starter starter启动器