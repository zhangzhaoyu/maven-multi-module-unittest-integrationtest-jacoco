package cn.cincout.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhaoyu on 20-7-26.
 *
 * @author zhaoyu
 * @sine 1.8
 */
class CalTest {

    private Cal cal;

    @BeforeEach
    void before() {
        this.cal = new Cal();
    }

    @Test
    void add() {
        Assertions.assertEquals(2, this.cal.add(1, 1));
    }
}