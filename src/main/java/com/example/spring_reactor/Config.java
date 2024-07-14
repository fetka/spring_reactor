package com.example.spring_reactor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.bus.EventBus;
import reactor.Environment;

@Configuration
public class Config {

  @Bean
  public Environment env() {
    return Environment.initializeIfEmpty().assignErrorJournal();
  }

  @Bean
  public EventBus createEventBus(Environment env) {
    return EventBus.create(env, Environment.THREAD_POOL);
  }
}