package com;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//服务方【provider】主方法
public class ServerMain {
	public static void main(String[] args) throws IOException {  
		  
        ClassPathXmlApplicationContext context 
        = new ClassPathXmlApplicationContext( 
        		new String[] { "applicationProvider.xml" });  
        context.start();  
  
        System.out.println("输入任意按键退出 ~ ");  
        System.in.read();  
        context.close();  
    }
}
