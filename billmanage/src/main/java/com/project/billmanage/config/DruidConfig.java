package com.project.billmanage.config;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * druid 配置类
 * author 王志超
 * 编写日期 2019年 10月 23日
 */
@Configuration
public class DruidConfig {
    //绑定数据源配置
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    @Bean
    public ServletRegistrationBean druidStatViewServle(){
        //配置后台的servlet
        //http://localhost:8080/druid/login.html 这是druid的管理页面url
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
        //以下的配置方式可以创建一个Map<String,String>然后把需要的字符串键值对添加进去，然后用bean.setInitParameter()直接添加
        //设置为允许自己访问
        servletRegistrationBean.addInitParameter("allow","127.0.0.1");
        //不允许这个ip地址的人访问
        servletRegistrationBean.addInitParameter("deny","192.168.1.73");
        //设置druid连接池监控页面的登录名和密码
        servletRegistrationBean.addInitParameter("loginUsername","admin");
        servletRegistrationBean.addInitParameter("loginPassword","123456");
        servletRegistrationBean.addInitParameter("resetEnable","false");
        return servletRegistrationBean;
    }
    //配置一个过滤器
    @Bean
    public FilterRegistrationBean druidStatFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //过滤所有的url请求
        filterRegistrationBean.addUrlPatterns("/*");
        //放行静态文件，不然会导致网页加载不正常
        filterRegistrationBean.addInitParameter("exclusions","*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
        return filterRegistrationBean;
    }
}
