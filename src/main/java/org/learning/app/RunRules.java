package org.learning.app;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.learning.model.Employee;

public class RunRules {

    public static final void main(String[] args) {
        try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            Employee employee = new Employee("Suresh Kumar dervaraj",2001);
            Employee employee1 = new Employee("Logesh M",1998);
            kSession.insert(employee1);
            kSession.insert(employee);
            kSession.fireAllRules();
            System.out.println(employee.getName()+" : Message :"+employee.getMessage());
            System.out.println(employee1.getName()+" : Message :"+employee.getMessage());
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
