package com.example.sfg_di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hi ! This is i18 Spanish Service.";
    }
}
