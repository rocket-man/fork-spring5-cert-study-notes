package org.spring.cert.java.java9;


import org.spring.cert.java.JavaEnvInfo;

class Java9EnvInfo implements JavaEnvInfo {
    @Override
    public void printJvmEnvInfo() {
        System.out.println("Java >=9 Env Info");
    }
}
