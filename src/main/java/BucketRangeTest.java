import org.junit.Assert.assertEquals;
import org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.junit.Test;


public class BucketRangeTest
{
        @Test
	public void testRangeCreater() {
		Map<String,Integer> rangeandcount;
		Map.Entry<String, Integer> Entry;
		//sample test
		rangeandcount= App.getRangeandReadings(new int[]{4,5});
		Map.Entry<String, Integer> firstEntry = rangeandcount.entrySet().iterator().next();
		assertEquals("4-5",firstEntry.getKey());
		assertEquals(new Integer(2),firstEntry.getValue());
		
		// same numbers
		rangeandcount = App.getRangeandReadings(new int[]{5,5,5,5});
		Entry = rangeandcount.entrySet().iterator().next();
		assertEquals("5",Entry.getKey());
		assertEquals(new Integer(4),Entry.getValue());
		
		// unsorted array
		rangeandcount = App.getRangeandReadings(new int[]{2,6,4,5,3});
		Entry = rangeandcount.entrySet().iterator().next();
		assertEquals("2-6",Entry.getKey());
		assertEquals(new Integer(5),Entry.getValue());
		
	}

}
