Camel Project for Simple Rest DSL Example
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache Karaf.
You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/say-blueprint/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
Creating Rest DSL Example from Scratch
===========================================

1. Create Fuse Integration Project targeted for a Fuse 6.3 server that 
uses the Spring DSL.

2. Open the Source tab of the camel-context.xml Camel Context file.

3. Add "<restConfiguration component="netty-http" host="localhost" 
port="10000"/>" ahead of the <route> tag.

4. Add "<rest path="/say"><get uri="hello/{name}">
<to uri="direct:service-hello"/></get></rest>" between the 
<restConfiguration> and <rest> tags.

5. Change the <route> tag to: "<route id="service-hello">
<from id="_from1" uri="direct:service-hello"/><setBody id="_setBody1">
<simple>Hello ${header.name}</simple></setBody></route>"

6. Save the configuration.

7. Start the Fuse 6.3 server.
 
8. Once the Terminal has started, type "features:install camel-netty-http" 
to ensure that the 'netty-http' component is installed in the runtime.

9. In the Servers view, use the "Add/Remove" dialog to add your fuse 
project to the server. 

10. Open the Web Service Tester (Window->Show View->Other, JBoss Tools Web 
Services->Web Service Tester) or a web browser.

11. Type "http://localhost:10000/say/hello/world" in the URL field and hit 
the Enter key.

12. Look for "Hello world" as the Response Body in the Web Service Tester 
or in the Browser window.

