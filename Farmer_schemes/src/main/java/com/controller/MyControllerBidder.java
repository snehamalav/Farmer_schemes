package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.model.Bidder;
import com.service.BidderService;

@Controller("myControllerbidder")
public class MyControllerBidder {

	@Autowired
	 public BidderService bidderService;

	 @RequestMapping(value = "/Bidderregister", method = RequestMethod.GET)
	  public ModelAndView showRegister2(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("Bidderreg");
	    mav.addObject("bidder", new Bidder());
	    return mav;
	  }
	 
	  @RequestMapping(value = "/Bidderregister", method = RequestMethod.POST)
	  public ModelAndView addbidder2(HttpServletRequest request, HttpServletResponse response,  @ModelAttribute("bidder") Bidder bidder, @RequestParam("file") MultipartFile files[]) 
	  {
		  String full_name = bidder.getFull_name();
			for (int i = 0; i < files.length; i++) {
				String filename="";
				if(i==0)
					filename=(full_name+i)+".jpg";//+".pdf";
					else if(i==1)
						filename=(full_name+i)+".jpg";//+".pdf";
					else if(i==2)
						filename=(full_name+i)+".jpg";//+".jpg";
				MultipartFile file = files[i];
				try {
					byte[] bytes = file.getBytes();

					// Creating the directory to store file
					String rootPath = System.getProperty("catalina.home");
					File dir = new File(rootPath + File.separator + "tmpFiles");
					if (!dir.exists())
						dir.mkdirs();

					// Create the file on server
					File serverFile = new File(dir.getAbsolutePath()+ File.separator + filename);
					BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
					stream.write(bytes);
					stream.close();
					
					if(i==0)
                   bidder.setAdhar_fname(filename);
					else if(i==1)
						bidder.setPan_fname(filename);
					else if(i==2)
						bidder.setTrader_license_fname(filename);
					bidder.setStatus("N");
					
					System.out.println("Server File Location="+ serverFile.getAbsolutePath());
					} catch (Exception e) {
					System.out.println( "You failed to upload " + (full_name+i) + " => " + e.getMessage());
				}
			}  
		  
		boolean flag=bidderService.register(bidder);
	    if(flag) {
	    ModelAndView mav = new ModelAndView("login");
	    mav.addObject("login", new Bidder());
	    return mav;
	    }
	    else {
	    	ModelAndView mav = new ModelAndView("Bidderreg");
	        mav.addObject("bidder", new Bidder());
	        mav.addObject("status","Sorry! Registration in incomplete");
	        return mav;	
	    }
	  }
	
	
}
