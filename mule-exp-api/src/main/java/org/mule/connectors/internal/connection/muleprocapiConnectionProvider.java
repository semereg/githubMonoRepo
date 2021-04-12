package org.mule.connectors.internal.connection;

import java.lang.String;
import org.mule.runtime.api.connection.CachedConnectionProvider;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.param.Parameter;

/**
 * This is a Connection Provider, is executed to obtain new connections when an operation or message source requires.;
 */
public class muleprocapiConnectionProvider implements CachedConnectionProvider<muleprocapiConnection> {
  @Parameter
  private String clientId;

  public muleprocapiConnection connect() throws ConnectionException {
    return new muleprocapiConnection(this.clientId);
  }

  public void disconnect(muleprocapiConnection connection) {
    // Execute disconnection logic
  }

  public ConnectionValidationResult validate(muleprocapiConnection connection) {
    // Execute validation logic
    return ConnectionValidationResult.success();
  }

  public String getClientId() {
    return this.clientId;
  }
}
