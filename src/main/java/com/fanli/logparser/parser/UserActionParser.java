package com.fanli.logparser.parser;

import com.fanli.logparser.entity.UserActionLog;
import com.google.gson.Gson;

/**
 * Created by zcfrank1st on 7/30/15.
 */
public class UserActionParser implements LogParser{
    private static Gson gson = new Gson();

    public UserActionLog parse(String content) {
        return gson.fromJson(content, UserActionLog.class);
    }
}