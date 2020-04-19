package com.agile.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author by 佟盟 on 2018/11/23
 */
@ConfigurationProperties(prefix = "agile.swagger")
public class SwaggerConfigProperties {
    private boolean enable;
    private String title;
    private String description;
    private String termsOfServiceUrl;
    private String version;

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTermsOfServiceUrl() {
        return termsOfServiceUrl;
    }

    public void setTermsOfServiceUrl(String termsOfServiceUrl) {
        this.termsOfServiceUrl = termsOfServiceUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
