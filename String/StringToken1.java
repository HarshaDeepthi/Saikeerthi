package String;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.*;
public class StringToken1 {
    public static void main(String[] args) {
        StringTokenizer st1 = new StringTokenizer(
                "Hello harsha How are you", " ");
        while (st1.hasMoreTokens()) {
            String str = st1.nextToken();
            if (str.equalsIgnoreCase("are")) {
                //System.out.println(st1.nextToken());
                continue;
            }
            System.out.print(str + " ");
        }
    }
}

        //StringTokenizer st2 = new StringTokenizer(
             //  "JAVA : Code : String", " :");
       // while (st2.hasMoreTokens())
           //System.out.println(st2.nextToken());
       // StringTokenizer st3 = new StringTokenizer(
               // "JAVA : Code : String", " :", true);
//
       // while (st3.hasMoreTokens())
            //System.out.println(st3.nextToken());



