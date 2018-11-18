package com.adneom.bruno;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PartitionTest {

    Partition p = new Partition();

    ArrayList l1 = new ArrayList(){{
        for(int i = 1; i < 6; i++){
            add(i);
        }
    }};

    ArrayList l2 = new ArrayList(){{
        for(int i = 1; i < 11; i++){
            add(i);
        }
    }};

    @Test
    public void test01(){
        Assert.assertEquals("[[1], [2], [3], [4], [5]]", p.partition(l1, 1).toString());
    }

    @Test
    public void test02(){
        Assert.assertEquals("[[1, 2], [3, 4], [5]]", p.partition(l1, 2).toString());
    }

    @Test
    public void test03(){
        Assert.assertEquals("[[1, 2, 3], [4, 5]]", p.partition(l1, 3).toString());
    }

    @Test
    public void test04(){
        Assert.assertEquals("[[1, 2, 3, 4], [5]]", p.partition(l1, 4).toString());
    }

    @Test
    public void test05(){
        Assert.assertEquals("[[1, 2, 3, 4, 5]]", p.partition(l1, 5).toString());
    }

    @Test
    public void test06(){
        Assert.assertEquals("[[1, 2, 3, 4, 5]]", p.partition(l1, 6).toString());
    }

    @Test
    public void test07(){
        Assert.assertEquals("[[1], [2], [3], [4], [5], [6], [7], [8], [9], [10]]", p.partition(l2, 1).toString());
    }

    @Test
    public void test08(){
        Assert.assertEquals("[[1, 2], [3, 4], [5, 6], [7, 8], [9, 10]]", p.partition(l2, 2).toString());
    }

    @Test
    public void test09(){
        Assert.assertEquals("[[1, 2, 3], [4, 5, 6], [7, 8, 9], [10]]", p.partition(l2, 3).toString());
    }

    @Test
    public void test10(){
        Assert.assertEquals("[[1, 2, 3, 4], [5, 6, 7, 8], [9, 10]]", p.partition(l2, 4).toString());
    }

    @Test(expected=NullPointerException.class)
    public void test11(){
        p.partition(l1, 0).toString();
    }

    @Test(expected=NullPointerException.class)
    public void test12(){
        p.partition(l1, -1).toString();
    }

}