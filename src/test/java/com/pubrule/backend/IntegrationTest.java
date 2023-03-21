package com.pubrule.backend;

import com.pubrule.backend.PubruleApp;
import com.pubrule.backend.config.AsyncSyncConfiguration;
import com.pubrule.backend.config.EmbeddedElasticsearch;
import com.pubrule.backend.config.EmbeddedMongo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { PubruleApp.class, AsyncSyncConfiguration.class })
@EmbeddedMongo
@EmbeddedElasticsearch
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
