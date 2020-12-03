package com.example.pitest;

import java.lang.annotation.RetentionPolicy;

/**
 * @author Zhenlei Huang
 */
public final class Foo {

	public static boolean isRuntimeRetentive(RetentionPolicy retentionPolicy) {
		switch (retentionPolicy) {
			// see https://stackoverflow.com/questions/1970713/reference-to-public-enum-results-in-anonymous-class
			// see https://stackoverflow.com/questions/1834632/java-enum-and-additional-class-files
			case RUNTIME:
				return true;
			default:
				return false;
		}
	}

	private Foo() {
		throw new UnsupportedOperationException();
	}
}
