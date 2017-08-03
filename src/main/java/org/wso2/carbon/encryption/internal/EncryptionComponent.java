package org.wso2.carbon.encryption.internal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.osgi.service.component.ComponentContext;

/**
 * @scr.component name="org.wso2.carbon.apimgt.migration.client" immediate="true"
 */
public class EncryptionComponent {

    public static final Log log = LogFactory.getLog(EncryptionComponent.class);
    protected void activate(ComponentContext context){
        System.out.println("###############################################################################");
        log.error("*************************************************************************************");
    }
}
