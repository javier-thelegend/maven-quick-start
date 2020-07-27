# maven-quick-start
Sample Project to Use Maven
<br/>
# Commands <br/>
<br/>
**Note: All this commands must be executed in root of project<br/>
mvn compile -- Compile the project <br/>
mvn package -- Create target folder with .class and .jar file <br/>
mvn clean 	-- Delete target folder and left ready to generate it again</br>
mvn install -- Create and Move the .jar to .m2 folder including all dependencies and things</br>
mvn dependency:tree -- Download all dependencies</br>
mvn dependency:tree > file.txt -- Enviar contenido de log a archivo en lugar de consola</br>
mvn dependency:copy-dependencies -- Copiar las dependenias a mi proyecto debo usarlo cada vez que haga clean segun parece sino no baja las jar
java -cp "....jar :target/dependency/*" clinic.programming.training.Application -- Ejecutar clase e incluir dependencia
<br/>	
**Note: You can execute more than one command at the same time<br/>
mvn clean package	--Example<br/>
