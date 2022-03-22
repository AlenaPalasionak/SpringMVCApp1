package org.palasionak.spring.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//Для замены файла web.xml
public class MySpringMVCDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {// метод возвращает класс определяющий спринг-конфигурации
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {// Все запросы от пользователя посылаем на DispetcherServlet
        return new String[] {"/"};
    }
}
