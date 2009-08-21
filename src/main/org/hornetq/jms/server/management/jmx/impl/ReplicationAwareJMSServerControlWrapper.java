/*
 * Copyright 2009 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package org.hornetq.jms.server.management.jmx.impl;

import java.util.Map;

import javax.management.ListenerNotFoundException;
import javax.management.MBeanInfo;
import javax.management.MBeanNotificationInfo;
import javax.management.NotificationEmitter;
import javax.management.NotificationFilter;
import javax.management.NotificationListener;

import org.hornetq.core.management.ReplicationOperationInvoker;
import org.hornetq.core.management.ResourceNames;
import org.hornetq.core.management.impl.MBeanInfoHelper;
import org.hornetq.core.management.jmx.impl.ReplicationAwareStandardMBeanWrapper;
import org.hornetq.jms.server.management.JMSServerControl;
import org.hornetq.jms.server.management.impl.JMSServerControlImpl;

/**
 * A ReplicationAwareJMSServerControlWrapper
 *
 * @author <a href="jmesnil@redhat.com">Jeff Mesnil</a>
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>
 */
public class ReplicationAwareJMSServerControlWrapper extends ReplicationAwareStandardMBeanWrapper implements
         JMSServerControl, NotificationEmitter
{

   // Constants -----------------------------------------------------

   // Attributes ----------------------------------------------------

   private final JMSServerControlImpl localControl;

   // Static --------------------------------------------------------

   // Constructors --------------------------------------------------

   public ReplicationAwareJMSServerControlWrapper(final JMSServerControlImpl localControl,
                                                  final ReplicationOperationInvoker replicationInvoker) throws Exception
   {
      super(ResourceNames.JMS_SERVER, JMSServerControl.class, replicationInvoker);
      this.localControl = localControl;
   }

   // JMSServerControlMBean implementation --------------------------

   public boolean closeConnectionsForAddress(final String ipAddress) throws Exception
   {
      return localControl.closeConnectionsForAddress(ipAddress);
   }

   public void createConnectionFactory(final String name,
                                       final String discoveryAddress,
                                       final int discoveryPort,
                                       final String clientID,
                                       final long discoveryRefreshTimeout,
                                       final long clientFailureCheckPeriod,
                                       final long connectionTTL,
                                       final long callTimeout,
                                       final int maxConnections,
                                       final boolean cacheLargeMessageClient,
                                       final int minLargeMessageSize,
                                       final int consumerWindowSize,
                                       final int consumerMaxRate,
                                       final int producerWindowSize,
                                       final int producerMaxRate,
                                       final boolean blockOnAcknowledge,
                                       final boolean blockOnPersistentSend,
                                       final boolean blockOnNonPersistentSend,
                                       final boolean autoGroup,
                                       final boolean preAcknowledge,
                                       final String loadBalancingPolicyClassName,
                                       final int transactionBatchSize,
                                       final int dupsOKBatchSize,
                                       final long initialWaitTimeout,
                                       final boolean useGlobalPools,
                                       final int scheduledThreadPoolMaxSize,
                                       final int threadPoolMaxSize,
                                       final long retryInterval,
                                       final double retryIntervalMultiplier,
                                       final int reconnectAttempts,
                                       final boolean failoverOnServerShutdown,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             discoveryAddress,
                             discoveryPort,
                             clientID,
                             clientFailureCheckPeriod,
                             connectionTTL,
                             callTimeout,
                             maxConnections,
                             cacheLargeMessageClient,
                             minLargeMessageSize,
                             consumerWindowSize,
                             consumerMaxRate,
                             producerWindowSize,
                             producerMaxRate,
                             blockOnAcknowledge,
                             blockOnPersistentSend,
                             blockOnNonPersistentSend,
                             autoGroup,
                             preAcknowledge,
                             loadBalancingPolicyClassName,
                             transactionBatchSize,
                             dupsOKBatchSize,
                             initialWaitTimeout,
                             useGlobalPools,
                             scheduledThreadPoolMaxSize,
                             threadPoolMaxSize,
                             retryInterval,
                             retryIntervalMultiplier,
                             reconnectAttempts,
                             failoverOnServerShutdown,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String discoveryAddress,
                                       final int discoveryPort,
                                       final String clientID,
                                       final long discoveryRefreshTimeout,
                                       final long clientFailureCheckPeriod,
                                       final long connectionTTL,
                                       final long callTimeout,
                                       final int maxConnections,
                                       final boolean cacheLargeMessageClient,
                                       final int minLargeMessageSize,
                                       final int consumerWindowSize,
                                       final int consumerMaxRate,
                                       final int producerWindowSize,
                                       final int producerMaxRate,
                                       final boolean blockOnAcknowledge,
                                       final boolean blockOnPersistentSend,
                                       final boolean blockOnNonPersistentSend,
                                       final boolean autoGroup,
                                       final boolean preAcknowledge,
                                       final String loadBalancingPolicyClassName,
                                       final int transactionBatchSize,
                                       final int dupsOKBatchSize,
                                       final long initialWaitTimeout,
                                       final boolean useGlobalPools,
                                       final int scheduledThreadPoolMaxSize,
                                       final int threadPoolMaxSize,
                                       final long retryInterval,
                                       final double retryIntervalMultiplier,
                                       final int reconnectAttempts,
                                       final boolean failoverOnServerShutdown,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             discoveryAddress,
                             discoveryPort,
                             clientID,
                             clientFailureCheckPeriod,
                             connectionTTL,
                             callTimeout,
                             maxConnections,
                             cacheLargeMessageClient,
                             minLargeMessageSize,
                             consumerWindowSize,
                             consumerMaxRate,
                             producerWindowSize,
                             producerMaxRate,
                             blockOnAcknowledge,
                             blockOnPersistentSend,
                             blockOnNonPersistentSend,
                             autoGroup,
                             preAcknowledge,
                             loadBalancingPolicyClassName,
                             transactionBatchSize,
                             dupsOKBatchSize,
                             initialWaitTimeout,
                             useGlobalPools,
                             scheduledThreadPoolMaxSize,
                             threadPoolMaxSize,
                             retryInterval,
                             retryIntervalMultiplier,
                             reconnectAttempts,
                             failoverOnServerShutdown,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String discoveryAddress,
                                       final int discoveryPort,
                                       final String clientID,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory", name, discoveryAddress, discoveryPort, clientID, jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String discoveryAddress,
                                       final int discoveryPort,
                                       final String clientID,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory", name, discoveryAddress, discoveryPort, clientID, jndiBindings);

   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassName,
                                       final Map<String, Object> liveTransportParams,
                                       final String backupTransportClassName,
                                       final Map<String, Object> backupTransportParams,
                                       final String clientID,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassName,
                             liveTransportParams,
                             backupTransportClassName,
                             backupTransportParams,
                             clientID,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassNames,
                                       final String liveTransportParams,
                                       final String backupTransportClassNames,
                                       final String backupTransportParams,
                                       final String clientID,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassNames,
                             liveTransportParams,
                             backupTransportClassNames,
                             backupTransportParams,
                             clientID,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassName,
                                       final Map<String, Object> liveTransportParams,
                                       final String backupTransportClassName,
                                       final Map<String, Object> backupTransportParams,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassName,
                             liveTransportParams,
                             backupTransportClassName,
                             backupTransportParams,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassNames,
                                       final String liveTransportParams,
                                       final String backupTransportClassNames,
                                       final String backupTransportParams,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassNames,
                             liveTransportParams,
                             backupTransportClassNames,
                             backupTransportParams,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassName,
                                       final Map<String, Object> liveTransportParams,
                                       final String clientID,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassName,
                             liveTransportParams,
                             clientID,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassName,
                                       final String liveTransportParams,
                                       final String clientID,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveTransportClassName,
                             liveTransportParams,
                             clientID,
                             jndiBindings);
   }

   public void createConnectionFactory(String name,
                                       String liveTransportClassName,
                                       String liveTransportParams,
                                       String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory", name, liveTransportClassName, liveTransportParams, jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveTransportClassName,
                                       final Map<String, Object> liveTransportParams,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory", name, liveTransportClassName, liveTransportParams, jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final Object[] liveConnectorsTransportClassNames,
                                       final Object[] liveConnectorTransportParams,
                                       final Object[] backupConnectorsTransportClassNames,
                                       final Object[] backupConnectorTransportParams,
                                       final String clientID,
                                       final long clientFailureCheckPeriod,
                                       final long connectionTTL,
                                       final long callTimeout,
                                       final int maxConnections,
                                       final boolean cacheLargeMessageClient,
                                       final int minLargeMessageSize,
                                       final int consumerWindowSize,
                                       final int consumerMaxRate,
                                       final int producerWindowSize,
                                       final int producerMaxRate,
                                       final boolean blockOnAcknowledge,
                                       final boolean blockOnPersistentSend,
                                       final boolean blockOnNonPersistentSend,
                                       final boolean autoGroup,
                                       final boolean preAcknowledge,
                                       final String loadBalancingPolicyClassName,
                                       final int transactionBatchSize,
                                       final int dupsOKBatchSize,
                                       final boolean useGlobalPools,
                                       final int scheduledThreadPoolMaxSize,
                                       final int threadPoolMaxSize,
                                       final long retryInterval,
                                       final double retryIntervalMultiplier,
                                       final int reconnectAttempts,
                                       final boolean failoverOnServerShutdown,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveConnectorsTransportClassNames,
                             liveConnectorTransportParams,
                             backupConnectorsTransportClassNames,
                             backupConnectorTransportParams,
                             clientID,
                             clientFailureCheckPeriod,
                             connectionTTL,
                             callTimeout,
                             maxConnections,
                             cacheLargeMessageClient,
                             minLargeMessageSize,
                             consumerWindowSize,
                             consumerMaxRate,
                             producerWindowSize,
                             producerMaxRate,
                             blockOnAcknowledge,
                             blockOnPersistentSend,
                             blockOnNonPersistentSend,
                             autoGroup,
                             preAcknowledge,
                             loadBalancingPolicyClassName,
                             transactionBatchSize,
                             dupsOKBatchSize,
                             useGlobalPools,
                             scheduledThreadPoolMaxSize,
                             threadPoolMaxSize,
                             retryInterval,
                             retryIntervalMultiplier,
                             reconnectAttempts,
                             failoverOnServerShutdown,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final String liveConnectorsTransportClassNames,
                                       final String liveConnectorTransportParams,
                                       final String backupConnectorsTransportClassNames,
                                       final String backupConnectorTransportParams,
                                       final String clientID,
                                       final long clientFailureCheckPeriod,
                                       final long connectionTTL,
                                       final long callTimeout,
                                       final int maxConnections,
                                       final boolean cacheLargeMessageClient,
                                       final int minLargeMessageSize,
                                       final int consumerWindowSize,
                                       final int consumerMaxRate,
                                       final int producerWindowSize,
                                       final int producerMaxRate,
                                       final boolean blockOnAcknowledge,
                                       final boolean blockOnPersistentSend,
                                       final boolean blockOnNonPersistentSend,
                                       final boolean autoGroup,
                                       final boolean preAcknowledge,
                                       final String loadBalancingPolicyClassName,
                                       final int transactionBatchSize,
                                       final int dupsOKBatchSize,
                                       final boolean useGlobalPools,
                                       final int scheduledThreadPoolMaxSize,
                                       final int threadPoolMaxSize,
                                       final long retryInterval,
                                       final double retryIntervalMultiplier,
                                       final int reconnectAttempts,
                                       final boolean failoverOnServerShutdown,
                                       final String jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveConnectorsTransportClassNames,
                             liveConnectorTransportParams,
                             backupConnectorsTransportClassNames,
                             backupConnectorTransportParams,
                             clientID,
                             clientFailureCheckPeriod,
                             connectionTTL,
                             callTimeout,
                             maxConnections,
                             cacheLargeMessageClient,
                             minLargeMessageSize,
                             consumerWindowSize,
                             consumerMaxRate,
                             producerWindowSize,
                             producerMaxRate,
                             blockOnAcknowledge,
                             blockOnPersistentSend,
                             blockOnNonPersistentSend,
                             autoGroup,
                             preAcknowledge,
                             loadBalancingPolicyClassName,
                             transactionBatchSize,
                             dupsOKBatchSize,
                             useGlobalPools,
                             scheduledThreadPoolMaxSize,
                             threadPoolMaxSize,
                             retryInterval,
                             retryIntervalMultiplier,
                             reconnectAttempts,
                             failoverOnServerShutdown,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final Object[] liveConnectorsTransportClassNames,
                                       final Object[] liveConnectorTransportParams,
                                       final Object[] backupConnectorsTransportClassNames,
                                       final Object[] backupConnectorTransportParams,
                                       final String clientID,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveConnectorsTransportClassNames,
                             liveConnectorTransportParams,
                             backupConnectorsTransportClassNames,
                             backupConnectorTransportParams,
                             clientID,
                             jndiBindings);
   }

   public void createConnectionFactory(final String name,
                                       final Object[] liveConnectorsTransportClassNames,
                                       final Object[] liveConnectorTransportParams,
                                       final Object[] backupConnectorsTransportClassNames,
                                       final Object[] backupConnectorTransportParams,
                                       final Object[] jndiBindings) throws Exception
   {
      replicationAwareInvoke("createConnectionFactory",
                             name,
                             liveConnectorsTransportClassNames,
                             liveConnectorTransportParams,
                             backupConnectorsTransportClassNames,
                             backupConnectorTransportParams,
                             jndiBindings);
   }

   public boolean createQueue(final String name, final String jndiBinding) throws Exception
   {
      return (Boolean)replicationAwareInvoke("createQueue", name, jndiBinding);
   }

   public boolean createTopic(final String name, final String jndiBinding) throws Exception
   {
      return (Boolean)replicationAwareInvoke("createTopic", name, jndiBinding);
   }

   public void destroyConnectionFactory(final String name) throws Exception
   {
      replicationAwareInvoke("destroyConnectionFactory", name);
   }

   public boolean destroyQueue(final String name) throws Exception
   {
      return (Boolean)replicationAwareInvoke("destroyQueue", name);
   }

   public boolean destroyTopic(final String name) throws Exception
   {
      return (Boolean)replicationAwareInvoke("destroyTopic", name);
   }

   public String getVersion()
   {
      return localControl.getVersion();
   }

   public boolean isStarted()
   {
      return localControl.isStarted();
   }

   public String[] listConnectionIDs() throws Exception
   {
      return localControl.listConnectionIDs();
   }

   public String[] listRemoteAddresses() throws Exception
   {
      return localControl.listRemoteAddresses();
   }

   public String[] listRemoteAddresses(final String ipAddress) throws Exception
   {
      return localControl.listRemoteAddresses(ipAddress);
   }

   public String[] listSessions(final String connectionID) throws Exception
   {
      return localControl.listSessions(connectionID);
   }
   
   // NotificationEmitter implementation ----------------------------

   public void addNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws IllegalArgumentException
   {
      localControl.addNotificationListener(listener, filter, handback);
   }

   public void removeNotificationListener(NotificationListener listener) throws ListenerNotFoundException
   {
      localControl.removeNotificationListener(listener);
   }

   public void removeNotificationListener(NotificationListener listener, NotificationFilter filter, Object handback) throws ListenerNotFoundException
   {
      localControl.removeNotificationListener(listener, filter, handback);
   }

   public MBeanNotificationInfo[] getNotificationInfo()
   {
      return JMSServerControlImpl.getNotificationInfos();
   }

   // StandardMBean overrides ---------------------------------------

   @Override
   public MBeanInfo getMBeanInfo()
   {
      MBeanInfo info = super.getMBeanInfo();
      return new MBeanInfo(info.getClassName(),
                           info.getDescription(),
                           info.getAttributes(),
                           info.getConstructors(),
                           MBeanInfoHelper.getMBeanOperationsInfo(JMSServerControl.class),
                           getNotificationInfo());
   }

   // Public --------------------------------------------------------

   // Package protected ---------------------------------------------

   // Protected -----------------------------------------------------

   // Private -------------------------------------------------------

   // Inner classes -------------------------------------------------

}
