/**
 * 
 */
package com.swg.acs.message.datamodel;

/**
 * @author satriaprayoga
 *
 */
public interface DataModelItem {

	public DataModelItem getNext();
	public Object getValue();
	public boolean isNumberIdentifier();
	public boolean isAliasIdentifier();
	public boolean isMultiInstanceIdentifier();
	public boolean hasNext();
}
