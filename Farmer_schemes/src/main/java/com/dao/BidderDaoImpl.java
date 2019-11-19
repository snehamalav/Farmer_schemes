package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Bidder;
@Repository("daoBidder")
public class BidderDaoImpl implements BidderDao {

	public boolean register(Bidder bidder) {
		// TODO Auto-generated method stub
		return false;
	}

	public Bidder validateUser(Bidder bidder) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Bidder> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean changepwd(String username, String opwd, String npwd) {
		// TODO Auto-generated method stub
		return false;
	}

}
