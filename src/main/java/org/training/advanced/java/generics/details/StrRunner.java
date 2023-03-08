package org.training.advanced.java.generics.details;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

public class StrRunner {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil("osman");
        int length = stringUtil.length();
        StringBuilder builder = new StringBuilder();
        builder.append("osman");
        StringBuilderUtil stringBuilderUtil = new StringBuilderUtil(builder);
        int length1 = stringBuilderUtil.length();

        CharSequenceUtil<String> util1 = new CharSequenceUtil<>("osman");
        int length2 = util1.length();
        CharSequenceUtil<StringBuilder> util2 = new CharSequenceUtil<>(builder);
        int length3 = util2.length();
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
        CharSequenceUtil<CharBuffer> util3 = new CharSequenceUtil<>(byteBuffer.asCharBuffer());
        int length4 = util3.length();
        CharSequenceUtil<StringBuffer> util4 = new CharSequenceUtil<>(new StringBuffer());
        int length5 = util4.length();

        String s = util1.consToStr1("osman",
                                    "mehmet");
        String s1 = util1.consToStr1(100,
                                     200);
        String s2 = util1.consToStr1("osman",
                                     200);
        String s3 = util1.consToStr2("osman",
                                     200);

        String s4 = util1.consToStr3("100",
                                     100);

        String s5 = util1.consToStr3(builder,
                                     10.7D);


    }
}
