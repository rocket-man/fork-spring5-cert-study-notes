package org.spring.cert.java.java8;


import org.spring.cert.java.JavaEnvInfo;

class Java8EnvInfo implements JavaEnvInfo {
    @Override
    public void printJvmEnvInfo() {
        System.out.println("Java <=8 Env Info");
    }
}
