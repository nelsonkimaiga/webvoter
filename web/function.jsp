<%@page import="java.text.SimpleDateFormat"%>
<%!
public String nullconv(String str)
	 {	
	 	if(str==null)
	 		str="";
	 	else if(str.equals("null"))
	 		str="";
	 	else if((str.trim()).equals(""))
	 		str="";
	 	else if(str.equals(null))
	 		str="";
	 	else
	 		str=str.trim();
	 	return str;
	 }
	 
	 public int nullIntconv(String inv)
	{   
		int conv=0;
		if(inv==null)
		{
			inv="0";
		}
		else if((inv.trim()).equals("null"))
		{
			inv="0";
		}
		else if(inv.equals(""))
		{
			inv="0";
		}
		try{
			conv=Integer.parseInt(inv);
		}
		catch(Exception e)
		{}
		return conv;
	}
	
	String formatedDate="";
	String formatedDatetemp="";
    public String getDateFormat(java.util.Date sdate,String sFormat)
	{
		if(sdate==null)
		{
		 formatedDate="";
		}
		else
		if(sFormat==null)
		{
		 formatedDate="";
		}
		else
		formatedDatetemp=new SimpleDateFormat(sFormat).format(sdate);
	return formatedDatetemp;
	}
%>