package org.example;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import dagger.ObjectGraph;
import org.example.config.DaggerModule;
import org.example.config.ServiceConfiguration;
import org.example.service.HelloWorldService;

import javax.inject.Inject;

public class ServiceRunner extends Service<ServiceConfiguration> {

    @Inject
    HelloWorldService helloService;

    @Override
    public void initialize(Bootstrap<ServiceConfiguration> serviceConfigurationBootstrap) {

    }

    @Override
    public void run(ServiceConfiguration serviceConfiguration, Environment environment) throws Exception {
        ObjectGraph objectGraph = ObjectGraph.create(new DaggerModule());
        environment.addResource(objectGraph.get(HelloWorldService.class));
    }

    public static void main(String... args) throws Exception{
        new ServiceRunner().run(new String[]{"server","config.yml"});
    }
}
