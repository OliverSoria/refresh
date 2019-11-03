package mx.com.config.client.service;

import mx.com.config.client.model.Persona;
import mx.com.config.client.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PerosnaService {
    private Properties properties;

    @Autowired
    public PerosnaService(Properties properties) {
        this.properties = properties;
    }

    public Optional<Persona> getPersona(String id) {

        return properties.getPersonas().stream().filter(p -> p.getId().equals(Integer.valueOf(id))).findAny();

    }
}
