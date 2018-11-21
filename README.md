# Getdown Maven Plugin Example 1

## [Table of Contents:](#table-of-contents)

### 1. [Summary](#summary)
### 2. [Configuration](#configuration)

***

## [Summary:](#summary)

This example shows an implementation of our [webstart2getdown-maven-plugin](https://github.com/thomasX/webstart2getdwon-maven-plugin/). You can easily run this example by yourselfe by following these steps:

> 1. download [getdown-1.7.1.jar](https://repo.maven.apache.org/maven2/com/threerings/getdown/1.7.1/getdown-1.7.1.jar)
> 2. create an empty folder somwhere on your pc (eg. `C:\users\testuser\desctop\webstart2getdown\`)
> 3. copy the downloaded `getdown-1.7.1.jar` into this empty folder
> 4. create a subdirectory named `example1` (eg.`C:\users\testuser\desctop\webstart2getdown\example1`)
> 5. create a `getdown.txt` in this subfolder (eg. `C:\users\testuser\desctop\webstart2getdown\example1\getdown.txt`)
> 6. add the following line to `getdown.txt`: `appbase = https://thomasx.github.io/webstart2getdown-maven-plugin-example1/getdown/`
> 7. start the example with the following command `java -jar getdown-1.7.1.jar example1`

## [Configuration:](#configuration)

The following section shows the webstart2getdown-maven-plugin configuration in the POM.xml file. 

```XML
<project>
  ...
  <dependencies>
    ...
    <!-- getdown -->
    ...
  </dependencies>
  ...
  <build>
    ...
    <!-- webstart-maven-plugin -->
    ...
  <plugin>
    <groupId>info.margreiter.getdown</groupId>
    <artifactId>webstart2getdown-maven-plugin</artifactId>
    <version>1.0.2</version>   <!-- version can be different -->
      <executions>
        <execution>	
          <phase>package</phase>
            <goals>
              <goal>getdowntxt</goal>
              <goal>digest</goal>
            </goals>
          <configuration>
            <jnlpfile>${project.build.directory}/jnlp/webstart2getdownExample1.jnlp</jnlpfile>
            <appbase>https://thomasX.github.io/webstart2getdown-maven-plugin/getdown/</appbase>
            <appdir>${project.build.directory}/getdown/</appdir>
            <version></version>
            <allow_offline>false</allow_offline>
  
            <ui_background>FF0000</ui_background>
            <ui_background_image>img/w2gImage.png</ui_background_image>
            <ui_error_background></ui_error_background>
            <ui_icon>img/w2gicon_16_16.gif</ui_icon>
            <ui_progress>10,310,260,20</ui_progress>
            <ui_progress_bar>00FF05</ui_progress_bar>
            <ui_progress_text>000000</ui_progress_text>
            <ui_progress_image></ui_progress_image>
            <ui_status>10,285,260,20</ui_status>
            <ui_status_text>000000</ui_status_text>
            <ui_text_shadow></ui_text_shadow>
            <ui_hide_decorations>false</ui_hide_decorations>
            <ui_min_show_seconds>10</ui_min_show_seconds>
            <ui_install_error>https://github.com/thomasX/webstart2getdown-maven-plugin</ui_install_error>
            <ui_mac_dock_icon>img/w2gicon_16_16.gif</ui_mac_dock_icon>
  
            <jvmargs>
              <jvmarg></jvmarg>
            </jvmargs>
            <appargs>
              <apparg></apparg>
            </appargs>
  
            <!-- for signing we used a selfsigned demokey, however if you want to use this plugin/example
                 in production, change the attributes below with the real keystore information -->
            <keystore>${project.basedir}/src/main/keys/demokey.jks</keystore>
            <storepass>changeit</storepass>
            <alias>demokey</alias>
          </configuration>
        </execution>
      </executions>
    </plugin>
    ...
  </build>
  ...
  <pluginRepositories>
    <pluginRepository>
      <id>getdown-maven-github-repo</id>
      <url>https://thomasx.github.io/webstart2getdown-maven-plugin/</url>
      <snapshots>
        <enabled>true</enabled>
        <updatePolicy>always</updatePolicy>
      </snapshots>
    </pluginRepository>
  </pluginRepositories>
  ...
</project>
```

***

**by** [thomasX](https://github.com/thomasX) and [Maz47](https://github.com/Maz47)
