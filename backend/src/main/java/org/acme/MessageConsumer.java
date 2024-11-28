package org.acme;
import org.eclipse.microprofile.reactive.messaging.Incoming;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageConsumer {

    @Incoming("messages-in")
    public void consumeMessage(String message) {
        System.out.println("Received message: " + message);
    }
}