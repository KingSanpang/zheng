package com.zheng.common.base;

/**
 * 全局常量
 * Created by shuzheng on 2017/2/18.
 */
public class BaseConstants {
    public final static String UPMS_USER_INFO_PREFIX_REDIS = "upmsUserInfoRedis:";//对应自定义用户类

    public enum STATUS{
        DEL("0","删除"), NORMAL("1","正常");
        public String code;
        public String desc;

        STATUS(String code, String desc) {
            this.code = code;
            this.desc = desc;
        }
    }
}
