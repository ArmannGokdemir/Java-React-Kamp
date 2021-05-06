package Abstract;

public interface ProductService {
	void add(Product product);
	void delete(Product product);
	void update(Product product,double price,String name,String details);

}
