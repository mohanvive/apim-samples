package org.example;

import org.wso2.carbon.apimgt.impl.dto.APIKeyValidationInfoDTO;
import org.wso2.carbon.apimgt.keymgt.APIKeyMgtException;
import org.wso2.carbon.apimgt.keymgt.handlers.AbstractKeyValidationHandler;
import org.wso2.carbon.apimgt.keymgt.service.TokenValidationContext;

/**
 * This is only a sample class only for testing purposes. Hence, sys.out used.
 */
public class TokenHandler extends AbstractKeyValidationHandler {

    public TokenHandler() {
        System.out.println("********** TokenHandler **********");
    }

    @Override
    public boolean validateToken(TokenValidationContext tokenValidationContext) throws APIKeyMgtException {
        System.out.println("********** TokenHandler.validateToken **********");
        return true;
    }

    @Override
    public boolean validateScopes(TokenValidationContext tokenValidationContext) throws APIKeyMgtException {
        System.out.println("********** TokenHandler.validateScopes **********");
        return true;
    }

    @Override
    public boolean validateSubscription(TokenValidationContext validationContext) throws APIKeyMgtException {
        System.out.println("********** TokenHandler.validateSubscription **********");
        return true;
    }

    @Override
    public APIKeyValidationInfoDTO validateSubscription(String apiContext, String apiVersion, String consumerKey,
                                                        String keyManager) {
        System.out.println("********** TokenHandler.validateSubscription new method **********");
        APIKeyValidationInfoDTO apiKeyValidationInfoDTO =  new APIKeyValidationInfoDTO();
        apiKeyValidationInfoDTO.setAuthorized(true);
        return apiKeyValidationInfoDTO;
    }

}
