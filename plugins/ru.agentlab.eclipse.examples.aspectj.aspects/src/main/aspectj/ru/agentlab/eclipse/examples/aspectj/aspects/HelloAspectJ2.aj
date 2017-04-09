package ru.agentlab.eclipse.examples.aspectj.aspects;

public aspect HelloAspectJ2 {

	// Define a Pointcut is
	// collection of JoinPoint call sayHello of class HelloAspectJDemo.
	pointcut callSayHello2(): call(* ru.agentlab.eclipse.examples.aspectj.aspects.HelloAspectJDemo2.sayHello());

	before() : callSayHello2() {
		System.err.println("WORK"); //$NON-NLS-1$
	}

	after() : callSayHello2()  {
		System.err.println("WORK"); //$NON-NLS-1$
	}
}
