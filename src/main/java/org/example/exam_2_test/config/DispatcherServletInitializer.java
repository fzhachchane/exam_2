package org.example.exam_2_test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("root");
        return new Class<?>[] { AppContext.class };  // root configuration
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("sevletConfig");
        return new Class<?>[] { WebMvcConfig.class }; // Configuring the Dispatcher Servlet
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" }; // Mapping the Dispatcher Servlet to the root path
    }


}
