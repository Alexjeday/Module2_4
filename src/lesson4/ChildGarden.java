package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Детский сад.
 */
public class ChildGarden {
    private List<Child>[] groups;

    public ChildGarden(int countGroups) {
        groups = new List[countGroups];
        for (int i = 0; i < groups.length; i++) {
            groups[i] = new ArrayList<>();
        }
    }

    public void addChild(Child child) {
        if (child.getYearBirth() % 3 == 0) {
            groups[0].add(child);
        } else if (child.getYearBirth() % 3 == 1) {
            groups[1].add(child);
        } else {
            groups[2].add(child);
        }


    }

    public List<Child>[] getGroups() {
        return groups;
    }

    public ChildGarden(List<Child>[] groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "ChildGarden{" +
                "groups=" + Arrays.toString(groups) +
                '}';
    }
}
