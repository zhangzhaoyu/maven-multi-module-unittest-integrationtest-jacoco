package cn.cincout.test;

import org.springframework.stereotype.Component;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
@Component
public class Cal {

    public int add(int a, int b) {
        if (a > 100) {
            return 0;
        }
        return a + b;
    }

}
