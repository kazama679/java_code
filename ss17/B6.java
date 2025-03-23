package ss17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class B6 {
    public static void main(String[] args) {
        Set<Integer> setHashSet = new HashSet<>();
        setHashSet.add(10);
        setHashSet.add(20);
        setHashSet.add(30);
        setHashSet.add(40);
        Set<Integer> setHashSet2 = new HashSet<>();
        setHashSet2.add(30);
        setHashSet2.add(40);
        setHashSet2.add(50);
        setHashSet2.add(60);
        setHashSet.retainAll(setHashSet2);
        TreeSet<Integer> treeSet = new TreeSet<>(setHashSet);
        System.out.println("Điểm chung đã sắp xếp: "+treeSet);
    }
}
