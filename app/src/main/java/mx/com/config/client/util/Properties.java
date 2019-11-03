package mx.com.config.client.util;

import lombok.Value;
import mx.com.config.client.model.Persona;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Value
@Component
@ConfigurationProperties(prefix = "value")
public class Properties {
    private List<Persona> personas;
}
