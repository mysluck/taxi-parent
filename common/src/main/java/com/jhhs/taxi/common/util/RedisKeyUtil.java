package com.jhhs.taxi.common.util;

/**
 * @Auther: zhouzy
 * @Date: 2021/1/19 11:08
 * @Description
 */
public class RedisKeyUtil {
    public static String generateKeyPreByIdentity(int identity) {
        String keyPre = "";
        if (identity == 1) {
            keyPre = "passenger_login_";
        } else if (identity == 2) {
            keyPre = "driver_login_";
        }

        return keyPre;
    }
}
