package myapp.bean.base;
public interface Name extends ObjectStore {
	default String getName() {
		return (String) _get(Name.class);
	}

	default void setName(String object) {
		_set(Name.class, object);
	}
}
