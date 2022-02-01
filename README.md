# rabbitmq hello-world

## pre setup
    docker run --rm -d --name rabbit-docker -p 5671:5671 -p 5672:5672 -p 15672:15672 rabbitmq:3.8.9-management

## build
    mvn clean package -Dmaven.test.skip=true

## test 
    java -jar target/rabbitmq-amqp-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=sender && \
    java -jar target/rabbitmq-amqp-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=receiver

## rabbitMQ admin console
    http://localhost:15672/#/queues
    guest/ guest
    