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
        assertEquals(matrix.getRows(), 3);
        assertEquals(matrix.getColumns(), 4);
    }

}
