package cs271.lab.list;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.LinkedList;

public class TestList {

  private List<Integer> list;

  @Before
  public void setUp() throws Exception {

      this.list = new ArrayList();
    }
    //this.list = new ArrayList<Integer>();
    // TODO also try with a LinkedList - does it make any difference?


  @After
  public void tearDown() throws Exception {
    this.list = null;
  }

  @Test
  public void testSizeEmpty() {
    Assert.assertTrue(this.list.isEmpty());
    Assert.assertEquals(0L, (long)this.list.size());

    try {
      this.list.get(0);
      Assert.fail("there should not be any items in the list");
    } catch (Exception var2) {
      ;
    }
  }

  @Test
  public void testSizeNonEmpty() {
    // TODO fix the expected values in the assertions below

      this.list.add(77);
      Assert.assertEquals(false, this.list.isEmpty());
      Assert.assertEquals(1L, (long)this.list.size());
      Assert.assertEquals(77L, (long)(Integer)this.list.get(0));
    }

  @Test
  public void testContains() {
    // TODO write assertions using
    // list.contains(77)
    // that hold before and after adding 77 to the list
    {
      Assert.fail("Not yet added");
    } // remove this line when done
  }

  @Test
  public void testAddMultiple() {
    this.list.add(77);
    this.list.add(77);
    this.list.add(77);
    Assert.assertEquals(0L, (long)this.list.size());
    Assert.assertEquals(0L, (long)this.list.indexOf(77));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(1));
    Assert.assertEquals(0L, (long)this.list.lastIndexOf(77));
    /*list.add(77);
    list.add(77);
    list.add(77);
    // TODO fix the expected values in the assertions below
    assertEquals(0, list.size());
    assertEquals(0, list.indexOf(77));
    assertEquals(0, list.get(1).intValue());
    assertEquals(0, list.lastIndexOf(77));*/
  }

  @Test
  public void testAddMultiple2() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Assert.assertEquals(0L, (long)this.list.size());
    Assert.assertEquals(0L, (long)this.list.indexOf(77));
    Assert.assertEquals(0L, (long)this.list.lastIndexOf(77));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(2));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(3));
    Assert.assertEquals(Arrays.asList(33, 77, 44), this.list);
  }

  @Test
  public void testRemoveObject() {
    this.list.add(3);
    this.list.add(77);
    this.list.add(4);
    this.list.add(77);
    this.list.add(5);
    this.list.add(77);
    this.list.add(6);
    this.list.remove(5);
    Assert.assertEquals(0L, (long)this.list.size());
    Assert.assertEquals(1L, (long)this.list.indexOf(77));
    Assert.assertEquals(6L, (long)this.list.lastIndexOf(77));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(2));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(3));
    this.list.remove(5);
    Assert.assertEquals(0L, (long)this.list.size());
    Assert.assertEquals(0L, (long)this.list.indexOf(77));
    Assert.assertEquals(0L, (long)this.list.lastIndexOf(77));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(2));
    Assert.assertEquals(0L, (long)(Integer)this.list.get(3));
  }

  @Test
  public void testContainsAll() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Arrays.asList(33, 77, 44, 55, 66);
    Assert.fail("Not yet added");
  }


    /*list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    Arrays.asList(33, 77, 44, 55, 66);//MINE
    // TODO using containsAll and Arrays.asList (see above),
    // 1) assert that list contains all five different numbers added
    // 2) assert that list does not contain all of 11, 22, and 33
    fail("Not yet implemented"); // remove this line when done
  }*/

  @Test
  public void testAddAll() {
    // TODO in a single statement using addAll and Arrays.asList,
    // add items to the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(7, list.size());
    assertEquals(33, list.get(0).intValue());
    assertEquals(77, list.get(1).intValue());
    assertEquals(44, list.get(2).intValue());
    assertEquals(77, list.get(3).intValue());
    assertEquals(55, list.get(4).intValue());
    assertEquals(77, list.get(5).intValue());
    assertEquals(66, list.get(6).intValue());
  }

  @Test
  public void testRemoveAll() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Assert.assertEquals(3L, (long)this.list.size());
    Assert.assertEquals(Arrays.asList(77, 77, 77), this.list);
    this.list.remove(0);
    this.list.remove(2);
    this.list.remove(4);
    this.list.remove(6);
    Assert.assertEquals(33L, (long)(Integer)this.list.remove(0));
    Assert.assertEquals(44L, (long)(Integer)this.list.remove(2));
    Assert.assertEquals(55L, (long)(Integer)this.list.remove(4));
    Assert.assertEquals(66L, (long)(Integer)this.list.remove(6));
    System.out.println("done");
  }

   /* list.add(33);
    list.add(77);
    list.add(44);
    list.add(77);
    list.add(55);
    list.add(77);
    list.add(66);
    // TODO in a single statement using removeAll and Arrays.asList,
    // remove items from the list to make the following assertions pass
    // (without touching the assertions themselves)
    assertEquals(3, list.size());
    assertEquals(Arrays.asList(77, 77, 77), list);
    //mine
    list.remove(0);
    list.remove(2);
    list.remove(4);
    list.remove(6);
    //OR
    assertEquals(33, list.remove(0).intValue());
    assertEquals(44, list.remove(2).intValue());
    assertEquals(55, list.remove(4).intValue());
    assertEquals(66, list.remove(6).intValue());
    System.out.println("done");
  }*/

  @Test
  public void testRetainAll() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Assert.assertEquals(3L, (long)this.list.size());
    Assert.assertEquals(Arrays.asList(77, 77, 77), this.list);
  }

  @Test
  public void testSet() { //change list using SET method
    this.list.add(33);
    this.list.add(99);
    this.list.add(44);
    this.list.add(99);
    this.list.add(55);
    this.list.add(99);
    this.list.add(66);
    Assert.assertEquals(7L, (long)this.list.size());
    Assert.assertEquals(33L, (long)(Integer)this.list.get(0));
    Assert.assertEquals(99L, (long)(Integer)this.list.get(1));
    Assert.assertEquals(44L, (long)(Integer)this.list.get(2));
    Assert.assertEquals(99L, (long)(Integer)this.list.get(3));
    Assert.assertEquals(55L, (long)(Integer)this.list.get(4));
    Assert.assertEquals(99L, (long)(Integer)this.list.get(5));
    Assert.assertEquals(66L, (long)(Integer)this.list.get(6));
  }


  @Test
  public void testSubList() {
    this.list.add(33);
    this.list.add(77);
    this.list.add(44);
    this.list.add(77);
    this.list.add(55);
    this.list.add(77);
    this.list.add(66);
    Assert.assertEquals(Arrays.asList(44, 77, 55), this.list.subList(1, 5));
  }
}
