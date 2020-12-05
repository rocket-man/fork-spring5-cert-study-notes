package org.spring.cert;

import org.spring.cert.beans.SpringBean1;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class FileSystemXmlApplicationContextExample {
    public static void main(String[] args) {
        String beansXmlLocationOnFileSystem = FileSystemXmlApplicationContextExample.class.
                getResource("/beans.xml").toExternalForm();
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(beansXmlLocationOnFileSystem);

        SpringBean1 bean = context.getBean(SpringBean1.class);
        bean.sayHello();
    }
}
