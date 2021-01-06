package org.spring.cert.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.spring.cert.entity.City;

@Data
@AllArgsConstructor
public class Cities {
    private Iterable<City> cities;

    @SuppressWarnings("unused")
    public Cities() {
    }
}
