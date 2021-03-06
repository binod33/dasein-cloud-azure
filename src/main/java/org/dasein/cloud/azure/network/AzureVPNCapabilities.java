package org.dasein.cloud.azure.network;

import org.dasein.cloud.AbstractCapabilities;
import org.dasein.cloud.CloudException;
import org.dasein.cloud.InternalException;
import org.dasein.cloud.Requirement;
import org.dasein.cloud.azure.Azure;
import org.dasein.cloud.network.VPNCapabilities;
import org.dasein.cloud.network.VPNProtocol;

import javax.annotation.Nonnull;
import java.util.Collections;

/**
 * Describes the capabilities of Azure with respect to Dasein vpn operations.
 * User: daniellemayne
 * Date: 05/03/2014
 * Time: 14:34
 */
public class AzureVPNCapabilities extends AbstractCapabilities<Azure> implements VPNCapabilities{
    public AzureVPNCapabilities(@Nonnull Azure provider) {
        super(provider);
    }

    @Override
    public Requirement getVPNDataCenterConstraint() throws CloudException, InternalException {
        return Requirement.NONE;
    }

    @Nonnull
    @Override
    public Iterable<VPNProtocol> listSupportedVPNProtocols() throws CloudException, InternalException {
        return Collections.emptyList();
    }
}
