package prepare.algorithm.warmup;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class compare_the_tripletsTest {
	
	compare_the_triplets obj = new compare_the_triplets();

	@Test
	void testCompareTriplets() {
		
		List<Integer> alice = List.of();
		List<Integer> bob = List.of();
		List<Integer> ans = List.of();
		assertEquals(ans, obj.compareTriplets(alice, bob));
		
		fail("Not yet implemented");
	}

}
