package jsu.ljt.javademo.model.ch02;

public class DataTypeExample {
  private byte exampleByte = 1;
  private short exampleShort = 2;
  private int exampleInt = 3;
  private long exampleLong = 4L;
  private float exampleFloat = 5.5f;
  private double exampleDouble = 6.6;
  private char exampleChar = 'A';
  private boolean exampleBoolean = true;
  private String exampleString = "Hello, World!";

  // Getters
  public byte getExampleByte() {
    return exampleByte;
  }

  public short getExampleShort() {
    return exampleShort;
  }

  public int getExampleInt() {
    return exampleInt;
  }

  public long getExampleLong() {
    return exampleLong;
  }

  public float getExampleFloat() {
    return exampleFloat;
  }

  public double getExampleDouble() {
    return exampleDouble;
  }

  public char getExampleChar() {
    return exampleChar;
  }

  public boolean getExampleBoolean() {
    return exampleBoolean;
  }

  public String getExampleString() {
    return exampleString;
  }

  @Override
  public String toString() {
    return "DataTypeExample{" +
        "exampleByte=" + exampleByte +
        ", exampleShort=" + exampleShort +
        ", exampleInt=" + exampleInt +
        ", exampleLong=" + exampleLong +
        ", exampleFloat=" + exampleFloat +
        ", exampleDouble=" + exampleDouble +
        ", exampleChar=" + exampleChar +
        ", exampleBoolean=" + exampleBoolean +
        ", exampleString='" + exampleString + '\'' +
        '}';
  }

  public static void main(String[] args) {
    System.out.println(new DataTypeExample());
  }
}

