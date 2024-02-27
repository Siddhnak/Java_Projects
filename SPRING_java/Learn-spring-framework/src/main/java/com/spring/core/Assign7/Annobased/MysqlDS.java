package com.spring.core.Assign7.Annobased;

import org.springframework.stereotype.Component;
@Component
public class MysqlDS implements DataSource {


    @Override
    public String[] getEmails() {
        String[] emails={"hulk@mysql.com" ,"byebye@mysql.com"
                , "tata123@mysql.com"};
        return emails;
    }
}
