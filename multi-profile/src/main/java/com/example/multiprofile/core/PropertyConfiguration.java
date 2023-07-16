package com.example.multiprofile.core;


import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationPropertiesScan(basePackages = {"com.example.multiprofile.core.props"})
public class PropertyConfiguration {
}
