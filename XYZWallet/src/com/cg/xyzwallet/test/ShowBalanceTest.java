package com.cg.xyzwallet.test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.xyzwallet.bean.AccountBean;
import com.cg.xyzwallet.bean.CustomerBean;
import com.cg.xyzwallet.service.AccountServiceImpl;
import com.cg.xyzwallet.service.IAccountService;

public class ShowBalanceTest {

	private static IAccountService service = null;
	
	
@BeforeClass 
public static void createInstance() {
    service = new AccountServiceImpl();
}

@Test
public void testShowBalance() throws Exception {
	
	
}


}
