package com.yunlsp.framework.ingress.core;

import com.yunlsp.framework.ingress.IngressProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.io.Serializable;

import static com.yunlsp.framework.ingress.IngressProperties.INGRESS_PROPERTIES_PREFIX;

/**
 * {@link DefaultIngressProperties}
 *
 * @author <a href="mailto:iskp.me@gmail.com">Elve.Xu</a>
 * @version ${project.version} - 2020/3/23
 */
@Getter
@Setter
@ConfigurationProperties(prefix = INGRESS_PROPERTIES_PREFIX)
public class DefaultIngressProperties extends IngressProperties {

  @NestedConfigurationProperty private IngressResponseProperties response = new IngressResponseProperties();

  // ===

  @Getter
  @Setter
  public static class IngressResponseProperties implements Serializable {

    public static final String INGRESS_RESPONSE_PROPERTIES_PREFIX = INGRESS_PROPERTIES_PREFIX + ".response";

    private boolean transportServiceInstanceCookie = false;

  }

}
