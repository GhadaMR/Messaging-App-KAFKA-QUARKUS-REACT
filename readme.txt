Démarrez docker 

cd C:\kafka_2.12-3.9.0\bin\windows


Démarrez zookeeper avec la commande suivante :
zookeeper-server-start.bat ../../config/zookeeper.properties


Démarrez Kafka avec la commande suivante :
kafka-server-start.bat ../../config/server.properties


Ensure Kafka is running before creating the topic by starting the Kafka server with:
kafka-server-start.bat config\server.properties


Créer un topic Kafka :
kafka-topics.bat --create --topic messages --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1


Vérifiez que le topic a été créé :
kafka-topics.bat --list --bootstrap-server localhost:9092



Testing Kafka:
Producer: Open a new terminal and run the following command to send a test message:
kafka-console-producer.bat --broker-list localhost:9092 --topic messages
Then, type a message and hit Enter. The message should be sent to Kafka.



Consumer: In another terminal, consume the message from the test topic:
kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic messages --from-beginning
If everything is set up correctly, you should see the message you typed in the producer terminal.