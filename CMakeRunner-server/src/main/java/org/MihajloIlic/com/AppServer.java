package org.MihajloIlic.com;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;

import jetbrains.buildServer.serverSide.InvalidProperty;
import jetbrains.buildServer.serverSide.PropertiesProcessor;
import jetbrains.buildServer.serverSide.RunType;
import jetbrains.buildServer.serverSide.RunTypeRegistry;
import jetbrains.buildServer.web.openapi.PluginDescriptor;

public class AppServer extends RunType {
    private PluginDescriptor descriptor;

    public AppServer(RunTypeRegistry registry, PluginDescriptor descriptor){
        this.descriptor = descriptor;

        registry.registerRunType(this);
    }

    @NotNull
    @Override
    public String getType() {
        return AppCommon.APP_TYPE;
    }

    @NotNull
    @Override
    public String getDisplayName() {
        return AppCommon.APP_DISPLAY_NAME;
    }

    @NotNull
    @Override
    public String getDescription() {
        return AppCommon.APP_DESCRIPTION;
    }

    @Nullable
    @Override
    public PropertiesProcessor getRunnerPropertiesProcessor() {
        return new PropertiesProcessor() {
            @Override
            public Collection<InvalidProperty> process(Map<String, String> map) {
                return null;
            }
        };
    }

    @Nullable
    @Override
    public String getEditRunnerParamsJspFilePath() {
        return descriptor.getPluginResourcesPath("Edit.jsp");
    }

    @Nullable
    @Override
    public String getViewRunnerParamsJspFilePath() {
        return descriptor.getPluginResourcesPath("View.jsp");
    }

    @Nullable
    @Override
    public Map<String, String> getDefaultRunnerProperties() {
        return null;
    }
}