package telran.interviews.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import telran.interviews.StreamTasks;

import static telran.interviews.StreamTasks.*
;class StreamTasksTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	@Disabled
	void displayOccurrencesTest() {
		String [] strings = {"lmn", "ab", "lmn", "c", "ab", "a", "lmn", "aaa"};
		displayOccurrences(strings);
	}
	@Test
	void displayOddEvenGroupingTest() {
		displayOddEvenGrouping(20);
	}
	
	  @Test
	    void printDigitStatisticsTest() {
	        StreamTasks.printDigitStatistics();
	    }

}
