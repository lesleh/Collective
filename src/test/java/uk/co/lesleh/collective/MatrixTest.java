package uk.co.lesleh.collective;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by leslie on 27/11/14.
 */
public class MatrixTest {

    @Test
    public void testCreateMatrix() {
        Matrix matrix = new Matrix(3, 4);
        assertEquals(3, matrix.getRows());
        assertEquals(4, matrix.getColumns());
    }

    @Test
    public void testSetAndGet() {
        Matrix matrix = new Matrix(3, 4);
        matrix.set(1, 2, "Test Value");
        assertEquals("Test Value", matrix.get(1, 2));
    }

}
