package kh.nodam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.nodam.domain.ChargeCoin;



@Controller
@RequestMapping("/coin")
public class CoinController {


	@GetMapping("/charge")
	public void chargeForm(Model model) throws Exception{
		ChargeCoin chargeCoin = new ChargeCoin();
		chargeCoin.setAmount(1000);
		model.addAttribute("chargeCoin",chargeCoin);
		
	}
	
	
}
