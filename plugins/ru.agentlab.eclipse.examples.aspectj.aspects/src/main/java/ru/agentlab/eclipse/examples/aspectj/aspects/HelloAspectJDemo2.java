package ru.agentlab.eclipse.examples.aspectj.aspects;

public class HelloAspectJDemo2 {

	public static void sayHello() {
		System.out.println("Hello"); //$NON-NLS-1$
	}

	public static void greeting() {
		String name = new String("John"); //$NON-NLS-1$
		sayHello();
		System.out.print(name);
	}

	public static void main(String[] args) {
		sayHello();
		System.out.println("--------"); //$NON-NLS-1$
		sayHello();
		System.out.println("--------"); //$NON-NLS-1$
		greeting();
	}
}
