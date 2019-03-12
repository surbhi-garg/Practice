package demo.listeners;

import org.springframework.context.event.*;


//Question2-->In case we want to do separate things on each event in single listener
public class SpringMultiEventListener {

    @EventListener(ContextRefreshedEvent.class)
    public void referesh(){
        System.out.println("Listening to refresh event");
    }
    @EventListener(ContextStartedEvent.class)
    public void start()
    {
        System.out.println("Listening to start event");
    }
    @EventListener(ContextStoppedEvent.class)
    public void stop()
    {
        System.out.println("Listening to stop event");
    }
    @EventListener(ContextClosedEvent.class)
    public void close()
    {
        System.out.println("Listening to close event");
    }
}
