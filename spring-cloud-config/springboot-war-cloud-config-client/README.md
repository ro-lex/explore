### Retrieve Config: 
ralex$ curl localhost:8080/deployable-config-client/configs/applications/one
Config as seen on client: Hey There, this is App One!

### Commit change to Git and retrieve config (But before refreshing using Actuator Refresh): 
ralex$ curl localhost:8080/deployable-config-client/configs/applications/one
Config as seen on client: Hey There, this is App One!

### Refresh using Actuator: 
spring-cloud-config ralex$ curl -d {} -H "Content-Type:application/json" localhost:8080/deployable-config-client/actuator/refresh
["config.client.version","greeting-message"]

### Retrieve Config again: 
spring-cloud-config ralex$ curl localhost:8080/deployable-config-client/configs/applications/one
Config as seen on client: Hey There, this is App One. The first change was made to this entry!
