# Spring boot s runnable war with active profile

## dev
mvn clean package -P dev

need create folder with name resource-dev, put application-properties  with dev configuration

## prod
mvn clean package -P prod

need create folder with name resource-prod, put application-properties  with prod configuration

<profiles>
    <profile>
        <id>dev</id>
        <activation>
            <activeByDefault>true</activeByDefault>
        </activation>
        <build>
            <resources>
                <resource>
                    <directory>${basedir}/src/main/resources-dev</directory>
                </resource>
            </resources>
        </build>
    </profile>
    <profile>
        <id>prod</id>
        <build>
            <resources>
                <resource>
                    <directory>${basedir}/src/main/resources-prod</directory>
                </resource>
            </resources>
        </build>
    </profile>
</profiles>
