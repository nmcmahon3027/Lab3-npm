package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestIterator {

  private List<Integer> list;
  // See the Java List Interface documentation to understand what all the List methods do ...
  // https://docs.oracle.com/javase/8/docs/api/java/util/List.html
  public TestIterator() {
  }

  @Before
  public void setUp() throws Exception {
    this.list = new ArrayList();
    // TODO also try with a LinkedList - does it make any difference?
    //ie : What is different & is Performance different?
  }

  @After
  public void tearDown() throws Exception {
    this.list = null;
  }

  @Test
  public void testEmpty() {
    Iterator<Integer> i = this.list.iterator();
    Assert.assertFalse(i.hasNext());
    /*final Iterator<Integer> i = list.iterator();
    assertFalse(i.hasNext());*/
  }

  @Test
  public void testNonempty() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Iterator<Integer> i = this.list.iterator();
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(33L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertTrue(i.hasNext());
    Assert.assertEquals(0L, (long)(Integer)i.next());
    Assert.assertFalse(i.hasNext());
  }

  @Test
  public void testRemove() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Iterator i = this.list.iterator();

    while(i.hasNext()) {
      if ((Integer)i.next() == 77) {
        i.remove();
      }
     // TODO what happens if you use list.remove(Integer.valueOf(77))?
      }
    }
    // TODO using assertEquals and Arrays.asList, express which values are left in the list
    // See TestList.java for examples of how to use Arrays.asList; also see the Java Arrays
    // class for more information


  @Test
  public void testAverageValues() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    double sum = 0.0D;
    int n = 0;
    Assert.assertEquals(61.3D, sum / (double)n, 0.1D);
    Assert.assertEquals(7L, (long)n);
  }
    /*list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    double sum = 0;
    int n = 0;*/
    // TODO use an iterator and a while loop to compute the average (mean) of the values
    // (defined as the sum of the items divided by the number of items)
    // testNonempty shows how to use an iterator; use i.hasNext() in the while loop condition
    /*assertEquals(61.3, sum / n, 0.1);
    assertEquals(7, n);*/
  }

