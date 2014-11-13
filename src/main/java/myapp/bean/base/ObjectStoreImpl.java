package myapp.bean.base;

import java.util.HashMap;
import java.util.Map;

public class ObjectStoreImpl implements ObjectStore {

	HashMap<Class<?>, Object> map = new HashMap<Class<?>, Object>();

	@Override
	public Map<Class<?>, Object> _store() {
		return map;
	}

}
