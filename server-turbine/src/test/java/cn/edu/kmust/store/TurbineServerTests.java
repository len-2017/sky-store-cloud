package cn.edu.kmust.store;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TurbineServerTests {

	public static final Logger LOGGER = LoggerFactory.getLogger(TurbineServerTests.class);

	@Test
	public void contextLoads() {
	}

	@Value("${server.port}")
	public String port;


	@Test
	public void testConfig(){

		LOGGER.info("server.port = " + port);
	}

}
