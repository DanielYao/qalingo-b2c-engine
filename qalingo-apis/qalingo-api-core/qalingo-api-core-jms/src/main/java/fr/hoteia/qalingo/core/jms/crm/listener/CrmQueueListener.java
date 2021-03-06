package fr.hoteia.qalingo.core.jms.crm.listener;

import java.beans.ExceptionListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

@Component(value = "crmQueueListener")
public class CrmQueueListener implements MessageListener, ExceptionListener {

    protected final Log logger = LogFactory.getLog(getClass());

    /**
     * Implementation of <code>MessageListener</code>.
     */
    public void onMessage(Message message) {
        try {
            if (message instanceof TextMessage) {
                TextMessage tm = (TextMessage) message;
                String valueJMSMessage = tm.getText();
                if (logger.isDebugEnabled()) {
                    logger.debug("Processed message, value: " + valueJMSMessage);
                }
            }
        } catch (JMSException e) {
            logger.error(e.getMessage(), e);
        }
    }
    
    @Override
    public void exceptionThrown(Exception e) {
        logger.debug("Exception on queue listener: " + e.getCause() + ":" + e.getLocalizedMessage());
    }

}