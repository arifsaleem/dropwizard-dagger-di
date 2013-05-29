package org.example.config;

import dagger.Module;
import dagger.Provides;
import org.example.api.UserBean;
import org.example.service.HelloWorldService;

import javax.inject.Singleton;

@Module (
        injects = {HelloWorldService.class, UserBean.class},
        library = true
        )

public class DaggerModule {
    @Provides
    @Singleton
    HelloWorldService provideHelloService(){
        return new HelloWorldService();
    }

    @Provides
    UserBean providesUserBean(){
        return new UserBean();
    }
}
