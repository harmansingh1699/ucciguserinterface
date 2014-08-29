/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ui.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ravjotsingh
 */
public class CommonValidations {

    public static boolean isValidEmailAddress(String emailAddress) {
        boolean result = false;

        if (!isStringEmpty(emailAddress)) {

            Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
            Matcher matcher = pattern.matcher(emailAddress);
            result = matcher.matches();
        }

        return result;
    }

    public static boolean isStringEmpty(String data) {
        boolean result = false;
        if (data == null || data.trim().length() == 0) {
            result = true;
        }
        return result;
    }

}
