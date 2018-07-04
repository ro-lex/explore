spring-cloud-config ralex$ curl localhost:8888/app-one/default
{"name":"app-one","profiles":["default"],"label":null,"version":"0952632b97beb122c14b0f40bc599ba1095e5fbf","state":null,"propertySources":[{"name":"/tmp/spring-cloud-config-git/app-one.properties","source":{"greeting-message":"Hey There, this is App One!"}}]}
spring-cloud-config ralex$ curl localhost:8888/app-one/prod
{"name":"app-one","profiles":["prod"],"label":null,"version":"0952632b97beb122c14b0f40bc599ba1095e5fbf","state":null,"propertySources":[{"name":"/tmp/spring-cloud-config-git/app-one-prod.properties","source":{"greeting-message":"Hey There Prod, this is App One!"}},{"name":"/tmp/spring-cloud-config-git/app-one.properties","source":{"greeting-message":"Hey There, this is App One!"}}]} 

