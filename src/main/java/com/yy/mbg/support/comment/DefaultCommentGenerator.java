/**
 * @(#)DefaultCommentGenerator.java, Dec 15, 2015. 
 * 
 * Created by Hoswey
 * Modified by Liuzhian
 * Copyright 2015 Feigong, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package com.yy.mbg.support.comment;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;

public class DefaultCommentGenerator extends org.mybatis.generator.internal.DefaultCommentGenerator {

    public DefaultCommentGenerator() {
        super();
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();

        field.addJavaDocLine("/**");
        sb.append(" *  "); //$NON-NLS-1$
        sb.append(introspectedColumn.getRemarks());
        sb.append("     所属表： ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append("     字段名称：  ");
        sb.append(introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" */"); //$NON-NLS-1$
    }
    @Override
    public void addGetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();

        method.addJavaDocLine("/**"); //$NON-NLS-1$
        sb.append(" * 获取 "+introspectedColumn.getRemarks()+","); //$NON-NLS-1$
        method.addJavaDocLine(sb.toString());
        sb.setLength(0);
        sb.append(" * @return  "); //$NON-NLS-1$
        sb.append(introspectedColumn.getActualColumnName());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */"); //$NON-NLS-1$
    }
    @Override
    public void addSetterComment(Method method,
            IntrospectedTable introspectedTable,
            IntrospectedColumn introspectedColumn) {

        StringBuilder sb = new StringBuilder();

        method.addJavaDocLine("/**"); //$NON-NLS-1$
        sb.append(" * 设置"+introspectedColumn.getRemarks()+","); //$NON-NLS-1$
        sb.append(introspectedColumn.getActualColumnName());
        method.addJavaDocLine(sb.toString());
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param "); //$NON-NLS-1$
        sb.append(parm.getName());
        method.addJavaDocLine(sb.toString());
        method.addJavaDocLine(" */"); //$NON-NLS-1$
    }
}
