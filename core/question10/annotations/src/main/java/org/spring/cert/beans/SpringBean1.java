package org.spring.cert.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SpringBean1 {
    @Autowired
    private SpringBean2 springBean2;
    @Autowired
    private SpringBean3 springBean3;

    public SpringBean1(){
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

//   (1) This is constructor injection. For this the autowired of the class variables has to be removed
//    @Autowired
//    public SpringBean1(SpringBean2 springBean2, SpringBean3 springBean3){
//        this.springBean2 = springBean2;
//        this.springBean3 = springBean3;
//    }


//   (2) Another way is to do by setter injection. For this the autowired of the class variables has to be removed
//    @Autowired
//    public void setSpringBean2(SpringBean2 springBean2) {
//        this.springBean2 = springBean2;
//    }
//
//    Autowired
//    public void setSpringBean3(SpringBean3 springBean3) {
//        this.springBean3 = springBean3;
//    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(String.format("%s postConstruct with %s and %s",
                getClass().getSimpleName(), springBean2.getClass().getSimpleName(), springBean3.getClass().getSimpleName()  ));
    }

    public void sayHello(){
        System.out.println("Hello");
    }


}
