package ru.agentlab.eclipse.examples.aspectj.java;

public class HelloAspectJDemo {

	public static void sayHello() {
		System.out.println("Hello"); //$NON-NLS-1$
	}

	public static void greeting() {
		String name = new String("John"); //$NON-NLS-1$
		sayHello();
		System.out.println(name);
	}
}
