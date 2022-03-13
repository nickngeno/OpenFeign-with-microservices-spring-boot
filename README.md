# OpenFeign-with-microservices-spring-boot
These are three spring boot java applications that i have created to showcase how you can use OpenFeign http client to make rest api calls to 
other applications.
# Architecture
I have used Eureka Netflix server to serve and manage my two microservices both running as eureka clients.
The architecture is pretty straightforward and as simple as possible since I just wanted to demostrate how communication happends.
# How to run the applications
Clone the repo then open  each folder as an application of it own. 
Solve the dependecy issues by running mvn clean install command on your terminal. Make sure to have a working internet connections as this will connect to maven repository in cloud.
Finally run the applications starting by running the eureka server application, ms-book (which is a producer), and finally ms-student (which a consumer).The applications should run well
and you can go ahead and do the testing 
# Testing the applciations
There are 3 endpoints in the application and they include: \
/student/api/book/data   =====> returns a string of the current port at which the priducer service is running \
/student/api/books/{id} =====> returns details of a particular book \
/student/api/books/all  =====> returns all available books

## Happy coding 👍
