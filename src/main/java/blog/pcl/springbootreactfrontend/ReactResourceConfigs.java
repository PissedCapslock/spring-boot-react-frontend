package blog.pcl.springbootreactfrontend;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Adding the React front-end code to the path of resources served by Spring
 */
@Configuration
public class ReactResourceConfigs implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers( ResourceHandlerRegistry registry ) {
    registry.addResourceHandler( "/static/**" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/static/" );
    registry.addResourceHandler( "/*.js" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/" );
    registry.addResourceHandler( "/*.json" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/" );
    registry.addResourceHandler( "/*.ico" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/" );
    registry.addResourceHandler( "/*.png" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/" );
    registry.addResourceHandler( "/*.txt" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/" );
    registry.addResourceHandler( "/index.html" ).addResourceLocations( "/WEB-INF/view/react-frontend/build/index.html" );
  }
}
