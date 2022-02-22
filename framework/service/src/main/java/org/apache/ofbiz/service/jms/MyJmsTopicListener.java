package org.apache.ofbiz.service.jms;

import org.apache.ofbiz.base.util.Debug;
import org.apache.ofbiz.entity.Delegator;

import javax.jms.JMSException;
import javax.jms.Message;
import java.util.Enumeration;

public class MyJmsTopicListener extends JmsTopicListener{
    /**
     * Creates a new JmsTopicListener - Should only be called by the JmsListenerFactory.
     *
     * @param delegator
     * @param jndiServer
     * @param jndiName
     * @param topicName
     * @param userName
     * @param password
     */
    public MyJmsTopicListener(Delegator delegator, String jndiServer, String jndiName, String topicName, String userName, String password) {
        super(delegator, jndiServer, jndiName, topicName, userName, password);
    }

    @Override
    public void onMessage(Message message) {
        try {
            Enumeration propertyNames = message.getPropertyNames();
            Debug.logInfo("got message! " + message, module);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
