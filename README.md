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