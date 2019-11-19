package com.dao;

import java.util.List;

import com.model.Bidder;


public interface BidderDao {
	boolean register(Bidder bidder);
	Bidder validateUser(Bidder bidder);
	  public List<Bidder> getUsers();
	  public boolean changepwd(String username,String opwd, String npwd);
	 // public QueryForm sendQuery(QueryForm queryForm);
}
