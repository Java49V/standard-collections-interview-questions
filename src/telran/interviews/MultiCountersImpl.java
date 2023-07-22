package telran.interviews;

import java.util.*;

public class MultiCountersImpl implements MultiCounters {
    private Map<Object, Integer> counterMap;

    public MultiCountersImpl() {
        counterMap = new HashMap<>();
    }

    @Override
    public Integer addItem(Object item) {
        int count = counterMap.getOrDefault(item, 0);
        count++;
        counterMap.put(item, count);
        return count;
    }

    @Override
    public Integer getValue(Object item) {
        return counterMap.get(item);
    }

    @Override
    public boolean remove(Object item) {
        return counterMap.remove(item) != null;
    }

    @Override
    public Set<Object> getMaxItems() {
        Set<Object> maxItems = new HashSet<>();
        int maxCount = 0;

        for (Map.Entry<Object, Integer> entry : counterMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                maxItems.clear();
                maxItems.add(entry.getKey());
            } else if (count == maxCount) {
                maxItems.add(entry.getKey());
            }
        }

        return maxItems;
    }
}
