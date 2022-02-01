# rabbitmq hello-world

## build
    mvn clean package

## test
    java -jar target/rabbitmq-amqp-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,sender
    java -jar target/rabbitmq-amqp-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=hello-world,receiver
    