package github.java;

public class PrimitiveTypesMinMaxBitLen {
    public static void main(String[] args) {
        // long, int, short and byte
        // double and float
        // char
        System.out.println("=== Long data type ===");
        System.out.println("long(min) = " + Long.MIN_VALUE);
        System.out.println("long(max) = " + Long.MAX_VALUE);
        System.out.println("long(byte-length) = " + Long.SIZE);

        System.out.println("=== Integer data type ===");
        System.out.println("int(min) = " + Integer.MIN_VALUE);
        System.out.println("int(max) = " + Integer.MAX_VALUE);
        System.out.println("int(byte-length) = " + Integer.SIZE);

        System.out.println("=== Short data type ===");
        System.out.println("short(min) = " + Short.MIN_VALUE);
        System.out.println("short(max) = " + Short.MAX_VALUE);
        System.out.println("short(byte-length) = " + Short.SIZE);

        System.out.println("=== Byte data type ===");
        System.out.println("byte(min) = " + Byte.MIN_VALUE);
        System.out.println("byte(max) = " + Byte.MAX_VALUE);
        System.out.println("byte(byte-length) = " + Byte.SIZE);

        System.out.println("=== Double data type ===");
        System.out.println("double(min) = " + Double.MIN_VALUE);
        System.out.println("double(max) = " + Double.MAX_VALUE);
        System.out.println("double(byte-length) = " + Double.SIZE);

        System.out.println("=== Float data type ===");
        System.out.println("float(min) = " + Float.MIN_VALUE);
        System.out.println("float(max) = " + Float.MAX_VALUE);
        System.out.println("float(byte-length) = " + Float.SIZE);

        System.out.println("=== Character data type ===");
        System.out.println("char(min) = " + (int) Character.MIN_VALUE);
        System.out.println("char(max) = " + (int) Character.MAX_VALUE);
        System.out.println("char(byte-length) = " + Character.SIZE);
    }
}
