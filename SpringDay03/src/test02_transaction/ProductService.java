package test02_transaction;

import java.util.Date;
import java.util.Random;

public class ProductService {
	private int saleQuantity = 1;
	private String buyer = "seoyee";
	private Date saleDate = new Date();
	private int productNum = 2;

	private ProductDao dao = new ProductDao();

	public void saleProduct() {
		try {
			dao.startTransaction();
			dao.updateProductQuantity(productNum, saleQuantity);
			if (new Random().nextBoolean()) {
				throw new Exception("어쩌다 괜히 에러남");
			}
			dao.insertSaleRecord(productNum, saleDate, buyer, saleQuantity);
			dao.commitTransaction();
			System.out.println("상품 판매 완료");
		} catch (Exception e) {
			dao.rollbackTransaction();
			System.out.println("상품 판매 실패");
			e.printStackTrace();
		}
	}

}
