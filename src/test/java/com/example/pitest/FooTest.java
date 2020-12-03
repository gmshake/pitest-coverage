package com.example.pitest;

import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Zhenlei Huang
 */
class FooTest {

	@Test
	@Disabled
	void testIsRuntimeRetentive() {
		assertTrue(Foo.isRuntimeRetentive(RetentionPolicy.RUNTIME));
	}

	@Test
	void testIsRuntimeRetentiveFalse() {
		assertFalse(Foo.isRuntimeRetentive(RetentionPolicy.SOURCE));
	}

	@Test
	void testPrivateConstructor() {
		assertThrows(UnsupportedOperationException.class, () -> {
			Constructor<Foo> constructor = Foo.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			try {
				constructor.newInstance();
			} catch (InvocationTargetException e) {
				throw e.getTargetException();
			}
		});
	}
}
