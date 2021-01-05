package org.spring.cert.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomStatusHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.status("system-stopped")
                .withDetail("current-status", "paused")
                .build();
    }
}
