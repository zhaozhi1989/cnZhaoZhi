package com.george.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.cache.interceptor.SimpleKeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * redis缓存配置类
 *
 * @author zhaozhi
 * @description
 * @since 2020/6/24
 */
@Configuration
@EnableCaching // 开启redis缓存
public class RedisConfig {

    public static final String CACHE_PREFIX = "GEORGE:";

    /**
     * RedisTemplate模板配置
     *
     * @param connectionFactory redis工厂
     * @return
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        redisTemplate.setConnectionFactory(connectionFactory);
        redisTemplate.setKeySerializer(new StringRedisSerializer()); //key序列化
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer()); //value序列化
        redisTemplate.afterPropertiesSet();
        return redisTemplate;
    }

    /**
     * redis缓存写入器
     *
     * @param redisTemplate redis模板
     * @return
     */
    @Bean
    public RedisCacheWriter writer(RedisTemplate redisTemplate) {
        return RedisCacheWriter.nonLockingRedisCacheWriter(redisTemplate.getConnectionFactory());
    }

    /**
     * 缓存管理器
     *
     * @param connectionFactory redis工厂
     * @return
     */
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig();
        // 设置缓存管理器管理的缓存的默认过期时间
        defaultCacheConfig = defaultCacheConfig.entryTtl(Duration.ofSeconds(120L))
                // 设置 key为string序列化
                .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
                // 设置value为json序列化
                .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()))
                //缓存前缀
                .prefixKeysWith(CACHE_PREFIX);
                // 不缓存空值
                //.disableCachingNullValues();


        // 设置缓存名称对应的过期时间  example: 1m->1Minutes
        Map<String, RedisCacheConfiguration> configMap = new HashMap<>();
        configMap.put("1m", defaultCacheConfig.entryTtl(Duration.ofMinutes(1L)));
        configMap.put("3m", defaultCacheConfig.entryTtl(Duration.ofMinutes(3L)));
        configMap.put("5m", defaultCacheConfig.entryTtl(Duration.ofMinutes(5L)));
        configMap.put("1h", defaultCacheConfig.entryTtl(Duration.ofHours(1L)));
        configMap.put("3h", defaultCacheConfig.entryTtl(Duration.ofHours(3L)));
        configMap.put("5h", defaultCacheConfig.entryTtl(Duration.ofHours(5L)));
        configMap.put("1d", defaultCacheConfig.entryTtl(Duration.ofDays(1L)));
        configMap.put("3d", defaultCacheConfig.entryTtl(Duration.ofDays(3L)));
        configMap.put("5d", defaultCacheConfig.entryTtl(Duration.ofDays(5L)));

        RedisCacheManager cacheManager = RedisCacheManager.builder(connectionFactory)
                .cacheDefaults(defaultCacheConfig)
                .initialCacheNames(configMap.keySet())
                .withInitialCacheConfigurations(configMap)
                .build();
        return cacheManager;
    }

    /**
     * key生成器
     *
     * @return
     */
    @Bean
    public KeyGenerator keyGenerator() {
        return new SimpleKeyGenerator();
    }

}
