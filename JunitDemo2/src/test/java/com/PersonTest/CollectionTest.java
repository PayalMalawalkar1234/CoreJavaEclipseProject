package com.PersonTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CollectionTest {

	// creating variables
		private Object first;
		private Object second;
		private List<Object> list;

		@BeforeEach
		void createCollection() {
			first = new Object();
			second = new Object();
			System.out.println("Objects are ready..........");
			Object ar[] = { first, second };
			list = Arrays.asList(ar);
		}

		@DisplayName("Size of collection test")
		@Test
		void checkSize() {
			assertThat(list).hasSize(2);
		}

}
