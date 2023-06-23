package org.misson.impossible.reversestring;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseStringApp {

    public static void main(String[] args) {

        ReverseString rs;

        rs = (str) -> {

            String rstr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                rstr += str.charAt(i);
            }
            return rstr;
        };
        log.info("Reverse String : " + rs.reverseString("Bimales Mandal"));

    }
}
