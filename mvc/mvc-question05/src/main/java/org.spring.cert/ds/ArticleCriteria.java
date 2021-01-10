package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleCriteria {
    private String bodyLike;

    @SuppressWarnings("unused")
    public ArticleCriteria() {
    }
}
