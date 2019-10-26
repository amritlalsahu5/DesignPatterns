package com.codehangouts.designpattern.visitor;

public interface IShoppingCartVisitor {
	
	int visit(FoodItem foodItem);
	int visit(StationeryItem stationeryItem);


}
