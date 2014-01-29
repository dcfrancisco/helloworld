Jahia Hello World module
========================

This module is designed to be a minimal example of how to create a Jahia module.

Requirements
------------

In order to use this example you will need :
- Apache Maven 3.0 or more recent
- Jahia 7.0+ (for Jahia 6.6+ use the code from the 1_x branch)

Features
--------

- A content definition to store the name of the person we will be saying hello to
- A view for the corresponding content definition
- A resource bundle file

Compiling
---------

Use the following Maven command to compile the project:

    mvn clean install

Deploying
---------

Edit your Maven settings.xml (usually in ~/.m2/settings.xml) to add the following profile :

        <profile>
            <id>jahia-server</id>
            <properties>
                <jahia.deploy.targetServerType>tomcat</jahia.deploy.targetServerType>
                <jahia.deploy.targetServerVersion>7</jahia.deploy.targetServerVersion>
                <jahia.deploy.targetServerDirectory>/Users/loom/java/packages/Jahia_xCM_v7.0.0.0/tomcat</jahia.deploy.targetServerDirectory>
            </properties>
        </profile>

Make sure you modify the jahia.deploy.targetServerDirectory to point to the /tomcat directory inside your Jahia installation.

Then you should be able to deploy your module using the following Maven command:

    mvn prepare jahia:deploy -P jahia-server

Feel free to change the profile name to whatever you please, it is not important to keep it to jahia-server

Also please remember that in order to see the module in edit mode on a site, you will first have to deploy it onto the
site. In order to that, switch to the "Studio" in the top bar in Jahia's Edit mode, then in the left panel select
"Module" from the first dropdown and then select your module. You can then use the "Deploy" menu to deploy to your
website. Once this is done your module will be available in the "Components" tab in the left panel.