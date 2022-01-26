# medtrakker-svcs
this will be a Service with REST api's that will allow you to keep track of personal medical stats.  These stats can be blood gluscoes, heart beat.

# Configuration
in the application.yaml need to define your postgres url:

```
spring:
  datasource:
    url: jdbc:postgresql://localhost:5435/medtrakker
    username: <your username>
    password: <your password>
```

# API's
## /api/all
This api will return all items in the database. Because careful with this as the items in the database maybe large


