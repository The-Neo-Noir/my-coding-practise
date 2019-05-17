package com.aneonoir.dsalgo.practise.math;

import org.junit.Test;

/**
 *link : https://app.codesignal.com/arcade/code-arcade/loop-tunnel/xzeZqCQjpfDJuN72S
 *
 * struggle: sb append needs to do reverse,
 */
public class ForgettingCarryOver {

    @Test
    public void test() {
        additionWithoutCarrying(456, 1734);
    }

    int additionWithoutCarrying(int param1, int param2) {
        StringBuffer sb = new StringBuffer();
        int legnth= (param1+"").length()>=(param2+"").length()? (param1+"").length():(param2+"").length();
        for(int i=0;i<legnth;i++){
            sb.append(""+(((param1%10)+(param2%10))%10));
            param1=param1/10;
            param2=param2/10;
        }
        return Integer.valueOf(sb.reverse().toString()).intValue();
    }




}
