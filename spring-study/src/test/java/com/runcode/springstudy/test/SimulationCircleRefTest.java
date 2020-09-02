package com.runcode.springstudy.test;

import com.runcode.springstudy.simulationcircleref.A;
import com.runcode.springstudy.simulationcircleref.B;
import com.runcode.springstudy.simulationcircleref.SimulationBeanFactory;

public class SimulationCircleRefTest {
	public static void main(String[] args) {
		Class[] classes = {A.class, B.class};

		for (Class cls : classes){
			SimulationBeanFactory.getBean(cls);
		}

		System.out.println(SimulationBeanFactory.getBean(B.class).getA() == SimulationBeanFactory.getBean(A.class));
		System.out.println(SimulationBeanFactory.getBean(A.class).getB() == SimulationBeanFactory.getBean(B.class));
	}
}
