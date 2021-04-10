package org.mule.connectors.internal.operations;

import java.lang.String;
import org.mule.connectors.api.muleprocapiPublishAttributes;
import org.mule.connectors.internal.connection.muleprocapiConnection;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.MediaType;
import org.mule.runtime.extension.api.runtime.operation.Result;

public class muleprocapiOperations {
  @MediaType("*/*")
  public Result<String, muleprocapiPublishAttributes> postMessage(
      @Connection muleprocapiConnection connection, String message, String destination) {
    muleprocapiPublishAttributes attributes = new muleprocapiPublishAttributes(connection.getClientId(), destination);
    return Result.<String,muleprocapiPublishAttributes>builder()
        .output(message)
        .attributes(attributes)
        .build();
  }

  @MediaType("*/*")
  public String helloWorld(@Connection muleprocapiConnection connection, String name) {
    return "Hello World!, " + name;
  }
}
