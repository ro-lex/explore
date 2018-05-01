# URLs

## Health
GET http://localhost:8080/jersey-app/health
Content-Type:application/json
Accept:application/text

Healthy!


## Request
GET
http://localhost:8080/jersey-app/process
Content-Type:application/json
Accept:application/json

{
    "status": "processed"
}
