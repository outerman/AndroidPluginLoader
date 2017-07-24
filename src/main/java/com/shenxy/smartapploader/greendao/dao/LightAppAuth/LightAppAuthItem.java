package com.shenxy.smartapploader.greendao.dao.LightAppAuth;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table LightAppAuth.
 */
public class LightAppAuthItem {

    private String Id;
    private Integer appId;
    private String pluginName;
    private String pluginMethod;
    private Integer authValue;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public LightAppAuthItem() {
    }

    public LightAppAuthItem(String Id) {
        this.Id = Id;
    }

    public LightAppAuthItem(String Id, Integer appId, String pluginName, String pluginMethod, Integer authValue) {
        this.Id = Id;
        this.appId = appId;
        this.pluginName = pluginName;
        this.pluginMethod = pluginMethod;
        this.authValue = authValue;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginMethod() {
        return pluginMethod;
    }

    public void setPluginMethod(String pluginMethod) {
        this.pluginMethod = pluginMethod;
    }

    public Integer getAuthValue() {
        return authValue;
    }

    public void setAuthValue(Integer authValue) {
        this.authValue = authValue;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
