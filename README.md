# boot-swagger-exception
test case showing error with springfox


```
$ mvn spring-boot:run
```

[http://localhost:8080/v2/api-docs](http://localhost:8080/v2/api-docs)

```
2015-11-19 16:02:04.052 ERROR 2232 --- [nio-8080-exec-2] o.a.c.c.C.[.[.[/].[dispatcherServlet]    : Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is java.lang.ArrayIndexOutOfBoundsException: 1] with root cause

java.lang.ArrayIndexOutOfBoundsException: 1
	at java.util.Arrays$ArrayList.get(Arrays.java:3841)
	at springfox.documentation.swagger2.mappers.ModelMapper.typeOfValue(ModelMapper.java:97)
	at springfox.documentation.swagger2.mappers.ModelMapper.mapProperties(ModelMapper.java:85)
	at springfox.documentation.swagger2.mappers.ModelMapper.mapModels(ModelMapper.java:62)
	at springfox.documentation.swagger2.mappers.ModelMapper.modelsFromApiListings(ModelMapper.java:163)
	at springfox.documentation.swagger2.mappers.ServiceModelToSwagger2MapperImpl.mapDocumentation(ServiceModelToSwagger2MapperImpl.java:49)
	at springfox.documentation.swagger2.web.Swagger2Controller.getDocumentation(Swagger2Controller.java:75)
...
```
