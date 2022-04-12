package com.helper;

import org.openqa.selenium.WebDriver;

import com.pom.Dress_page;
import com.pom.Home_page1;
import com.pom.Select_Category;
import com.pom.Sign_Out;
import com.pom.Tshirt_purchase;
import com.pom.login_page;
import com.pom.payment_page;
import com.pom.proceed1_page;
import com.pom.proceed3_page;
import com.pom.proceed_address;
import com.pom.proceed_page;
import com.pom.submit_page;

public class Page_Object_Manager
{
	public WebDriver driver;
	private Home_page1 hp1;
	private login_page lp;
	private Dress_page dp;
	private proceed_page pg;
	private proceed1_page pg1;
	private proceed_address pa;
	private proceed3_page pg3;
	private payment_page pp;
	private submit_page sp;
	private Sign_Out so;
	private Select_Category sc;
	private Tshirt_purchase ts;
	

	public Page_Object_Manager(WebDriver driver2)
	{
		this.driver=driver2;
	}
	public Home_page1 get_instance_hp1() 
	{
		if(hp1==null)
		{
			hp1=new Home_page1(driver);
		}
		return hp1;
	}
	public login_page get_instance_lp() 
	{
		if(lp==null)
		{
			lp=new login_page(driver);
		}
		
		return lp;
	}
	public Dress_page get_instance_Dp()
	{
		if(dp==null)
		{
			dp= new Dress_page(driver);
		}
		
		return dp;
	}
	public proceed_page get_instance_Pg() 
	{
		if(pg==null)
		{
			pg=new proceed_page(driver);
		}
		
		return pg;
	}
	public proceed1_page get_instance_Pg1() 
	{
		if(pg1==null)
		{
			pg1=new proceed1_page(driver);
		}
		
		return pg1;
	}
	public proceed_address get_instance_Pa()
	{
		if(pa==null)
		{
			pa=new proceed_address(driver);
		}
		
		return pa;
	}
	public proceed3_page get_instance_Pg3() 
	{
		if(pg3==null)
		{
			pg3=new proceed3_page(driver);
		}
		
		return pg3;
	}
	public payment_page get_instance_Pp()
	{
		if(pp==null)
		{
			pp=new payment_page(driver);
		}
		
		return pp;
	}
	public submit_page get_instance_Sp() 
	{
		if(sp==null)
		{
			sp=new submit_page(driver);
		}
		
		return sp;
	}
	public Sign_Out get_instance_So() 
	{
		if(so==null)
		{
			so=new Sign_Out(driver);
		}
		
		return so;
	}
	public Select_Category get_instance_Sc() 
	{
		if(sc==null)
		{
			sc=new Select_Category(driver);
		}
		
		return sc;
	}
	
	public Tshirt_purchase get_instance_ts() {
		if(ts==null)
		{
			ts=new Tshirt_purchase(driver);
		}
		return ts;
	}
	
		

}
