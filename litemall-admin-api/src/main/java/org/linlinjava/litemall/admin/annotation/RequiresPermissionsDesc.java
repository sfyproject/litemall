package org.linlinjava.litemall.admin.annotation;

import org.apache.shiro.authz.annotation.RequiresPermissions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解：https://www.cnblogs.com/keyi/p/6797282.html \ https://www.cnblogs.com/keyi/p/6797302.html
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPermissionsDesc {
//    int id() default -1;
    String button();
    String[] menu();
}
