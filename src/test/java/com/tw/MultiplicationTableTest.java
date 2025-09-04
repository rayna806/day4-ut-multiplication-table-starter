package com.tw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTableTest {
    @Test
    public void should_return_when_start_is_1_end_is_1(){
        int start = 1;
        int end = 1;
        MultiplicationTable mutiplicationTable = new MultiplicationTable();
        String resulet= mutiplicationTable.create(start,end);
        assertEquals("1*1=1",resulet);
    }

    @Test
    public void should_return_when_start_is_2_end_is_3(){
        int start = 2;
        int end = 3;
        MultiplicationTable mutiplicationTable = new MultiplicationTable();
        String resulet= mutiplicationTable.create(start,end);
        assertEquals("2*2=4\n2*3=6\t3*3=9",resulet);
    }

    @Test
    public void should_return_when_start_is_2_end_is_n(){
        int start = 2;
        int end = 4;
        MultiplicationTable mutiplicationTable = new MultiplicationTable();
        String resulet= mutiplicationTable.create(start,end);
        assertEquals("2*2=4\n2*3=6\t3*3=9\n2*4=8\t3*4=12\t4*4=16",resulet);
    }

    @Test
    public void should_return_null_when_start_is_2_end_is_1(){
    // Given}
        int start = 2;
        int end = 1;
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        // When
        String result = multiplicationTable.create(start, end);
        // Then
        assertNull(result);

    }

    @Test
    public void should_return_null_when_start_is_1001_end_is_1001(){
        // Given
        int start = 1001;
        int end = 1001;
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        // When
        String result = multiplicationTable.create(start, end);
        // Then
        assertNull(result);
    }
}



















