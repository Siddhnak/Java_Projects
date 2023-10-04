package com.spring.core.Assign7.Annobased;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary /*This will tell the spring bean.. that its supposed to create for PStgre only
*/
public class PostgreSqlDs implements DataSource{

    @Override
    public String[] getEmails() {

    String[] emails={"hulk@psg.com" ,"byebye@psg.com"
            , "tata123@psg.com"};
    return emails;
    }
}
