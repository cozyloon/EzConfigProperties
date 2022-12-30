[![Maven Central](https://img.shields.io/maven-central/v/io.github.cozyloon/ezconfig.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22io.github.cozyloon%22%20AND%20a:%22ezconfig%22)


>You can easily access your Java properties file and Java Loggers now.
>No need to waste your time for configure it again.
>Accessing Java properties, and Java loggers is now easy.

### How to use EzConfig?

EzConfig is a Java library that provides a simple and convenient way to manage configuration files in a Java application. To use the EzConfig library in your Maven project, you will need to add it as a dependency in your project's pom.xml file. Here's an example of how you can do this:

First, add the following dependency to your pom.xml file:

```
<dependency>
    <groupId>io.github.cozyloon</groupId>
    <artifactId>ezconfig</artifactId>
    <version>1.0</version>
</dependency>
```
You can download the latest one here -> [EzConfig](https://mvnrepository.com/artifact/io.github.cozyloon/ezconfig)

Once you have added the repository and dependency to your pom.xml file, you can import the EzConfig library in your Java code using the following import statement:
`import io.github.cozyloon.EzConfig;`

Create `config.properties` file in this path `"/src/main/resources/config.properties"`. That's it. 

>Now you can easily access the config file by using `EzConfig.getProperty("");`
```public static final String EXAMPLE = EzConfig.getProperty("");```

>Now you can easily access the logger by using `EzConfig.logInfo("");` `EzConfig.logWarning("");` and `EzConfig.logError("");`


