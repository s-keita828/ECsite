package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemCreateCompleteAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String itemPrice;
	private String itemStock;
	private Map<String,Object> session;
	private ItemCreateCompleteDAO ItemCreateCompleteDAO = new ItemCreateCompleteDAO();

	public String execute() throws SQLException{
		ItemCreateCompleteDAO.cerateItem(session.get("itemName").toString(),session.get("itemPrice").toString(),session.get("itemStock").toString());

		String result = SUCCESS;

		return result;
	}
	public String getLoginItemName() {
		return itemName;
	}
	public void setLoginUserId(String itemName) {
		this.itemName = itemName;
	}
	public String getitemPrice() {
		return itemPrice;
	}
	public void setLoginPassword(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getitemStock() {
		return itemStock;
	}
	public void setitemStock(String itemStock) {
		this.itemStock = itemStock;
	}
	public Map<String, Object> getSession(){
		return this.session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
