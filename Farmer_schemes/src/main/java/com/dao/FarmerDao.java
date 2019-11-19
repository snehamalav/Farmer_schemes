package com.dao;

import java.util.List;

import com.model.Farmer;

public interface FarmerDao {
	boolean register(Farmer farmer);
	/*Farmer validateUser(Farmer  farmer);
	  public List<Farmer> getUsers();
	  public boolean changepwd(String username,String opwd, String npwd);
	 // public QueryForm sendQuery(QueryForm queryForm);
*/}
