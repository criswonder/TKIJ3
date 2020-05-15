package com.idlefish;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by <邻云> hongyun.mhy
 * on 2017/1/8
 */

public class TestRegrex {
    public static void main(String[] args) {
//        testSplit();
        System.out.println(testGraleFlavorMatch());
    }

    private static String testGraleFlavorMatch() {
        String tskReqStr = "[:idlefish:clean, :idlefish:generatePreReleaseSources, :idlefish:preparePreReleaseUnitTestDependencies, :idlefish:mockableAndroidJar, :idlefish:assemblePreRelease],projectPath='null'}]";
//        tskReqStr = ":idlefish:generatePreReleaseSources,";
        tskReqStr = ":idlefish:generateDebugSources, :idlefish:generateDebugAndroidTestSources, :idlefish:mockableAndroidJar, :idlefish:prepareDebugUnitTestDependencies, :";

        Pattern pattern;

        if (tskReqStr.contains("assemble"))
            pattern = Pattern.compile(":idlefish:assemble(\\w+)");
        else
            pattern = Pattern.compile(":idlefish:generate(\\w+)(Sources)");

        Matcher matcher = pattern.matcher(tskReqStr);

        if (matcher.find())
            return matcher.group(1).toLowerCase();
        else {
            return "";
        }
    }

    private static void testSplit() {
        String packageNamez = "abc, bcd, efg,  abcdefg ";
        if (packageNamez != null) {
            String[] packageNames = packageNamez.split("(\\s)*,(\\s)*");
            for (String str :
                    packageNames) {
                System.out.println(str + ";");
            }
        }
    }
}
