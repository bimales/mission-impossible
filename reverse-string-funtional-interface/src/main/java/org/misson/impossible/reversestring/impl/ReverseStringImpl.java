package org.misson.impossible.reversestring.impl;

import org.misson.impossible.reversestring.ReverseString;

public class ReverseStringImpl implements ReverseString {
    @Override
    public String reverseString(String str) {

        String sb = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            sb += str.charAt(i);
        }
        return sb;
    }
}
