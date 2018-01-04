package cz.ivosahlik.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



@RestController
public class HomeController {

	private final static Logger log = LoggerFactory.getLogger(HomeController.class);

	@Value("${spring.boot.war.profile.message}")
	private String message;

	@Value("${spring.boot.war.profile.env}")
	private String env;



	@RequestMapping("/")
	public String home(){

		log.info("###########################################");
		log.info("###########################################");
		log.info("##         	 " + env + "            ##");
		log.info(message);
		log.info("###########################################");
		log.info("###########################################");

		return message + " " + env;
	}


}
