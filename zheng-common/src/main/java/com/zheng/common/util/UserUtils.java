package com.zheng.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zheng.common.dto.UpmsUserInfoRedis;

import java.io.IOException;

public class UserUtils {
    public static UpmsUserInfoRedis getUserInfoFromRedis(String key) {
        String userInfo =  RedisUtil.get(key);
        ObjectMapper mapper = new ObjectMapper();
        UpmsUserInfoRedis userInfoRedis = null;
        try {
            userInfoRedis = mapper.readValue(userInfo, UpmsUserInfoRedis.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userInfoRedis;
    }
}
