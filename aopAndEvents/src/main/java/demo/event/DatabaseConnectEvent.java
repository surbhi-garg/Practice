package demo.event;

import org.springframework.context.ApplicationEvent;

public class DatabaseConnectEvent extends ApplicationEvent {
    public DatabaseConnectEvent(Object source)
    {
        super(source);
    }
}
