package com.fanli.logparser.factory;

import com.fanli.logparser.parser.ApacheParser;
import com.fanli.logparser.parser.LogParser;
import com.fanli.logparser.parser.UserActionParser;

/**
 * Created by zcfrank1st on 7/30/15.
 */
public class LogParserFactory {

    public LogParser build(String type) {
        if (type.equals("apache")) {
            return new ApacheParser();
        } else if (type.equals("user_action")) {
            return new UserActionParser();
        } else {
            throw new RuntimeException("current log type not support!");
        }
    }
}
