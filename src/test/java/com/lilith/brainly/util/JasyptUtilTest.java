package com.lilith.brainly.util;

import com.lilith.brainly.BrainlyApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @Author:JiaJingnan
 * @Date: 下午8:19 2021/6/15
 */
public class JasyptUtilTest extends BrainlyApplicationTests {

    @Autowired
    private JasyptUtil jasyptUtil;

    @Test
    public void getEncryptResult() {
        String usernameEncryptRes = jasyptUtil.getEncryptResult("123");
        String passwordEncryptRes = jasyptUtil.getEncryptResult("456");
        System.out.println(usernameEncryptRes);
        System.out.println(passwordEncryptRes);

    }

    @Test
    public void getDecryptResult() {


    }
}