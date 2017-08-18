package com.clickpost.shippingplatform.config;


import org.apache.commons.configuration2.*;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.configuration2.io.ClasspathLocationStrategy;

public class ClickPostServerConfigImpl implements ClickPostServerConfig {

    private static final String CONFIGURATION_FILE_NAME = "clickpost.properties";
    private final ImmutableConfiguration configuration_;


    public ClickPostServerConfigImpl() throws ConfigurationException {
        Parameters params = new Parameters();
        FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
                new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
                        .configure(params.properties()
                                .setLocationStrategy(new ClasspathLocationStrategy())
                                .setFileName(CONFIGURATION_FILE_NAME));
        Configuration configuration = builder.getConfiguration();
        configuration_ = ConfigurationUtils.unmodifiableConfiguration(configuration);
    }


    @Override
    public String getOrderCreationUrl() {
        return configuration_.getString("clickpost.ordercreation.url");
    }
}
