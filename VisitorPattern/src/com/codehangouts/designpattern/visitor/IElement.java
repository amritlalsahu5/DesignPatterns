package com.codehangouts.designpattern.visitor;

public interface IElement {
	public int accept(IShoppingCartVisitor visitor);
}
