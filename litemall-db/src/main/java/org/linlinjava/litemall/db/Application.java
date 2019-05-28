package org.linlinjava.litemall.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootApplication:https://www.cnblogs.com/duanxz/p/3756364.html
 * 发现@SpringBootApplication是一个复合注解，包括@ComponentScan，和@SpringBootConfiguration，@EnableAutoConfiguration。
 * SpringBootConfiguration继承自@Configuration，
 * 二者功能也一致，标注当前类是配置类，并会将当前类内声明的一个或多个以@Bean注解标记的方法的实例纳入到srping容器中，并且实例名就是方法名。
 * EnableAutoConfiguration的作用启动自动的配置，@EnableAutoConfiguration注解的意思就是Springboot根据你添加的jar包来配置你项目的默认配置，
 * 比如根据spring-boot-starter-web ，来判断你的项目是否需要添加了webmvc和tomcat，
 * 就会自动的帮你配置web项目中所需要的默认配置。在下面博客会具体分析这个注解，快速入门的demo实际没有用到该注解。
 * ComponentScan，扫描当前包及其子包下被@Component，@Controller，@Service，@Repository注解标记的类并纳入到spring容器中进行管理。
 * 是以前的<context:component-scan>（以前使用在xml中使用的标签，用来扫描包配置的平行支持）。所以本demo中的User为何会被spring容器管理。
 *      参数：String[] scanBasePackages() default {}:
 *            指定扫描包，参数是包名的字符串数组。
 *
 * MapperScan:https://blog.csdn.net/u013059432/article/details/80239075
 * 之前是，直接在Mapper类上面添加注解@Mapper，这种方式要求每一个mapper类都需要添加此注解，麻烦。
 * 通过使用@MapperScan可以指定要扫描的Mapper类的包的路径// 添加对mapper包扫描
 * 同时,使用@MapperScan注解多个包  @MapperScan({"com.kfit.demo","com.kfit.user"})
 * 如果mapper类没有在Spring Boot主程序可以扫描的包或者子包下面，可以使用如下方式进行配置@MapperScan({"com.kfit.*.mapper","org.kfit.*.mapper"})
 */
@SpringBootApplication(scanBasePackages = {"org.linlinjava.litemall.db"})
@MapperScan("org.linlinjava.litemall.db.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}