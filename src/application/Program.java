package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("==== TEST 1: seller find by ID ====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println("==== TEST 2: seller find by Department ====");
		Department dep = new Department(2, null);
		List<Seller> sellers = sellerDao.findByDepartment(dep);
		System.out.println(sellers);
		
		System.out.println("==== TEST 4: insert seller ====");
		Seller sel = new Seller(null,"Greg","greg@gmail.com", new Date(),4000.0, dep);
		sellerDao.insert(sel);
		
		System.out.println("==== TEST 5: update seller ====");
		seller = sellerDao.findById(1);
		seller.setName("Marta");
		sellerDao.update(seller);
		System.out.println("Update completed");
	}

}
