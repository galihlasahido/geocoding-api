# geocoding-api for indonesian residential

Geocoding is the process of converting addresses (like a street address) into geographic coordinates (like latitude and longitude), which you can use to place markers on a map, or position the map.

Reverse geocoding is the process of converting geographic coordinates into a human-readable address.

You can also use the Geocoding API to find the address for a given place ID.

## Development

Before you can build this project, you must install and configure the following dependencies on your machine:

Run the following commands in two separate terminals to create a blissful development experience where your browser
auto-refreshes when files change on your hard drive.

    ./mvnw

get your api key from google console for the api to work

    https://console.cloud.google.com/
    
add your api key to config/application.properties file add append it to apiKey

## Running application

to run your application using maven command you can use 

    ./mvnw spring-boot:run 
    
you can access OpenApi definition by using your browser to :

    http://localhost:8081/webjars/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config
    
## Getting to production

to build your application into fat jar, you can run maven command using this

    ./mvnw clean install
    
where the result will be in folder target/, there you can find geocoding-api-1.0.0.jar and config folder, 
copy those two item into your server and you can run it by using

    java -jar geocoding-api-1.0.0.jar
    
or if you wanna run it in background you can use this command

    nohup java -jar geocoding-api-1.0.0.jar &