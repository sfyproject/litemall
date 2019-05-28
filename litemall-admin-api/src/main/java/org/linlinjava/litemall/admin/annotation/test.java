package org.linlinjava.litemall.admin.annotation;

import org.linlinjava.litemall.admin.web.AdminGoodsController;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author： sunfy
 * @Date: Created in 12:33 2019-5-26
 */
public class test {
    public static void testA(List<Integer> rpds,Class<?> cl){
        for(Method m:cl.getDeclaredMethods()){
            RequiresPermissionsDesc requiresPermissionsDesc = m.getAnnotation(RequiresPermissionsDesc.class);
            if(requiresPermissionsDesc != null){
                System.out.println("--"+requiresPermissionsDesc.button()+"---"+requiresPermissionsDesc.menu().toString());
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> lis = new ArrayList<Integer>();
        testA(lis, AdminGoodsController.class);
    }
}
