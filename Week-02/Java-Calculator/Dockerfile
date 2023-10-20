
FROM amazoncorretto:17.0.0-alpine
WORKDIR /calculator-app

ADD target/calculator-1.0.jar .

ENTRYPOINT ["java", "-jar", "/calculator-app/calculator-1.0.jar"]
CMD ["10","10", "+"]
