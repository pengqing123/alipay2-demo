package com.song.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Song on 2017/11/7.
 */
public class Md5Util {

    public static String getMd5Str(String string) {

        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }
}
