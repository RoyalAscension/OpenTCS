/**
 * Copyright (c) The openTCS Authors.
 *
 * This program is free software and subject to the MIT license. (For details,
 * see the licensing information (LICENSE.txt) you should have received with
 * this copy of the software.)
 */
package org.opentcs.kernel.xmlhost;

import org.opentcs.util.configuration.ConfigurationEntry;
import org.opentcs.util.configuration.ConfigurationPrefix;

/**
 * Provides methods to configure the XML-based host interface.
 *
 * @author Martin Grzenia (Fraunhofer IML)
 */
@ConfigurationPrefix(XMLHostInterfaceConfiguration.PREFIX)
public interface XMLHostInterfaceConfiguration {

  /**
   * This configuration's prefix.
   */
  String PREFIX = "xmlhostinterface";

  @ConfigurationEntry(
      type = "Integer",
      description = "The TCP port on which to listen for incoming order connections.")
  int ordersServerPort();

  @ConfigurationEntry(
      type = "Integer",
      description = "The time (in ms) after which idle connections are closed.")
  int ordersIdleTimeout();

  @ConfigurationEntry(
      type = "Integer",
      description = "The maximum number of bytes read from sockets before closing the connection.")
  int ordersInputLimit();

  @ConfigurationEntry(
      type = "Integer",
      description = "The TCP port on which to listen for incoming status channel connections.")
  int statusServerPort();

  @ConfigurationEntry(
      type = "String",
      description = "A string to be used for separating subsequent status messages in the stream.")
  String statusMessageSeparator();
}