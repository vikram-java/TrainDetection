package com.train.detection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.train.detection.services.RFIDServices;
import com.train.detection.services.TrainLogServices;

@Controller
public class ViewController {
	@Autowired
	RFIDServices rfidService;

	@Autowired
	TrainLogServices trainLogservice;

	@RequestMapping("/")
	public ModelAndView index() {
		try {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("index");
			modelAndView.addObject("TrainTagList", rfidService.getTrain());
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/view-train")
	public ModelAndView getTrainDetails(@RequestParam int trigoo) {
		try {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("TrainTagList");
			modelAndView.addObject("TrainTagList", rfidService.getTagId(trigoo));
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@GetMapping("/view-all")
	public ModelAndView getAll() {
		try {
			ModelAndView modelAndView = new ModelAndView();
			modelAndView.setViewName("AllData");
			modelAndView.addObject("getList", rfidService.getAllRFIDData());
			return modelAndView;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
