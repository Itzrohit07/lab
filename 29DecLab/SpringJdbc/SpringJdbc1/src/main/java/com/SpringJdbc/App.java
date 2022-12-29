package com.SpringJdbc;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spconfig.xml");
        
        Dao dao = ac.getBean("DaoImpl", Dao.class);

        Student st = new Student();
        st.setId(1);
        st.setName("rohit");
        st.setEmail("rohit@gmail.com");
        st.setAge(20);
        st.setAddress("WB");
        
        int rs = dao.insert(st);
        System.out.println(rs);
    }
}
