package ru.agentlab.eclipse.examples.aspectj.aspects;

import ru.agentlab.eclipse.examples.aspectj.java.HelloAspectJDemo;

public aspect HelloAspectJ {

	// Define a Pointcut is
	// collection of JoinPoint call sayHello of class HelloAspectJDemo.
	pointcut callSayHello(): call(void HelloAspectJDemo.sayHello(..));

	before() : callSayHello() {
		System.out.println("AspectJ: before callSayHello"); //$NON-NLS-1$
	}

	after() : callSayHello()  {
		System.out.println("AspectJ: after callSayHello"); //$NON-NLS-1$
	}
}
