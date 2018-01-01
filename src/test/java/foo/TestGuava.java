package foo;

import java.util.Collection;

import junit.framework.TestCase;

import org.junit.Test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Multimap;
import com.google.common.collect.Table;

public class TestGuava extends TestCase {

	@Test
	public void testTableTest() {
		Table<String, Integer, String> aTable = HashBasedTable.create();
		aTable.put("A", 1, "A11");
		for (char a = 'A'; a <= 'C'; ++a) {

			for (Integer b = 1; b <= 4; ++b) {
				System.out.println(Character.toString(a) + "    " + b + "     "
						+ String.format("%c%d", a, b));
				aTable.put(Character.toString(a), b,
						String.format("%c%d", a, b));
			}
		}

		System.out.println(aTable.column(1));
		System.out.println(aTable.row("A"));
		System.out.println("ddddd---"+aTable.get("B", null));

		System.out.println(aTable.contains("D", 1));
		System.out.println(aTable.containsColumn(3));
		System.out.println(aTable.containsRow("C"));
		System.out.println(aTable.columnMap());
		System.out.println(aTable.rowMap());

		System.out.println(aTable.remove("B", 3));
	}

	@Test
	public void testMultiMap() {

		Multimap<String, StudentScore> scoreMultimap = ArrayListMultimap
				.create();
		Multimap<String, Multimap<String, StudentScore>> scoreMultimap1 = ArrayListMultimap
				.create();
		for (int i = 10; i < 20; i++) {
			StudentScore studentScore = new StudentScore();
			studentScore.CourseId = 1001 + i;
			studentScore.score = 100 - i;
			scoreMultimap.put("peida", studentScore);
		}
		System.out.println("scoreMultimap:" + scoreMultimap.size());
		System.out.println("scoreMultimap:" + scoreMultimap.keys());
		scoreMultimap1.put("11", scoreMultimap);
		Collection<StudentScore> studentScore = scoreMultimap.get("peida");
		studentScore.clear();
		StudentScore studentScoreNew = new StudentScore();
		studentScoreNew.CourseId = 1034;
		studentScoreNew.score = 67;
		studentScore.add(studentScoreNew);
		
		System.out.println("scoreMultimap:" + scoreMultimap.size());
		System.out.println("scoreMultimap:" + scoreMultimap.keys());
		System.out.println(scoreMultimap.toString());
	}

	class StudentScore {
		int CourseId;
		int score;
	}
	
}
