package com.mojix.vizix.api.tenantgroup.tools;

import com.mojix.vizix.JSONtools;

import java.util.ArrayList;

public class ToolsTest {
    public static void main(String[] args) {
        ToolsTest test = new ToolsTest();
        test.test_ToolsJson();
    }
    public void test_ToolsJson(){
      String json = "[{\"parameterType\":\"BRIDGE_TYPE\",\"group.groupType\":{\"archived\":false,\"code\":\"tenant\",\"name\":\"Company\",\"description\":null,\"id\":2},\"code\":\"RULESET\",\"configuration\":\"{\\\"cepChangeLogs\\\":{\\\"active\\\":false},\\\"numberOfThreads\\\":2,\\\"thingCache\\\":{\\\"evictionTime\\\":60,\\\"size\\\":1000000},\\\"bridgeAgent\\\":{\\\"agentCode\\\":\\\"T1_AUTO517511016IXYC\\\"},\\\"bridgeStartupOptions\\\":{\\\"jvmHeapMemory\\\":{\\\"Xmx\\\":\\\"1024m\\\",\\\"Xms\\\":\\\"512m\\\"}},\\\"executeRulesForLastDetectTime\\\":{\\\"active\\\":false},\\\"thingInsertRestApi\\\":{\\\"retryAttemptLimit\\\":10,\\\"retryIntervalPeriodSecs\\\":5000}}\",\"fqnBase\":\">T1_AUTO517511016IXYC\",\"description\":null,\"active\":false,\"type\":\"core\",\"edgeboxRules\":\"\",\"name\":\"Ruleset\",\"filterRule\":null,\"id\":85,\"status\":\"OFF\",\"group\":{\"archived\":false,\"code\":\"T1_AUTO517511016IXYC\",\"treeLevel\":2,\"hierarchyCode\":\">T1_AUTO517511016IXYC\",\"name\":\"T1_AUTO517511016IXYC\",\"fqnBase\":\"\",\"description\":\"This is a data generate by automation team.\",\"id\":108}}]";
//        String json = "[{\"p\":\"hhhhh\"}]";
//        String json = "[{\"a\":\"xxxxx\"},{\"b\":\"yyyyyy\"}]";
        ArrayList<String> l = JSONtools.jsonToArray( json );
        for( String e : l){
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println( e );
        }

    }
}
