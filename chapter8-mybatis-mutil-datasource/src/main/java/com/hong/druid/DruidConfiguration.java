package com.hong.druid;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: DruidConfiguration
 * @Description: (druid 配置. 这样的方式不需要添加注解：@ServletComponentScan)
 * @author
 * @date 2017/5/2
 * @version v1.1
 */

/**
 * 两种方式配置监控统计功能:
 * 1.使用了原生的servlet，filter方式，然后通过@ServletComponentScan进行启动扫描包的方式进行处理的，你会发现我们的servlet，filter根本没有任何的编码。
 * 2.在这里我们将使用另外一种方式进行处理：使用代码注册Servlet：
 */
//@Configuration
//public class DruidConfiguration {
//
//    /**
//     * 注册一个StatViewServlet
//     * @return
//     */
//    @Bean
//    public ServletRegistrationBean DruidStatViewServle2(){
//        //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.
//        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid2/*");
//
//        //添加初始化参数：initParams
//
//        //白名单：
//        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
//        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
//        servletRegistrationBean.addInitParameter("deny","192.168.1.73");
//        //登录查看信息的账号密码.
//        servletRegistrationBean.addInitParameter("loginUsername","admin2");
//        servletRegistrationBean.addInitParameter("loginPassword","123456");
//        //是否能够重置数据.
//        servletRegistrationBean.addInitParameter("resetEnable","false");
//        return servletRegistrationBean;
//    }
//
//    /**
//     * 注册一个：filterRegistrationBean
//     * @return
//     */
//    @Bean
//    public FilterRegistrationBean druidStatFilter2(){
//
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
//
//        //添加过滤规则.
//        filterRegistrationBean.addUrlPatterns("/*");
//
//        //添加不需要忽略的格式信息.
//        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid2/*");
//        return filterRegistrationBean;
//    }
//}
