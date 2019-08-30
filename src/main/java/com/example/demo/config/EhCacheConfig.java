package com.example.demo.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@Configuration
@EnableJpaRepositories(basePackages = "com.example.demo.repo")
public class EhCacheConfig {

//    @Bean
//    public CacheManager cacheManager(){
//        return new EhCacheCacheManager(cacheFactory().getObject());
//    }
//
//    @Bean
//    public EhCacheManagerFactoryBean cacheFactory(){
//        EhCacheManagerFactoryBean bean=new EhCacheManagerFactoryBean();
//        bean.setConfigLocation(new ClassPathResource("ehCache.xml"));
//        bean.setShared(true);
//        return bean;
//    }
}
