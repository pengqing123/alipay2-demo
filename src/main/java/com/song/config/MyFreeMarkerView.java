package com.song.config;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;
import java.util.Properties;

/**
 * Created by Song on 2017/11/6.
 */
public class MyFreeMarkerView extends FreeMarkerView {
    private static final String CONTEXT_PATH = "base";
    private static String documentDomain = "127.0.0.1";

    public MyFreeMarkerView() {
    }

    protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
        String appContext = request.getContextPath();
        StringBuilder basePath = new StringBuilder();
        basePath.append(request.getScheme()).append("://");
        basePath.append(request.getServerName());
        if(request.getServerPort() != 80) {
            basePath.append(":").append(request.getServerPort());
        }

        basePath.append(appContext);
        model.put("base", basePath.toString());
        model.put("documentDomain", documentDomain);
        super.exposeHelpers(model, request);
    }

   /* static {
        try {
            Resource classPathResource = new ClassPathResource("conf/web.properties");
            Properties properties = PropertiesLoaderUtils.loadProperties(classPathResource);
            documentDomain = (String)properties.get("document.domain");
        } catch (Exception var2) {
            ;
        }

    }*/
}
