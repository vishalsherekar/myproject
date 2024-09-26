package Collection;

import java.util.Comparator;

public class EmpNameCompare implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee e3=(Employee) o1;
		Employee e4=(Employee) o2;
		return e3.empName.compareTo(e4.empName);
	}

}
