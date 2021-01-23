package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Statistics {
    private int numberOfCharacters;
    private int codeLength;
    private int firstNameLength;
    private int lastNameLength;

    public Statistics() {
    }
}
