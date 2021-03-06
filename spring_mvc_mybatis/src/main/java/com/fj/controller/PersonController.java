package com.fj.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fj.Result;
import com.fj.domain.PersonDO;
import com.fj.service.PersonService;


@Controller
@RequestMapping(value = "/")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "")
	public String index() {
		return "index"; 
	}
	
	@RequestMapping(value = "insert")
	@ResponseBody
	public Result insert(@RequestBody PersonDO[] personDOArr)  {
		try {
			Integer count = personService.insert(Arrays.asList(personDOArr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result("200", true, "");
	}
	
	@RequestMapping(value = "update")
	@ResponseBody
	public Result update(@RequestBody PersonDO[] personDOArr)  {
		try {
			Integer count = 0;//personService.update(2, Arrays.asList(personDOArr));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result("200", true, "");
	} 
	
	@RequestMapping(value = "jp")
	public void jsonp(@RequestParam("callbackTest") String callbackTest, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.getWriter().write(callbackTest + "({name: \"jf\", age: \"12\"})");
	}
}
