package com.raptor.util;

import org.apache.commons.codec.binary.Base64;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource(value = "classpath:application.properties",ignoreResourceNotFound = true)
@Configuration
public class Utililty implements EnvironmentAware {
    private static Environment environment;

    @Override
    public void setEnvironment(final Environment environment) {
        this.environment = environment;
    }

    public static String getEnvironmentProperties(String property) {
        if (environment != null && property != null && environment.getProperty(property) != null) {
            return environment.getProperty(property);
        }
        return property;
    }

    public static String getDecodedValue (String input) {
        byte[] decodedstring = Base64.decodeBase64(input);
        return  new String(decodedstring );
    }
}
