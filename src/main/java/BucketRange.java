import java.util.LinkedHashMap;
import java.util.Map;
public class BucketRange
{
  
  public static void printRangeandReadings(int[] readings) {
		Map<String, Integer> rangeandCount = getRangeandReadings(readings);
		if (rangeandCount.size() > 0) {
			System.out.println("Range, Readings");
			for (Map.Entry<String, Integer> entry : rangeandCount.entrySet()) {
				System.out.println(entry.getKey() + ", " + entry.getValue());

			}
		}
	}

	  public static String getRange(int firstPoint, int lastPoint) {
		String range = null;
		if (firstPoint == lastPoint)
			range = String.valueOf(firstPoint);
		else
			range = String.valueOf(firstPoint) + "-" + String.valueOf(lastPoint);
		return range;
	}

	public static Map<String, Integer> getRangeandReadings(int[] readings) {
		Map<String, Integer> rangeandCount = new LinkedHashMap<String, Integer>();
		if (readings.length > 1) {
			int count = 1;
			int minInRange = readings[0], maxInRange = readings[0];
			for (int i = 1; i < readings.length; i++) {
				if ((readings[i] == readings[i - 1]) || (readings[i] == readings[i - 1] + 1)) {
					count++;
				} else {
					maxInRange = readings[i - 1];
					rangeandCount.put(getRange(minInRange, maxInRange), count);
					count = 1;
					minInRange = readings[i];
				}
			}
			maxInRange = readings[readings.length - 1];
			rangeandCount.put(getRange(minInRange, maxInRange), count);
		}
		return rangeandCount;
	}
}
