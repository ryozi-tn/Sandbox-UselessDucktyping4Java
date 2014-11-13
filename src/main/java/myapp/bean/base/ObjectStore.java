package myapp.bean.base;

import java.util.Map;

public interface ObjectStore {
	default Object _get(Class<?> clazz) {
		return _store().get(clazz);
	}

	default void _set(Class<?> clazz, Object object) {
		_store().put(clazz, object);
	}

	Map<Class<?>, Object> _store();
}
