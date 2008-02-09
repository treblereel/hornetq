/*
 * JBoss, Home of Professional Open Source
 *
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */

package org.jboss.jms.client.api;

import org.jboss.messaging.core.Message;
import org.jboss.messaging.util.MessagingException;

/**
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
 */
public interface ClientProducer
{        
   void send(String address, Message message) throws MessagingException;
   
   void registerAcknowledgementHandler(AcknowledgementHandler handler);
   
   void unregisterAcknowledgementHandler(AcknowledgementHandler handler);
      
   void close() throws MessagingException;
   
   boolean isClosed();   
}
