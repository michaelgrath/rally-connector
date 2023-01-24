package at.itmatters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class ApplicationListener {

    private static Logger LOG = LoggerFactory.getLogger(ApplicationListener.class);

    @Value("${server.port}")
    private int serverPort;

        @EventListener
        public void handleContextStart(ContextStartedEvent cse) {
            LOG.info("==================================================================");
            LOG.info("RALLY Connector");
            LOG.info("------------------------------------------------------------------");
            LOG.info("Port:          " + serverPort);
            LOG.info("==================================================================");
            System.out.println("Handling context started event.");
        }
}