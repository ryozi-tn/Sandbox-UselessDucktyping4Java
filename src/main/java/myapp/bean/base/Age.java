package myapp.bean.base;

public interface Age extends ObjectStore {

	public default Integer getAge() {
		return (Integer) _get(Age.class);
	}

	public default void setAge(Integer object) {
		_set(Age.class, object);
	}

}
