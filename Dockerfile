FROM openjdk:17-oracle
ADD target/mobileShopService-0.0.1.jar mobileShopService-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","mobileShopService-0.0.1.jar"]