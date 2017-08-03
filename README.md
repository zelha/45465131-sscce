# Embedded UI add-on with Spring boot

This example is in the purpose of reproducing the issue explained in [this thread](https://stackoverflow.com/questions/45465131).

## Running the example

Compile the example:

```
git clone https://github.com/zelha/45465131-sscce.git
cd 45465131-sscce
mvn package
```
Run the 3 applications in 3 separate terminals:

```
cd bootapp
mvn spring-boot:run
```

```
cd embedded2
mvn jetty:run
```

```
cd host
mvn jetty:run
```

Point your browser to <http://localhost:8080> and see how the vaadin `embdded2` application is rendered, but `bootapp` doesn't load due to the issue explained in the thread.



## Known issues 

Application `bootapp` needs to have a session id in order to properly be embedded. This will be updated soon.  



