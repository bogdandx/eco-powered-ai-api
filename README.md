# Eco-Powered AI

## Setup Instructions


### Getting the codebase
* Clone the code repository using the following command:
```git clone https://github.com/bogdandx/eco-powered-ai-api.git```

### Option 1. Running the app in a Docker container
* Ensure you have Docker installed and the daemon is running
* Open a terminal window and type and navigate to the directory containing the code (eco-powered-ai-api)
* Build the docker image using the command ```docker build -t eco-powered-image```
* Once the image is built, it's time to run the container. In order to run the container and be able to access the API from outside the container we need to map the 8080 port on your machine with the port inside the container using the following command: ```docker run -p 8080:8080 eco-powered-image```
* Let's now test the application is running correctly in your Docker container. To do that open a web browser and access the following URL: http://localhost:8080/universe-meaning/test. You should see the following result displayed: **This AI is super green eco-powered and sustainable. The meaning of the universe is test.**

#### Stopping the Docker container
* To stop the Docker container you will need to first look up the identifier that Docker automatically assigned to the running container. 
* In a new terminal window type the following command: ```docker ps``` This will list all the running containers. Look up the container corresponding to the image **eco-powered-image**. Copy its name to the clipboard.
* Run the following command to stop the container: ```docker stop {container name}```

### Option 2. Running the app in IntelliJ IDEA
* Ensure you have Java 17 or higher. You can install the latest JDK from https://www.oracle.com/java/technologies/downloads/
* Launch IntelliJ IDEA and open the project from eco-powered-ai-api directory.
* Open the terminal window in IDEA and type the following command to run the automated tests provided: ```mvn test```
* Alternatively, right-click on the java package under src/test and select 'Run All Tests'
* You can run the application by right-clicking the Application class under src/main/java and selecting 'Run Application'

## Using the API
* You can access the API using the following endpoint [http://{host}:{port}/universe-meaning/{param}](http://{host}:{port}/universe-meaning/{param})
* If you are running locally in a Docker container the host and port values are localhost and 8080. Otherwise, fill in those with the details of the host and port the application is running under.
* The **param** is a string value with no spaces. For example: 'apple' or 'planet-Mars' are valid values
* The API will provide a String response such as: **This AI is super green eco-powered and sustainable. The meaning of the universe is apple.**
* The returned HTTP status code will be 200.