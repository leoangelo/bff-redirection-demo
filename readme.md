# Readme

## Prerequisites
- JDK 11
- Latest Gradle 

## To run
````
./gradlew bootRun
````

## Testing
````
curl -v http://localhost:8080/redirect -H "Content-Type: application/json" -d '{"authCode": "12313123213131231"}'
````

## Output
````
*   Trying ::1:8080...
* Connected to localhost (::1) port 8080 (#0)
> POST /redirect HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.77.0
> Accept: */*
> Content-Type: application/json
> Content-Length: 33
> 
* Mark bundle as not supporting multiuse
< HTTP/1.1 302 
< Location: http://localhost:3000?authCode=12313123213131231
< Content-Length: 0
< Date: Thu, 17 Mar 2022 10:50:30 GMT
< 
* Connection #0 to host localhost left intact
````