//1/ The code that violates the principle.

class ConditionElement{
	protected String value;
	protected String type;
	
	public ConditionElement(String value, String type){
		this.setValue(value);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean validValue() {

		if (type.equals("Expression")) {
			if (this.value.isEmpty() || this.value.length() <= 0){
				return false;
			} 
			else if (!((this.value.equals(Character.toString('('))) || (this.value.equals(Character.toString(')'))))) {
				return false;
			}			
		} else (type.equals("Operator")){
			if (this.value.isEmpty() || this.value.length() <= 0){
				return false;
			}
			else if (!(isLogicalOperator(this.value) || isOperator(this.value))) {
				return false;
			}
		}
		return true;
	}
}

public class main {
	
	public static void main(String[] args) {
		private List<ConditionElement> _lstElements = new ArrayList<ConditionElement>();
		_lstElements.add(new ConditionElement("(","Expression"));
		_lstElements.add(new ConditionElement("AND","Operator"));
		for (element : _lstElements) {
			element.validValue();
		}
	}
}

//2/ The code to fix that violation.

class ConditionElement{
	protected String value;
	protected String type;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean validValue() {
		return true;
	}
}

class Expression extends ConditionElement{
		
	public Expression (String value) {
		this.value = value;
	}
	
	public boolean validValue() {
		if (this.value.isEmpty() || this.value.length() <= 0) return false;
		else if (!((this.value.equals(Character.toString('('))) || (this.value.equals(Character.toString(')'))))) {
			return false;
		}
		this.type = "Expression";
		return true;
	}
}


class Operator extends ConditionElement{
	
	public Operator (String value) {
		this.value = value;
	}
	
	public boolean validValue() {
		if (this.value.isEmpty() || this.value.length() <= 0) return false;
		else if (!(isLogicalOperator(this.value) || isOperator(this.value))) {
			return false;
		}
		this.type = "Operator";
		return true;
	}	
}

public class main {
	
	public static void main(String[] args) {
		private List<ConditionElement> _lstElements = new ArrayList<ConditionElement>();
		_lstElements.add(new Expression("("));
		_lstElements.add(new Operator("AND"));
		for (element : _lstElements) {
			element.validValue();
		}
	}
}