repositories {
	jcenter()
	mavenCentral()
}

plugins {
	java
	application

	//id("uk.co.boothen.gradle.wsimport") version "0.15"
}



application {
    mainClassName = "com.absi.jaxwsaddrbook.client.Client"
}



dependencies {
	//compile ("javax.ejb:javax.ejb-api:3.2.2")
	//compile ("javax.annotation:javax.annotation-api:1.3.2")
	//compile ("javax.jws:javax.jws-api:1.1")
	//compile ("javax.xml.ws:jaxws-api:2.3.1")
	//runtime (group = "com.sun.xml.ws", name = "jaxws-rt", version = "2.3.2", ext = "pom")
	//runtime (group = "com.sun.org.apache.xml.internal", name = "resolver", version = "20050927")
	//compile group: 'com.sun.xml.ws', name: 'jaxws-rt', version: '2.3.2', ext: 'pom'


	compile(project(":webapp"))
}

//wsimport {
//    wsdl("http://localhost:8080/webapp/AddressBookInterfaceImpl?wsdl")
//}