package week_11;

import java.util.ArrayList;
import java.util.*;

interface IPhone {
	void call();

	void close();
}

public class AnonymousClass {
	public static void main(String[] args) {

		IPhone iPhone = new IPhone() {
			@Override
			public void call() {
				System.out.println("Hey Siri.");
			}

			@Override
			public void close() {
				System.out.println("Bye.");

			}
		};

		iPhone.call();
		iPhone.close();
	}

	private static boolean arrList(Object object) {
		// TODO Auto-generated method stub
		return false;
	}
}