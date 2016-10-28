package yarnandtail.andhow;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @author eeverman
 */
public class ParamMutable implements Param {

	private ParamDefinition def;
	private String fullArg;
	private String name;
	private String value;
	private Boolean valid;

	public ParamMutable() {
	}

	public ParamMutable(ParamDefinition def, String fullArg, String name, String value, Boolean valid) {
		this.def = def;
		this.fullArg = fullArg;
		this.name = name;
		StringUtils.trimToNull(value);
		this.valid = valid;
	}
	
	@Override
	public ParamDefinition getParamDefinition() {
		return def;
	}

	public void setType(ParamDefinition type) {
		this.def = type;
	}

	@Override
	public String getOriginalText() {
		return fullArg;
	}

	public void setFullArg(String fullArg) {
		this.fullArg = fullArg;
	}
	
	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public Boolean isValid() {
		return valid;
	}

	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	
	@Override
	public Param toImmutable() {
		return new ParamImm(def, fullArg, name, value, valid);
	}

}
