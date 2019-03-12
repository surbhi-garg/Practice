package demo.listeners;

import demo.event.DatabaseConnectEvent;
import org.springframework.context.ApplicationListener;

public class DatabaseConnectListener implements ApplicationListener<DatabaseConnectEvent> {
    @Override
    public void onApplicationEvent(DatabaseConnectEvent event) {
        System.out.println("Database connect event called");
    }
}
