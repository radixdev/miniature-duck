package com.radix.duck.swans;

/**
 * A class with a lot of javadocs and methods to test the maven repo
 */
public class HaveSomeClass {

  public int noClass = 5;
  private final float aLittleClass = 8F;

  /**
   * Creates a HaveSomeClass object
   * @param canBeNull a param of sorts. Can be null
   */
  public HaveSomeClass(Object canBeNull){

  }

  /**
   * Adds together two ints.
   * @param one first int
   * @param two second int
   * @return what do you think?
   */
  public static int add2Ints(int one, int two) {
    return one + two;
  }

  @Override
  public String toString() {
    return "HaveSomeClass{" +
      "noClass=" + noClass +
      ", aLittleClass=" + aLittleClass +
      '}';
  }
}
