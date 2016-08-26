/**
 * Created by josonLiu
 */
package com.yy.mbg.support.plugins;
import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class CustomStatementPlugin extends PluginAdapter {
    public CustomStatementPlugin() {
    }

    @Override
    public void initialized(IntrospectedTable introspectedTable) {
        introspectedTable.setUpdateByPrimaryKeySelectiveStatementId("updateByPrimaryKey"); //方法重命名
    }
    public boolean validate(List<String> warnings) {
        return true;
    }
    public boolean clientInsertSelectiveMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean clientInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean sqlMapInsertSelectiveElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }

    public boolean providerInsertSelectiveMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean clientUpdateByPrimaryKeyMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean clientUpdateByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean sqlMapUpdateByPrimaryKeyElementGenerated(XmlElement element, IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean providerUpdateByPrimaryKeyMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement element,
            IntrospectedTable introspectedTable) {
        return false;
    }
    public boolean providerUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method method, TopLevelClass topLevelClass,
            IntrospectedTable introspectedTable) {
        return false;
    }
    /**
     * 为自动生成的插入方法生成注释
     */
    @Override
    public boolean clientInsertMethodGenerated(Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 根据主键插入纪录：     表 "+introspectedTable.getFullyQualifiedTable());
        method.addJavaDocLine("**/");
        return true;
    }
    /**
     * 为自动生成的根据主键获取纪录生成注释
     */
    @Override
    public boolean clientSelectByPrimaryKeyMethodGenerated(Method method,
            Interface interfaze, IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 根据主键获取纪录：     表 "+introspectedTable.getFullyQualifiedTable());
        method.addJavaDocLine("**/");
        return true;
    }
    /**
     * 为自动生成的根据主键删除纪录生成注释
     */
    public boolean clientDeleteByPrimaryKeyMethodGenerated(Method method,
            Interface interfaze, IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 根据主键删除纪录：     表 "+introspectedTable.getFullyQualifiedTable());
        method.addJavaDocLine("**/");
        return true;
    }
    /**
     * 为自动生成的根据主键更新纪录生成注释
     */
    public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method method,
            Interface interfaze, IntrospectedTable introspectedTable) {
        method.addJavaDocLine("/**");
        method.addJavaDocLine("* 根据主键更新纪录：     表 "+introspectedTable.getFullyQualifiedTable());
        method.addJavaDocLine("**/");
        return true;
    }
}
