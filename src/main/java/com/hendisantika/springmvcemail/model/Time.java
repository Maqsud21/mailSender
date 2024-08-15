package com.hendisantika.springmvcemail.model;

import org.thymeleaf.spring6.ISpringTemplateEngine;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ITemplateResolver;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;

public class Time {
    private ISpringTemplateEngine templateEngine(ITemplateResolver resolver){
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.addDialect(new Java8TimeDialect());
        engine.setTemplateResolver(resolver);
        return engine;
    }
}
