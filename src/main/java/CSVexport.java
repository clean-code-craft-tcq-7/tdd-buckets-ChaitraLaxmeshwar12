public class CSVexport
{
  Map<String, Integer> rangeandCount = BucketRange.getRangeandReadings(readings);
		if (rangeandCount.size() > 0) {
			System.out.println("Range, Readings");
			for (Map.Entry<String, Integer> entry : rangeandCount.entrySet()) {
				System.out.println(entry.getKey() + ", " + entry.getValue());

			}
		}
}
