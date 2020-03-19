package kz.iitu.employeepay.event.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class AppContextStoppedHandler implements ApplicationListener<ContextClosedEvent> {
    @Override
    public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {

    }
}
