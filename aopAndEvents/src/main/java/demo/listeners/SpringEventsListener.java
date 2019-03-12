package demo.listeners;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

//Question2---->Listener for all spring events
public class SpringEventsListener implements ApplicationListener<ApplicationEvent>{
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("----------Event triggerred--------"+event.getClass());
    }
}
