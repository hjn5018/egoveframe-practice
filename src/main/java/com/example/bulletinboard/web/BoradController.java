package com.example.bulletinboard.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoradController {
	@Resource("boardService")
	private boardService boardService;
	
	@RequestMapping("/list")
	public String boardList() {
		return "list";
	}
}
