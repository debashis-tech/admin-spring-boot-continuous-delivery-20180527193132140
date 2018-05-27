package com.ibm.account.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.ArrayList;
import java.io.*;

@Controller
public class AccountController {

	@RequestMapping(path="/test", method=RequestMethod.GET)
	public String test() {
		return "THIS IS A TEST!!!";
	}
}
