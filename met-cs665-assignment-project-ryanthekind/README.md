# Project Topic: Black Jack

# Github link - Ryan Burns
```bash
https://github.com/metcs/met-cs665-assignment-project-ryanthekind
```

# Project Questions:
• What are the design goals in your project? 

The design goals of my project was to make my application easy to read and be flexible.

• How is the flexibility, of your implementation, e.g., how you add or remove in future new types? 

I implemented the State pattern so a client can easily go into the State interface and add or remove any methods they see fit.

• How is the simplicity and understandability of your implementation? 

I believe my code is simple and easy to read. Comments have been included to explain methods in detail and I worked to make sure the names of variables, methods, and classes could be easily understood.

• How you avoided duplicated code?

In using design patterns I minimized any duplication of code. I tried to make sure every class and interface did one thing well.


# Cited Sources
```bash
https://www.youtube.com/watch?v=xLhgqPUHoVs&t=403s
```

```
https://www.newthinktank.com/2012/09/facade-design-pattern-tutorial/
```

```
https://www.baeldung.com/java-bridge-pattern
```


In developing the card game logic I referenced Kevin O's code to better wrap my mind about how I could effectively create a card game. 






# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




