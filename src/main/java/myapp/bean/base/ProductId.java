package myapp.bean.base;

public interface ProductId extends ObjectStore {
	default String getProductId() {
		return (String) _get(ProductId.class);
	}

	default void setProductId(String object) {
		_set(ProductId.class, object);
	}
}
