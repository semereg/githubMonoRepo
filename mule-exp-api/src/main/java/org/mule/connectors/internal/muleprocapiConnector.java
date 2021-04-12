package org.mule.connectors.internal;

import org.mule.connectors.internal.connection.muleprocapiConnectionProvider;
import org.mule.connectors.internal.operations.muleprocapiOperations;
import org.mule.connectors.internal.source.muleprocapiMessageSource;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;

@Extension(
    name = "muleprocapi"
)
@Sources(muleprocapiMessageSource.class)
@Operations(muleprocapiOperations.class)
@ConnectionProviders(muleprocapiConnectionProvider.class)
public class muleprocapiConnector {
}
