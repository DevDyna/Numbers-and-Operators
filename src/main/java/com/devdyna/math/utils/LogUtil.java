package com.devdyna.math.utils;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

public class LogUtil {
    private static Logger LOGGER;
    
        public LogUtil() {
            LogUtil.LOGGER = LogUtils.getLogger();
        }
    
        /**
         * send a message on logs
         */
        public static void info(String text) {
            LOGGER.info(text);
    }

    /**
     * send a decorative separator
     */
    public static void decor(int size) {
        if(size <=0)size = 10;
        String txt = "#";
        for(int i = 0;i<size;i++){
            txt.concat("-");
        }
        txt.concat("#");
        LOGGER.info(txt);
    }
}
