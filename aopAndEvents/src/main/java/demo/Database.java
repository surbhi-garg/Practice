package demo;

import demo.event.DatabaseConnectEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Database implements ApplicationEventPublisherAware {
    private int port;
    private String name;
    private ApplicationEventPublisher applicationEventPublisher;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void connect()
    {
        System.out.println("Connecting to database with port "+port+" and name "+name);
        applicationEventPublisher.publishEvent(new DatabaseConnectEvent(this));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;

    }
}
