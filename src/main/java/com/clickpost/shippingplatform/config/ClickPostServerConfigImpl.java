package com.clickpost.shippingplatform.config;


import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.ClasspathLocationStrategy;

public class ClickPostServerConfigImpl implements ClickPostServerConfig {

    private static final String CONFIGURATIONFILENAME = "clickpost.properties";
    private final ImmutableConfiguration configuration;


    public ClickPostServerConfigImpl() throws ConfigurationException {
        Parameters params = new Parameters();
        FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                        .configure(params.properties()
                                .setLocationStrategy(new ClasspathLocationStrategy())
                                .setFileName(CONFIGURATIONFILENAME));
        Configuration configuration = builder.getConfiguration();
        this.configuration = ConfigurationUtils.unmodifiableConfiguration(configuration);
    }


    @Override
    public String getOrderCreationUrl() {
        return configuration.getString("clickpost.ordercreation.url");
    }

    @Override
    public String getApiKey() {
        return configuration.getString("clickpost.apikey");
    }
}
