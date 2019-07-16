package com.jv.web;

import com.jv.common.utils.cache.RedisCacheUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class RedisTest {

    @Autowired
    RedisCacheUtil redisCacheUtil;

    public String redisStrKey1 = "REDIS_TEST_KEY_1";
    public String redisStrKey2 = "REDIS_TEST_KEY_2";
    public String redisStrKey3 = "REDIS_TEST_KEY_3";

    @Test
    public void contextLoads() {

//        Map cacheHashMap = new HashMap();
//        cacheHashMap.put("keyOne","valueOne");

        String stringVal = "stringVal2";

       redisCacheUtil.set(redisStrKey1,stringVal,1000L * 60 *2);
//        log.error("user = " + dbUser);d
    }


    @Test
    public void getRedisCache() {

//        Map cacheHashMap = new HashMap();
//        cacheHashMap.put("keyOne","valueOne");

        String value =  redisCacheUtil.getString(this.redisStrKey1);
        log.error("value = " + value);
    }

}
