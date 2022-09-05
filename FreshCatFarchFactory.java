package adv12;

import java.util.Objects;

public class FreshCatFarchFactory {

	public String name1;
	public int cats;
	@Override
	public int hashCode() {
		return Objects.hash(cats, name1);
	}
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FreshCatFarchFactory other = (FreshCatFarchFactory) obj;
		return cats == other.cats && Objects.equals(name1, other.name1);
	
	}
}
