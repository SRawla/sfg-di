package com.example.sfg_di;

import com.example.sfg_di.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class,args);
		System.setProperty("spring.output.ansi.enabled", "ALWAYS");
		// bydefault sprin bean is as class name but with first letter with lowercase MyController = myController
		MyController controller = (MyController) context.getBean("myController");
		System.out.println(controller.sayHello());

		System.out.println("-------- Property injector controller ");
		PropertyInjectorController propertyInjectorController = (PropertyInjectorController) context.getBean("propertyInjectorController");
		System.out.println(propertyInjectorController.getGreetingService());


		System.out.println("-------- Setter injector controller ");
		SetterController setterController = (SetterController) context.getBean("setterController");
		System.out.println(setterController.getGreetingService());

		System.out.println("-------- Constructor injector controller ");
		ConstructorInjectorController constructorInjectorController = (ConstructorInjectorController) context.getBean("constructorInjectorController");
		System.out.println(constructorInjectorController.getGreetingService());

		System.out.println("-------- Profile Demo .");
		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());


	}

}
