# autolink-common
### How to deploy github package
#### add settings.xml in .m2/ with the following
    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
        <servers>
            <server>
                <id>github</id>
                <username>your-username</username>
                <password>your-personal-access-token</password>
            </server>
        </servers>

    </settings>
#### deploy command with profile github
    mvn -Pgithub deploy

### How to use the maven package:
#### add settings.xml in .m2/ with the following
    <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">
        <servers>
            <server>
                <id>github</id>
                <username>your-username</username>
                <password>your-personal-access-token</password>
            </server>
        </servers>

    </settings>
#### add the dependency in the dependencies section in pom.xml
    <dependencies>
        ...
        <dependency>
            <groupId>net.cloudcentrik.autolink</groupId>
            <artifactId>common</artifactId>
            <version>latest-version-number</version>
        </dependency>
        ...
    </dependencies>
#### add the repository in repositories section in pom.xml
    <repositories>
        ...
        <repository>
            <id>github</id>
            <name>GitHub autolink-common Maven Packages</name>
            <url>https://maven.pkg.github.com/ismailfakir/autolink-common</url>
            <snapshots><enabled>true</enabled></snapshots>
            <releases><enabled>true</enabled></releases>
        </repository>
        ...
	</repositories>
#### install the dependency
    mvn install