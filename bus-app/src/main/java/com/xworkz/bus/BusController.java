package com.xworkz.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.bus.dao.BusDAO;
import com.xworkz.bus.entity.BusEntity;
import com.xworkz.bus.service.BusServiceImpl;

@Component
@RequestMapping("/")
public class BusController{
	
	@Autowired
	private BusServiceImpl busServiceImpl;
	
	public BusController() {
    System.out.println(getClass().getSimpleName()+" servlet created");
	}
	
	@RequestMapping("/getMyResume")
	public String getMyResume() {
		System.out.println("Invoked getMyResume()");
		return "/WEB-INF/SHRISHAIL HERAKAL_RESUME_2022.pdf";
	}
	
	@RequestMapping("/getMyWorld")
	public String getMyWorld() {
		System.out.println("Invoked getMyWorld");
		return "/WEB-INF/InShot_20210323_205627819.mp4";
	}
	
	@RequestMapping("/getMyVideo")
	public String getMyVideo(){
		System.out.println("Invoked getMyVideo");
		return "/WEB-INF/My_Video.mp4";
	}
	
	@RequestMapping("/getMyImage")
	public String getMyImage() {
		System.out.println("Invoked getMyImage");
		return "/WEB-INF/Images/PicsArt_09-02-01.22.56.jpg";
	}
	
	@RequestMapping("/getYoutubeLink")
	public String getYoutubeLink() {
		System.out.println("Invoked getYoutubeLink");
		return "/WEB-INF/Youtube.html";
	}
	
	@RequestMapping("/getIntroductionFile")
	public String getIntroductionFile() {
		System.out.println("Invoked getIntroductionFile");
		return "/WEB-INF/Introduction.html";
	}
	
	@RequestMapping("/readValueFromFile")
	public String readValueFromFile(@RequestParam int busId,  @RequestParam String busName,@RequestParam String busColour,@RequestParam int busSeats,
			@RequestParam int busWheels,@RequestParam String busType) {
		System.out.println("Invoked readValueFromFile");
		System.out.println("busId-"+busId);
		System.out.println("busName-"+busName);
		System.out.println("busColour-"+busColour);
		System.out.println("busSeats-"+busSeats);
		System.out.println("busWheels-"+busWheels);
		System.out.println("busType-"+busType);
		return "/WEB-INF/Introduction.html";
   }
   
	@RequestMapping("/validateBusEntity")
	public String validateBusEntity(BusEntity busEntity) {
		busServiceImpl.validateBusEntity(busEntity);
		System.out.println("Invoked validateBusEntity");
		busServiceImpl.saveBus(busEntity);
		System.out.println("Saved Successfully");
		return "/WEB-INF/Introduction.html";
	}
  }
     
