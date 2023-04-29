package in.hiteshit.service;

import in.hiteshit.binding.LoginForm;
import in.hiteshit.binding.SignUpForm;
import in.hiteshit.binding.UnlockForm;



public interface UserService {
	
	public String login(LoginForm form); 
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String email);
	
	

}
