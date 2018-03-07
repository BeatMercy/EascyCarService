package beat.mercy.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import beat.mercy.common.conf.SteamResourseDetails;
import beat.mercy.common.util.JsonResult;
import beat.mercy.common.util.JsonUtils;
import beat.mercy.common.util.RestJsonResult;
import beat.mercy.entity.Customer;
import beat.mercy.repository.CustomerRepository;

@RestController
public class UserController {
	
//	private SteamIdAuthenticationService steamIdAuthService;

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPsswordEncoder;
	
	@PostMapping(value="/signup",consumes="application/json;charset=UTF-8")
	public String signUp(@RequestBody Customer customer) {
		Customer store;
		if((store = customerRepository.findByUsername(customer.getUsername()))==null) {
			customer.setPassword(bCryptPsswordEncoder.encode(customer.getPassword()));
			return JsonUtils.toJson(customerRepository.save(customer));
		}else {
			store.setPassword(bCryptPsswordEncoder.encode(customer.getPassword()));
			return JsonUtils.toJson(customerRepository.save(store));
		}
		
	}
	
    @RequestMapping(value = "/users", produces="application/json;charset=UTF-8")
    public String usersList() {
        ArrayList<String> users =  new ArrayList<String>(){{
            add("freewolf");
            add("tom");
            add("jerry");
        }};

        return JsonUtils.toJson(RestJsonResult.getSuccessResult(users, "success"));
//        return JsonResult.fillResultString(0, "", users);
    }
    
    @RequestMapping("/hello")
    public String hello(){  
        return "hello";  
    } 
    
//    @RequestMapping("/goSteam")
//    public void goSteam(HttpServletRequest request,HttpServletResponse response){
//    	String protocol="http://";
//    	if(!request.getProtocol().equals("HTTP/1.1")) {
//    		System.out.println(request.getProtocol());
//    		protocol="https://";
//    	}
//    	String redirectUrl = steamIdAuthService.tradeOpenId(protocol+request.getHeader("host")+"/steamAuth");
//    	try {
//			response.sendRedirect(redirectUrl);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//    
//    @RequestMapping("/steamAuth")
//    public void steamAuth(HttpServletRequest request,HttpServletResponse response){
//    	steamIdAuthService.valdiateSteamAccount(request, response);
//    }
}