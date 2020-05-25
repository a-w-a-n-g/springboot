package com.seaboat.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seaboat.bean.Province;

/**

* @author seaboat
* @version 1.0
* @date 2020年5月24日 上午3:12:38
* 
*/

@RestController
public class MessageController {
	
	@RequestMapping(value = "/message", method = RequestMethod.GET)
	public String getMessage() {
		return "message";
	}
	
	@RequestMapping(value = "/setProvince/{province}", method = RequestMethod.GET)
	public String setProvince(@PathVariable("province") String province) {
		return province;
	}
	
	@RequestMapping(value = "/setProvince", method = RequestMethod.POST)
	public String setProvince(@RequestBody Province province) {
		return province.getName();
	}

}
