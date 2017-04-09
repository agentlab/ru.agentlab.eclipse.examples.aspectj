/**
 *
 */
package ru.agentlab.eclipse.examples.aspectj.java.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ru.agentlab.eclipse.examples.aspectj.java.HelloAspectJDemo;

/**
 * @author Ivanov_AM
 *
 */
public class MyActivator implements BundleActivator {

	@Override
	public void start(BundleContext context) throws Exception {
		HelloAspectJDemo.sayHello();
		System.out.println("--------"); //$NON-NLS-1$
		HelloAspectJDemo.sayHello();
		System.out.println("--------"); //$NON-NLS-1$
		HelloAspectJDemo.greeting();
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
	}
}
