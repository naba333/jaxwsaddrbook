repositories {
	jcenter()
	mavenCentral()
}

plugins {
	java
	war
}

dependencies {

	providedCompile (group = "javax", name = "javaee-api", version = "8.0.1")
	//compile ("javax.ejb:javax.ejb-api:3.2.2")
	//compile (group = "jakarta.ejb", name = "jakarta.ejb-api", version = "3.2.6")
	//compile ("javax.annotation:javax.annotation-api:1.3.2")
	//compile (group = "jakarta.annotation", name = "jakarta.annotation-api", version = "1.3.5")

	//compile ("javax.jws:javax.jws-api:1.1")
	//compile (group = "jakarta.xml.ws", name = "jakarta.xml.ws-api", version = "2.3.2")
	//providedCompile 'javax.validation:validation-api:2.0.1.Final'
	//providedCompile 'javax.ws.rs:javax.ws.rs-api:2.1.1'
	//providedCompile 'javax.enterprise:cdi-api:2.0.SP1'

	compile ("org.hibernate:hibernate-agroal:5.3.6.Final")

	//compile group: 'javax.persistence', name: 'javax.persistence-api', version: '2.2'
	//compile group: 'javax.ejb', name: 'javax.ejb-api', version: '3.2.2'
}