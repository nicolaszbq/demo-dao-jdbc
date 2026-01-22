package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		/*
		 Seller sel = new Seller(null,"Greg","greg@gmail.com", new Date(),4000.0, dep);
		 sellerDao.insert(sel);
		*/
		DepartmentDao depjdbc = DaoFactory.createDepartmentDao();
	
		System.out.println("==== TESTE 1 insert department ====");
		Department dep = new Department(null, "Desing");
		depjdbc.insert(dep);

		System.out.println("==== TESTE 2 findById ====");
		Department dep2 = depjdbc.findById(1);
		System.out.println(dep2);
		
		System.out.println("==== TESTE 3 deleteById ====");
		depjdbc.deleteById(8);
		System.out.println("Deletado com sucesso!");
		
		System.out.println("==== TESTE 4 findall ====");
		List<Department> departments = depjdbc.findAll();
		
		for(Department d : departments) {
			System.out.println(d);
			System.out.println();
		}
	}

}
