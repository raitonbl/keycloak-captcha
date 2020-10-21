package com.raitonbl.keycloak.captcha;

import org.keycloak.models.KeycloakSession;
import org.keycloak.provider.Provider;

public interface CaptchaService extends Provider {

    boolean isVerified(KeycloakSession session, String responseToken);

    String getCaptchaSiteKey();

}
