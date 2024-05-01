package com.xiancai.lora.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 权限校验
 *
 * @author yupi
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthCheck {

    /**
     * 有任何一个角色
     *
     * @return
     */
    int[] anyRole() default 0;

    /**
     * 必须有某个角色
     *
     * @return
     */
    int mustRole() default -1;

}
