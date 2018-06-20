package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestPerformance {

  // TODO run test and record running times for SIZE = 10, 100, 1000, 10000, ...
  // (choose in conjunction with REPS below up to an upper limit where the clock
  // running time is in the tens of seconds)
  // TODO (optional) refactor to DRY
  // which of the two lists performs better as the size increases?


  // TODO choose this value in such a way that you can observe an actual effect
  // for increasing problem sizes
  private final int SIZE = 1000;//10
  private final int REPS = 1000000;
  private List<Integer> arrayList;
  private List<Integer> linkedList;



  @Before
  public void setUp() throws Exception {
    this.arrayList = new ArrayList(10);
    this.linkedList = new LinkedList();

    for(int i = 0; i < 10; ++i) {
      this.arrayList.add(i);
      this.linkedList.add(i);
    }

  }

    /*arrayList = new ArrayList<Integer>(SIZE);
    linkedList = new LinkedList<Integer>();
    for (int i = 0; i < SIZE; i++) {
      arrayList.add(i);
      linkedList.add(i);
    }*/


  @After
  public void tearDown() throws Exception {
    this.arrayList = null;
    this.linkedList = null;
  }

  @Test
  public void testLinkedListAddRemove() {
    for(int r = 0; r < 1000000; ++r) {
      this.linkedList.add(0, 77);
      this.linkedList.remove(0);
    }
  }

  @Test
  public void testArrayListAddRemove() {
    for(int r = 0; r < 1000000; ++r) {
      this.arrayList.add(0, 77);
      this.arrayList.remove(0);
    }
  }

  @Test
  public void testLinkedListAccess() {
    long sum = 0L;

    for(int r = 0; r < 1000000; ++r) {
      sum += (long)(Integer)this.linkedList.get(r % 10);
    }
  }

  @Test
  public void testArrayListAccess() {
    long sum = 0L;

    for(int r = 0; r < 1000000; ++r) {
      sum += (long)(Integer)this.arrayList.get(r % 10);
    }
    }
  }

