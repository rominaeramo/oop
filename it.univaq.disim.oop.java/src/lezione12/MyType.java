package lezione12;

import java.util.*;

public class MyType implements Comparable {
  private int i;
  public MyType(int n) { i = n; }
  public boolean equals(Object o) {
    return (o instanceof MyType) && (i == ((MyType)o).i);
  }
  public int hashCode() { return i; }
  
  public String toString() { return i + " "; }
  
  public int compareTo(Object o) {
    int i2 = ((MyType)o).i;
    return (i2 < i ? -1 : (i2 == i ? 0 : 1));		//  0: gli elementi sono uguali
    												// -1: quello preso in ingresso va prima
    												//  1: quello preso in ingresso va dopo
  }
}