package cuongnguyen.tt.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
               WebSecurityConfig.class,
                PersistenceJPAConfig.class,
                SecurityApplicationInitializer.class,
                MailConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                SpringWebConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}