package learn.iteratorpattern.dinermergecafe;

import java.util.Iterator;
import java.util.List;

public class Waitress {

	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}

	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}

	public void printMenu() {
		Iterator<Menu> menusIterator = this.menus.iterator();
		while (menusIterator.hasNext()) {
			Menu menu = (Menu) menusIterator.next();
			printMenu(menu.createIterator());
			System.out.println();
		}

	}

	public void printBreakfastMenu() {
		Iterator<MenuItem> pancakeIterator = this.pancakeHouseMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
	}

	public void printLunchMenu() {
		Iterator<MenuItem> pancakeIterator = this.dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREAKFAST");
		printMenu(pancakeIterator);
	}

	public void printVegetarianMenu() {
		printVegetarianMenu(pancakeHouseMenu.createIterator());
		printVegetarianMenu(dinerMenu.createIterator());
	}

	public boolean isVegetarianMenu(String name, Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.getName().equals(name)) {
				if (menuItem.isVegetarian()) {
					return true;
				}
			}
		}
		return false;
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}

	private void printVegetarianMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			if (menuItem.isVegetarian()) {
				System.out.print(menuItem.getName() + ", ");
				System.out.print(menuItem.getPrice() + " -- ");
				System.out.println(menuItem.getDescription());
			}
		}
	}

}
