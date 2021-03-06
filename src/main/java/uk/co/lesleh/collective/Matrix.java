package uk.co.lesleh.collective;

/**
 * Created by leslie on 27/11/14.
 */
public class Matrix<T> {
    private Object[][] _data;
    private int rows;
    private int columns;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this._data = new Object[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void set(int row, int column, T value) {
        _data[row][column] = value;
    }

    public T get(int row, int column) {
        return (T)_data[row][column];
    }
}
