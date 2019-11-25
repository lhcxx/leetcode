package leetcode;

import java.util.Iterator;
import java.util.List;

public class _281_ZigzagIterator {

	Iterator<Integer> i, j, tmp;

	public _281_ZigzagIterator(List<Integer> v1, List<Integer> v2) {
		i = v2.iterator();
		j = v1.iterator();
	}

	public int next() {
		if (j.hasNext()) {
			tmp = j;
			j = i;
			i = tmp;
		}
		return i.next();
	}

	public boolean hasNext() {
		return i.hasNext() || j.hasNext();
	}
}
